package controller;

import main.Main;
import util.JSONParser;
import util.Request;

/**
 * Created by elvan_owen on 12/1/15.
 */
public class GameController {
    public static boolean start(){
        Request request = new Request();
        request.setType("room");
        request.setAction("start");

        request.send();
        return JSONParser.success(gomokumon.Gomokumon.response.getResponse());
    }
}
