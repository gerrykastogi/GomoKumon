package controller;

import util.JSONParser;
import util.Request;
import org.json.JSONArray;

/**
 * Created by elvan_owen on 11/26/15.
 */
public class RoomController {
//    Get All available rooms
    public static JSONArray getAllRooms(){
        Request request = new Request();
        request.setType("room");
        request.setAction("retrieve");

        request.send();

        return JSONParser.parseArray(gomokumon.Gomokumon.response.getResponse());
    }

//    Get All players in my room
    public static JSONArray getPlayers(){
        Request request = new Request();
        request.setType("room");
        request.setAction("players");

        request.send();

        return JSONParser.parseArray(gomokumon.Gomokumon.response.getResponse());
    }

//    Enter a room
    public static boolean enter(int roomId){
        Request request = new Request();
        request.setType("room");
        request.setAction("enter");
        request.setParameters(Integer.toString(roomId));

        request.send();
        return JSONParser.success(gomokumon.Gomokumon.response.getResponse());
    }

//    Create a room
    public static boolean create(String roomName){
        Request request = new Request();
        request.setType("room");
        request.setAction("create");
        request.setParameters(roomName);

        request.send();
        return JSONParser.success(gomokumon.Gomokumon.response.getResponse());
    }

//    Leave Current room
    public static boolean leave(){
        Request request = new Request();
        request.setType("room");
        request.setAction("leave");

        request.send();
        return JSONParser.success(gomokumon.Gomokumon.response.getResponse());
    }

}
