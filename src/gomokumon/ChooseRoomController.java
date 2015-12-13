/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokumon;

import gomokumon.Pair;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
public class ChooseRoomController implements Initializable {
    @FXML
    private Tab createRoomTab;
    @FXML
    private TextField roomNameFXML;
    @FXML
    private Button createRoom;
    @FXML
    private Tab chooseRoomTab;
    //private ListView< ListViewofRoom;
    private ObservableList<detailRooms> roomsdata = FXCollections.observableArrayList();;
    private ArrayList<detailRooms> roomSpec;
    private String roomName;
    @FXML
    private TableColumn<detailRooms, String> rName;
    @FXML
    private TableColumn<detailRooms, String> rMaster;
    @FXML
    private TableColumn<detailRooms, Integer> numPlayers;
    @FXML
    private TableView<detailRooms> tableView;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        JSONArray roomsArray = controller.RoomController.getAllRooms();
        ObservableList<detailRooms> allData = tableView.getItems();
        for (int i = 0;i<roomsArray.length();i++){
            try {
                JSONObject obj = roomsArray.getJSONObject(i);
                
                detailRooms dR1 = new detailRooms();
                dR1.setRoomId(obj.getInt("id"));
                dR1.setRoomName(obj.getString("name"));
                dR1.setRoomMaster(obj.getString("room_master"));
                dR1.setNumPlayers(obj.getInt("num_player"));
                
                rName.setCellValueFactory(new PropertyValueFactory<>("roomName"));
                rMaster.setCellValueFactory(new PropertyValueFactory<>("roomMaster"));
                numPlayers.setCellValueFactory(new PropertyValueFactory<>("numPlayers"));
                allData.add(dR1);
            } catch (JSONException ex) {
                Logger.getLogger(ChooseRoomController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
      
      tableView.setOnMousePressed(new EventHandler<MouseEvent>() {
        @Override 
        public void handle(MouseEvent e) {
           if (e.isPrimaryButtonDown() && e.getClickCount() == 2) {
//              System.out.println();
               
               detailRooms room = tableView.getSelectionModel().getSelectedItem();
               if (!controller.RoomController.enter(room.getRoomId())){
                   return;
               }
               Stage stage; 
                Parent root = null;
                stage = gomokumon.MainMenuController.getStage();
//                stage=(Stage) e.getScene().getWindow();
                try {
                    root = FXMLLoader.load(getClass().getResource("inRoom.fxml"));
                } catch (IOException ex) {
                    Logger.getLogger(ChooseRoomController.class.getName()).log(Level.SEVERE, null, ex);
                }

                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
                
              System.out.println(room.getRoomId());
              
           }
        }
        });
    }      
//        tableView.setOnMousePressed(null);
//        setRowFactory( tv -> {
//           // TableRow<MyType> row = new TableRow<>();
//            row.setOnMouseClicked(event -> {
//                if (event.getClickCount() == 2 && (! row.isEmpty()) ) {
//                    MyType rowData = row.getItem();
//                    System.out.println(rowData);
//                }
//            });
//            return row ;
//        });
//        
//    }    

    
    private String getRoomName(){
        return roomName;
    }

    @FXML
    private void moveToRoom(MouseEvent event) throws IOException {
        roomName = roomNameFXML.getText();
        if (roomName.equals("") || roomName.equals(null) || !controller.RoomController.create(getRoomName())){
            return;
        }
        Stage stage; 
        Parent root;
        stage=(Stage) createRoom.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("inRoom.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
}
