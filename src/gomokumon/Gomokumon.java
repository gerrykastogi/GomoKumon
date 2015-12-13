/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokumon;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Listener;
import static main.Main.request;
import util.Request;
import util.Response;

/**
 *
 * @author X450
 */
public class Gomokumon extends Application {
    
    public static Request request;
    public static Response response;
    public static Integer playerId = null;
    public static ArrayList<util.Pair<Integer, String>> players = new ArrayList<>();
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        request = new Request();
        Listener listener = new Listener("ListenerThread");
        try{
            Thread.sleep(1000);
        }
        catch(Exception e){
            
        }
        launch(args);
        
    }
    
}
