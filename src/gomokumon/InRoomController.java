/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokumon;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * FXML Controller class
 *
 * @author X450
 */
public class InRoomController implements Initializable {
    @FXML
    private TableColumn<Player, String> playersList;
    @FXML
    private Button startGame;
    @FXML
    private TableView<Player> tableView;
    @FXML
    private Button back;
    
    private static TableView<Player> _tableView;
    private static TableColumn<Player, String> _playersList;
    private static Button _startGame;
    private static Initializable _inRoomController;
    private static Stage stage;
    private static Parent root;
    private static Scene scene;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        _tableView = tableView;
        _playersList = playersList;
        _startGame = startGame;
        _inRoomController = this;
        
//        stage=(Stage) back.getScene().getWindow();
//        try {
//            root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//        } catch (IOException ex) {
//            System.out.println(ex);
////            Logger.getLogger(InRoomController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
        
        JSONArray playerArray = controller.RoomController.getPlayers();
        ObservableList<Player> allData = tableView.getItems();
        for (int i = 0;i<playerArray.length();i++){
            try {
                JSONObject obj = playerArray.getJSONObject(i);
                
                Player dR1 = new Player(obj.getInt("id"),obj.getString("name"));
                
                playersList.setCellValueFactory(new PropertyValueFactory<>("name"));
                allData.add(dR1);
            } catch (JSONException ex) {
                Logger.getLogger(ChooseRoomController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
//                stage=(Stage) back.getScene().getWindow();
    }    

    @FXML
    private void backToChooseRoom(MouseEvent event) throws IOException {
        
//        Parent root;
        stage=(Stage) back.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("chooseRoom.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void goToBoard(MouseEvent event) throws IOException {
        System.out.println(tableView.getItems().size());
        if (tableView.getItems().size()<3 || !controller.GameController.start()){
            return;
        }
//        Parent root;
//        stage=(Stage) startGame.getScene().getWindow();
//        root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
//
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//        stage.show();
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //if you change the UI, do it here !
                System.out.println("0");
//                Stage newStage = (Stage) _startGame.getScene().getWindow();
                stage=(Stage) _startGame.getScene().getWindow();
                System.out.println("1");
                try {
                    root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                    //root = FXMLLoader.load(_inRoomController.getClass().getResource("FXMLDocument.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(InRoomController.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println("2");
//                stage.setScene(scene);
                stage.getScene().setRoot(root);
                System.out.println("3");
                stage.setHeight(700);
                stage.setWidth(1000);
                stage.sizeToScene();
//                newStage.show();
                System.out.println("4");
            }
        });
    }
    
    public static void addPlayer(int id,String name) throws IOException{
        System.out.println("ahahaha1");
        ObservableList<Player> allData = _tableView.getItems();
        Player dR1 = new Player(id,name);
        _playersList.setCellValueFactory(new PropertyValueFactory<>("name"));
        allData.add(dR1);
    }
    
    public static void startGame() throws IOException{
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //if you change the UI, do it here !
                System.out.println("0");
//                Stage newStage = (Stage) _startGame.getScene().getWindow();
                stage=(Stage) _startGame.getScene().getWindow();
                System.out.println("1");
                try {
                    root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
                    //root = FXMLLoader.load(_inRoomController.getClass().getResource("FXMLDocument.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(InRoomController.class.getName()).log(Level.SEVERE, null, ex);
                }

                System.out.println("2");
//                stage.setScene(scene);
                stage.getScene().setRoot(root);
                System.out.println("3");
                stage.setHeight(700);
                stage.setWidth(1000);
                stage.sizeToScene();
//                newStage.show();
                System.out.println("4");
            }
        });
    }
}
