package util;

import controller.PlayerController;
import controller.RoomController;
import main.Main;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Queue;
import java.util.LinkedList;
import util.Pair;
/**
 * Created by elvan_owen on 11/27/15.
 */
public class Response {
    private static Socket socket;
    private static DataInputStream is = null;
    private Queue<String> buffer = new LinkedList<String>();
    private Queue<String> movesBuffer = new LinkedList<String>();
    private Queue<String> playersBuffer = new LinkedList<String>();

    static {
        socket = gomokumon.Gomokumon.request.getSocket();

        try {
            is = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: hostname");
        }
    }

    public String getPlayersMove(){
        boolean empty = true;
        String response = "";

        while (empty){
            response = movesBuffer.poll();

            if (response == null){
//                System.out.println("Waiting for server");
                try{
                    Thread.sleep(1000);
                } catch (Exception e){}
            } else {
                empty = false;
            }
        }

        return response;
    }

    public String getPlayers(){
        boolean empty = true;
        String response = "";

        while (empty){
            response = playersBuffer.poll();

            if (response == null){
//                System.out.println("Waiting for server");
                try{
                    Thread.sleep(1000);
                } catch (Exception e){}
            } else {
                empty = false;
            }
        }

        return response;
    }

    public String getResponse(){
        boolean empty = true;
        String response = "";

        while (empty){
            response = buffer.poll();

            if (response == null){
                System.out.println("Waiting for server");
                try{
                    Thread.sleep(1000);
                } catch (Exception e){}
            } else {
                empty = false;
            }
        }

        return response;
    }

    public void listen(){
        String responseLine;

        try {
            while (true) {
                while ((responseLine = is.readLine()) != null) {
                    boolean systemResponse = false;
                    boolean error = false;

                    try {
                        JSONObject jo = new JSONObject(responseLine);
                        if (jo.getBoolean("system")){
                            systemResponse = true;

                            String type = jo.getString("type");

                            // Notification about another player's move
                            if (type.equals("move")){
                                movesBuffer.add(jo.getString("data"));
                                System.out.println("++" + jo.getString("data") + "++");
                                int playerId = new JSONObject(jo.getString("data")).getInt("player_id");
                                int x = new JSONObject(jo.getString("data")).getInt("x");
                                int y = new JSONObject(jo.getString("data")).getInt("y");
                                System.out.println("Next player id : " + new JSONObject(jo.getString("data")).getInt("next_player_id"));
                                gomokumon.FXMLDocumentController.setTurn(new JSONObject(jo.getString("data")).getInt("next_player_id"));
                                gomokumon.FXMLDocumentController.setOtherPlayerMove(playerId, x, y);

                            // Notification about a new player joined a room
                            } else if (type.equals("player")){
                                playersBuffer.add(jo.getString("data"));
                                
                                if (new JSONObject(jo.getString("data")).getInt("player_id") != gomokumon.Gomokumon.playerId){
                                    gomokumon.InRoomController.addPlayer(new JSONObject(jo.getString("data")).getInt("player_id"), new JSONObject(jo.getString("data")).getString("player_name"));
                                }
                            // Notification about current player's ID
                            } else if (type.equals("id")){
                                gomokumon.Gomokumon.playerId = jo.getJSONObject("data").getInt("id");
                                System.out.println("++" + jo.getJSONObject("data") + "++");

                            // Notification about the winner of the game
                            } else if (type.equals("winner")){
                                System.out.println("YAY ADA WINNER");
                                int winnerId = jo.getJSONObject("data").getInt("id");
                                String winnerName = jo.getJSONObject("data").getString("name");
//                                System.out.println("++" + jo.getJSONObject("data") + "++");
                                System.out.println("YAY ADA WINNER2");
//                                int _winnerId = new JSONObject(jo.getString("data")).getInt("id");
                                System.out.println("YAY ADA WINNER3");
//                                String winnerName = new JSONObject(jo.getString("data")).getString("name");
                                System.out.println("Stting winner in response");
                                System.out.println(winnerId);
                                System.out.println(winnerName);
                                
                                gomokumon.FXMLDocumentController.setWinner(winnerId, winnerName);

                            // Notification about game already started
                            } else if (type.equals("start")){
                                System.out.println("++ Game started ++");
                                System.out.println("Game Opening");
                                gomokumon.InRoomController.startGame();
                                System.out.println("Game Opened");
                                
                                gomokumon.FXMLDocumentController.setTurn(jo.getInt("next_player_id"));
                                System.out.println("Setted to " + jo.getInt("next_player_id"));

                            // Notification about game already ended
                            } else if (type.equals("end")){
                                System.out.println("++ Game ended ++");
                            }
                        }
                    } catch (Exception e){
//                        System.out.println(e);
                        error = true;
//                        System.out.println("ADA ERROR");
                    }

//                    Not system response
                    if (!systemResponse || error){
                        buffer.add(responseLine);
                        System.out.println("< " + responseLine + " >");
                    }
                }

                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Listener interrupted.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
