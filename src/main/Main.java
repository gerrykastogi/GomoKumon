package main;

import java.util.Scanner;

import controller.GameController;
import controller.PlayerController;
import controller.RoomController;
import org.json.JSONArray;
import org.json.JSONObject;
import util.Request;
import util.Response;

public class Main {

    public static Request request;
    public static Response response;
    public static Integer playerId = null;

    public static void main(String[] args) {

        request = new Request();
        Listener listener = new Listener("ListenerThread");

//        Pause system for a while making sure all other threads are active
        try{
            Thread.sleep(1000);
        } catch (Exception e){}

//        System Testing
        try {
            boolean nameStatus = PlayerController.setName("Elvan");
            System.out.println("Set Name : " + nameStatus);

            boolean createStatus = RoomController.create("Test-Room");
            System.out.println("Create Room : " + createStatus);

            JSONArray roomsArray = RoomController.getAllRooms();
            System.out.println("*** ROOMS ***");
            System.out.println(roomsArray);
            JSONObject roomsObject = roomsArray.getJSONObject(0);


            boolean enterStatus = RoomController.enter(roomsObject.getInt("id"));
            System.out.println("Enter Room : " + enterStatus);

            System.out.println(RoomController.getPlayers());

            boolean startStatus = GameController.start();
            System.out.println("Game Start : " + startStatus);

            Thread.sleep(10000);

            boolean moveStatus = PlayerController.move(0, 0);
            System.out.println("Move : " + moveStatus);

            Thread.sleep(14000);

            moveStatus = PlayerController.move(0, 0);
            System.out.println("Move : " + moveStatus);

            Thread.sleep(17000);

            moveStatus = PlayerController.move(0, 0);
            System.out.println("Move : " + moveStatus);

            Thread.sleep(19000);

            moveStatus = PlayerController.move(0, 0);
            System.out.println("Move : " + moveStatus);

            Thread.sleep(21000);

            moveStatus = PlayerController.move(0, 0);
            System.out.println("Move : " + moveStatus);
        } catch (Exception e){
            System.out.println(e);
        }

//        Testing Pusposes
//        Scanner scanner = new Scanner(System.in);
//        boolean quit = false;
//
//        while (!quit){
//            System.out.print("Type : ");
//            String type = scanner.nextLine(); // Get what the user types.
//
//            System.out.print("Action : ");
//            String action = scanner.nextLine(); // Get what the user types.
//
//            System.out.print("Parameters : ");
//            String parameters = scanner.nextLine(); // Get what the user types.
//
//            request.setType(type);
//            request.setAction(action);
//            request.setParameters(parameters);
//
//            request.send();
//
//            try{
//                Thread.sleep(1000);
//            } catch (Exception e){}
//
//        }
    }
}

