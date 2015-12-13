package controller;

import main.Main;
import util.JSONParser;
import util.Request;

/**
 * Created by elvan_owen on 11/27/15.
 */
public class PlayerController {
    public static boolean setName(String name){
        Request request = new Request();
        request.setType("player");
        request.setAction("name");
        request.setParameters(name);
//        System.out.println("before");
        request.send();
        return JSONParser.success(gomokumon.Gomokumon.response.getResponse());
        //return false;
    }

    public static boolean move(int x, int y){
        Request request = new Request();
        request.setType("player");
        request.setAction("move");
        request.setParameters(Integer.toString(x) + " " + Integer.toString(y));

        request.send();
        return JSONParser.success(gomokumon.Gomokumon.response.getResponse());
    }
}
