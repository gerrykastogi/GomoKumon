package util;

import main.Main;
import org.json.JSONObject;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by elvan_owen on 11/26/15.
 */
public class Request {
    private static Socket socket;
    private static DataOutputStream os;
    private String type = "";
    private String action = "";
    private String parameters = "";

    static {
        try {
            socket = new Socket("192.168.137.176", 3002);
            os = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException e) {
            System.err.println(e);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to: hostname");
        }
    }

    public void send(){
        try {
            os.writeBytes(type + ":" + action + "~" + parameters + "\n");
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public void setAction(String action){
        this.action = action;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setParameters(String parameters){
        this.parameters = parameters;
    }

    public Socket getSocket(){
        return this.socket;
    }
}
