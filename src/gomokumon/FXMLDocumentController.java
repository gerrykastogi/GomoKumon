/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokumon;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author X450
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Label label0_0;
    @FXML
    private Label label0_1;
    @FXML
    private Label label0_2;
    @FXML
    private Label label0_3;
    @FXML
    private Label label0_4;
    @FXML
    private Label label0_5;
    @FXML
    private Label label0_6;
    @FXML
    private Label label0_7;
    @FXML
    private Label label0_8;
    @FXML
    private Label label0_9;
    @FXML
    private Label label0_10;
    @FXML
    private Label label0_11;
    @FXML
    private Label label0_12;
    @FXML
    private Label label0_13;
    @FXML
    private Label label0_14;
    @FXML
    private Label label0_15;
    @FXML
    private Label label0_16;
    @FXML
    private Label label0_17;
    @FXML
    private Label label0_18;
    @FXML
    private Label label0_19;
    @FXML
    private Label label1_0;
    @FXML
    private Label label1_1;
    @FXML
    private Label label1_2;
    @FXML
    private Label label1_3;
    @FXML
    private Label label1_4;
    @FXML
    private Label label1_5;
    @FXML
    private Label label1_6;
    @FXML
    private Label label1_7;
    @FXML
    private Label label1_8;
    @FXML
    private Label label1_9;
    @FXML
    private Label label1_10;
    @FXML
    private Label label1_11;
    @FXML
    private Label label1_12;
    @FXML
    private Label label1_13;
    @FXML
    private Label label1_14;
    @FXML
    private Label label1_15;
    @FXML
    private Label label1_16;
    @FXML
    private Label label1_17;
    @FXML
    private Label label1_18;
    @FXML
    private Label label1_19;
    @FXML
    private Label label2_0;
    @FXML
    private Label label2_1;
    @FXML
    private Label label2_2;
    @FXML
    private Label label2_3;
    @FXML
    private Label label2_4;
    @FXML
    private Label label2_5;
    @FXML
    private Label label2_6;
    @FXML
    private Label label2_7;
    @FXML
    private Label label2_8;
    @FXML
    private Label label2_9;
    @FXML
    private Label label2_10;
    @FXML
    private Label label2_11;
    @FXML
    private Label label2_12;
    @FXML
    private Label label2_13;
    @FXML
    private Label label2_14;
    @FXML
    private Label label2_15;
    @FXML
    private Label label2_16;
    @FXML
    private Label label2_17;
    @FXML
    private Label label2_18;
    @FXML
    private Label label2_19;
    @FXML
    private Label label3_0;
    @FXML
    private Label label3_1;
    @FXML
    private Label label3_2;
    @FXML
    private Label label3_3;
    @FXML
    private Label label3_4;
    @FXML
    private Label label3_5;
    @FXML
    private Label label3_6;
    @FXML
    private Label label3_7;
    @FXML
    private Label label3_8;
    @FXML
    private Label label3_9;
    @FXML
    private Label label3_10;
    @FXML
    private Label label3_11;
    @FXML
    private Label label3_12;
    @FXML
    private Label label3_13;
    @FXML
    private Label label3_14;
    @FXML
    private Label label3_15;
    @FXML
    private Label label3_16;
    @FXML
    private Label label3_17;
    @FXML
    private Label label3_18;
    @FXML
    private Label label3_19;
    @FXML
    private Label label4_0;
    @FXML
    private Label label4_1;
    @FXML
    private Label label4_2;
    @FXML
    private Label label4_3;
    @FXML
    private Label label4_4;
    @FXML
    private Label label4_5;
    @FXML
    private Label label4_6;
    @FXML
    private Label label4_7;
    @FXML
    private Label label4_8;
    @FXML
    private Label label4_9;
    @FXML
    private Label label4_10;
    @FXML
    private Label label4_11;
    @FXML
    private Label label4_12;
    @FXML
    private Label label4_13;
    @FXML
    private Label label4_14;
    @FXML
    private Label label4_15;
    @FXML
    private Label label4_16;
    @FXML
    private Label label4_17;
    @FXML
    private Label label4_18;
    @FXML
    private Label label4_19;
    @FXML
    private Label label5_0;
    @FXML
    private Label label5_1;
    @FXML
    private Label label5_2;
    @FXML
    private Label label5_3;
    @FXML
    private Label label5_4;
    @FXML
    private Label label5_5;
    @FXML
    private Label label5_6;
    @FXML
    private Label label5_7;
    @FXML
    private Label label5_8;
    @FXML
    private Label label5_9;
    @FXML
    private Label label5_10;
    @FXML
    private Label label5_11;
    @FXML
    private Label label5_12;
    @FXML
    private Label label5_13;
    @FXML
    private Label label5_14;
    @FXML
    private Label label5_15;
    @FXML
    private Label label5_16;
    @FXML
    private Label label5_17;
    @FXML
    private Label label5_18;
    @FXML
    private Label label5_19;
    @FXML
    private Label label6_0;
    @FXML
    private Label label6_1;
    @FXML
    private Label label6_2;
    @FXML
    private Label label6_3;
    @FXML
    private Label label6_4;
    @FXML
    private Label label6_5;
    @FXML
    private Label label6_6;
    @FXML
    private Label label6_7;
    @FXML
    private Label label6_8;
    @FXML
    private Label label6_9;
    @FXML
    private Label label6_10;
    @FXML
    private Label label6_11;
    @FXML
    private Label label6_12;
    @FXML
    private Label label6_13;
    @FXML
    private Label label6_14;
    @FXML
    private Label label6_15;
    @FXML
    private Label label6_16;
    @FXML
    private Label label6_17;
    @FXML
    private Label label6_18;
    @FXML
    private Label label6_19;
    @FXML
    private Label label7_0;
    @FXML
    private Label label7_1;
    @FXML
    private Label label7_2;
    @FXML
    private Label label7_3;
    @FXML
    private Label label7_4;
    @FXML
    private Label label7_5;
    @FXML
    private Label label7_6;
    @FXML
    private Label label7_7;
    @FXML
    private Label label7_8;
    @FXML
    private Label label7_9;
    @FXML
    private Label label7_10;
    @FXML
    private Label label7_11;
    @FXML
    private Label label7_12;
    @FXML
    private Label label7_13;
    @FXML
    private Label label7_14;
    @FXML
    private Label label7_15;
    @FXML
    private Label label7_16;
    @FXML
    private Label label7_17;
    @FXML
    private Label label7_18;
    @FXML
    private Label label7_19;
    @FXML
    private Label label8_0;
    @FXML
    private Label label8_1;
    @FXML
    private Label label8_2;
    @FXML
    private Label label8_3;
    @FXML
    private Label label8_4;
    @FXML
    private Label label8_5;
    @FXML
    private Label label8_6;
    @FXML
    private Label label8_7;
    @FXML
    private Label label8_8;
    @FXML
    private Label label8_9;
    @FXML
    private Label label8_10;
    @FXML
    private Label label8_11;
    @FXML
    private Label label8_12;
    @FXML
    private Label label8_13;
    @FXML
    private Label label8_14;
    @FXML
    private Label label8_15;
    @FXML
    private Label label8_16;
    @FXML
    private Label label8_17;
    @FXML
    private Label label8_18;
    @FXML
    private Label label8_19;
    @FXML
    private Label label9_0;
    @FXML
    private Label label9_1;
    @FXML
    private Label label9_2;
    @FXML
    private Label label9_3;
    @FXML
    private Label label9_4;
    @FXML
    private Label label9_5;
    @FXML
    private Label label9_6;
    @FXML
    private Label label9_7;
    @FXML
    private Label label9_8;
    @FXML
    private Label label9_9;
    @FXML
    private Label label9_10;
    @FXML
    private Label label9_11;
    @FXML
    private Label label9_12;
    @FXML
    private Label label9_13;
    @FXML
    private Label label9_14;
    @FXML
    private Label label9_15;
    @FXML
    private Label label9_16;
    @FXML
    private Label label9_17;
    @FXML
    private Label label9_18;
    @FXML
    private Label label9_19;
    @FXML
    private Label label10_0;
    @FXML
    private Label label10_1;
    @FXML
    private Label label10_2;
    @FXML
    private Label label10_3;
    @FXML
    private Label label10_4;
    @FXML
    private Label label10_5;
    @FXML
    private Label label10_6;
    @FXML
    private Label label10_7;
    @FXML
    private Label label10_8;
    @FXML
    private Label label10_9;
    @FXML
    private Label label10_10;
    @FXML
    private Label label10_11;
    @FXML
    private Label label10_12;
    @FXML
    private Label label10_13;
    @FXML
    private Label label10_14;
    @FXML
    private Label label10_15;
    @FXML
    private Label label10_16;
    @FXML
    private Label label10_17;
    @FXML
    private Label label10_18;
    @FXML
    private Label label10_19;
    @FXML
    private Label label11_0;
    @FXML
    private Label label11_1;
    @FXML
    private Label label11_2;
    @FXML
    private Label label11_3;
    @FXML
    private Label label11_4;
    @FXML
    private Label label11_5;
    @FXML
    private Label label11_6;
    @FXML
    private Label label11_7;
    @FXML
    private Label label11_8;
    @FXML
    private Label label11_9;
    @FXML
    private Label label11_10;
    @FXML
    private Label label11_11;
    @FXML
    private Label label11_12;
    @FXML
    private Label label11_13;
    @FXML
    private Label label11_14;
    @FXML
    private Label label11_15;
    @FXML
    private Label label11_16;
    @FXML
    private Label label11_17;
    @FXML
    private Label label11_18;
    @FXML
    private Label label11_19;
    @FXML
    private Label label12_0;
    @FXML
    private Label label12_1;
    @FXML
    private Label label12_2;
    @FXML
    private Label label12_3;
    @FXML
    private Label label12_4;
    @FXML
    private Label label12_5;
    @FXML
    private Label label12_6;
    @FXML
    private Label label12_7;
    @FXML
    private Label label12_8;
    @FXML
    private Label label12_9;
    @FXML
    private Label label12_10;
    @FXML
    private Label label12_11;
    @FXML
    private Label label12_12;
    @FXML
    private Label label12_13;
    @FXML
    private Label label12_14;
    @FXML
    private Label label12_15;
    @FXML
    private Label label12_16;
    @FXML
    private Label label12_17;
    @FXML
    private Label label12_18;
    @FXML
    private Label label12_19;
    @FXML
    private Label label13_0;
    @FXML
    private Label label13_1;
    @FXML
    private Label label13_2;
    @FXML
    private Label label13_3;
    @FXML
    private Label label13_4;
    @FXML
    private Label label13_5;
    @FXML
    private Label label13_6;
    @FXML
    private Label label13_7;
    @FXML
    private Label label13_8;
    @FXML
    private Label label13_9;
    @FXML
    private Label label13_10;
    @FXML
    private Label label13_11;
    @FXML
    private Label label13_12;
    @FXML
    private Label label13_13;
    @FXML
    private Label label13_14;
    @FXML
    private Label label13_15;
    @FXML
    private Label label13_16;
    @FXML
    private Label label13_17;
    @FXML
    private Label label13_18;
    @FXML
    private Label label13_19;
    @FXML
    private Label label14_0;
    @FXML
    private Label label14_1;
    @FXML
    private Label label14_2;
    @FXML
    private Label label14_3;
    @FXML
    private Label label14_4;
    @FXML
    private Label label14_5;
    @FXML
    private Label label14_6;
    @FXML
    private Label label14_7;
    @FXML
    private Label label14_8;
    @FXML
    private Label label14_9;
    @FXML
    private Label label14_10;
    @FXML
    private Label label14_11;
    @FXML
    private Label label14_12;
    @FXML
    private Label label14_13;
    @FXML
    private Label label14_14;
    @FXML
    private Label label14_15;
    @FXML
    private Label label14_16;
    @FXML
    private Label label14_17;
    @FXML
    private Label label14_18;
    @FXML
    private Label label14_19;
    @FXML
    private Label label15_0;
    @FXML
    private Label label15_1;
    @FXML
    private Label label15_2;
    @FXML
    private Label label15_3;
    @FXML
    private Label label15_4;
    @FXML
    private Label label15_5;
    @FXML
    private Label label15_6;
    @FXML
    private Label label15_7;
    @FXML
    private Label label15_8;
    @FXML
    private Label label15_9;
    @FXML
    private Label label15_10;
    @FXML
    private Label label15_11;
    @FXML
    private Label label15_12;
    @FXML
    private Label label15_13;
    @FXML
    private Label label15_14;
    @FXML
    private Label label15_15;
    @FXML
    private Label label15_16;
    @FXML
    private Label label15_17;
    @FXML
    private Label label15_18;
    @FXML
    private Label label15_19;
    @FXML
    private Label label16_0;
    @FXML
    private Label label16_1;
    @FXML
    private Label label16_2;
    @FXML
    private Label label16_3;
    @FXML
    private Label label16_4;
    @FXML
    private Label label16_5;
    @FXML
    private Label label16_6;
    @FXML
    private Label label16_7;
    @FXML
    private Label label16_8;
    @FXML
    private Label label16_9;
    @FXML
    private Label label16_10;
    @FXML
    private Label label16_11;
    @FXML
    private Label label16_12;
    @FXML
    private Label label16_13;
    @FXML
    private Label label16_14;
    @FXML
    private Label label16_15;
    @FXML
    private Label label16_16;
    @FXML
    private Label label16_17;
    @FXML
    private Label label16_18;
    @FXML
    private Label label16_19;
    @FXML
    private Label label17_0;
    @FXML
    private Label label17_1;
    @FXML
    private Label label17_2;
    @FXML
    private Label label17_3;
    @FXML
    private Label label17_4;
    @FXML
    private Label label17_5;
    @FXML
    private Label label17_6;
    @FXML
    private Label label17_7;
    @FXML
    private Label label17_8;
    @FXML
    private Label label17_9;
    @FXML
    private Label label17_10;
    @FXML
    private Label label17_11;
    @FXML
    private Label label17_12;
    @FXML
    private Label label17_13;
    @FXML
    private Label label17_14;
    @FXML
    private Label label17_15;
    @FXML
    private Label label17_16;
    @FXML
    private Label label17_17;
    @FXML
    private Label label17_18;
    @FXML
    private Label label17_19;
    @FXML
    private Label label18_0;
    @FXML
    private Label label18_1;
    @FXML
    private Label label18_2;
    @FXML
    private Label label18_3;
    @FXML
    private Label label18_4;
    @FXML
    private Label label18_5;
    @FXML
    private Label label18_6;
    @FXML
    private Label label18_7;
    @FXML
    private Label label18_8;
    @FXML
    private Label label18_9;
    @FXML
    private Label label18_10;
    @FXML
    private Label label18_11;
    @FXML
    private Label label18_12;
    @FXML
    private Label label18_13;
    @FXML
    private Label label18_14;
    @FXML
    private Label label18_15;
    @FXML
    private Label label18_16;
    @FXML
    private Label label18_17;
    @FXML
    private Label label18_18;
    @FXML
    private Label label18_19;
    @FXML
    private Label label19_0;
    @FXML
    private Label label19_1;
    @FXML
    private Label label19_2;
    @FXML
    private Label label19_3;
    @FXML
    private Label label19_4;
    @FXML
    private Label label19_5;
    @FXML
    private Label label19_6;
    @FXML
    private Label label19_7;
    @FXML
    private Label label19_8;
    @FXML
    private Label label19_9;
    @FXML
    private Label label19_10;
    @FXML
    private Label label19_11;
    @FXML
    private Label label19_12;
    @FXML
    private Label label19_13;
    @FXML
    private Label label19_14;
    @FXML
    private Label label19_15;
    @FXML
    private Label label19_16;
    @FXML
    private Label label19_17;
    @FXML
    private Label label19_18;
    @FXML
    private Label label19_19;
    
    private static HashMap<Integer,String> playerImg ;
    private static boolean myTurn;
    private static int myId;
    private static int remove;
    private static ArrayList<Pair<Integer,String>> players;
    private static ArrayList<Pair<Integer,Integer>> filled = new ArrayList<>();
    private static ArrayList<Integer> dummydata = new ArrayList<>();
    private static ObservableList<String> data = FXCollections.observableArrayList();
    private static GridPane _GridPane;
    private static FXMLDocumentController _FXMLDocumentController;
    private static Label _winnerStatus;
    
    @FXML
    private ListView<String> ListViewofPlayer;
    
    @FXML
    private AnchorPane AnchorPane;
    @FXML
    private GridPane GridPane;
    @FXML
    private Button exit;
    @FXML
    private Label winnerStatus;
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
//    public void addPic(ActionEvent event) {
//        System.out.println("You clicked me!");
//        label0_0.setGraphic(new ImageView(new Image(getClass().getResourceAsStream("megacharizardX.png"))));
//        
//        
//    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        Scene scene = new Scene(AnchorPane,1000,700);
//        scene.getStylesheets().addAll(this.getClass().getResource("assets/style.css").toExternalForm());
//        primaryStage.setScene(scene);
//        primaryStage.show();
        System.out.println("~~~~JUST STARTED");
        System.out.println(data);
        
        BackgroundImage myBI= new BackgroundImage(new Image("gomokumon/blue.jpg",1000,700,false,true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
          BackgroundSize.DEFAULT);
        AnchorPane.setBackground(new Background(myBI));
        myBI= new BackgroundImage(new Image("gomokumon/pokebubble.png",1000,700,false,true),
        BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT,
          BackgroundSize.DEFAULT);
        GridPane.setBackground(new Background(myBI));
        myId = 0;
        remove = 0;
        _GridPane = GridPane;
        _FXMLDocumentController = this;
        _winnerStatus = winnerStatus;
        
        ArrayList<String> pictureList = new ArrayList<>();
        pictureList.add("megacharizardX.png");
        pictureList.add("pikachu.png");
        pictureList.add("megaVenusaur.png");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JSONArray playerArray = controller.RoomController.getPlayers();
        System.out.println("** PLAYERS FROM SERVER **");
        System.out.println(playerArray.toString());
        players = new ArrayList<>();
        
//        ObservableList<Player> allData = tableView.getItems();
        playerImg = new HashMap<>();
        for (int i = 0;i<playerArray.length();i++){
            try {
                JSONObject obj = playerArray.getJSONObject(i);
                
                Pair<Integer,String> dR1 = new Pair(obj.getInt("id"), obj.getString("name"));
                
                System.out.println(i);
                System.out.println(dR1);
                
                playerImg.put(obj.getInt("id"), pictureList.get(i));
                players.add(dR1);
            } catch (JSONException ex) {
                System.out.println(ex);
                Logger.getLogger(ChooseRoomController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println(playerImg);
        System.out.println(players);
//        Pair<Integer,String> player1 = new Pair(0,"CChron");
//        Pair<Integer,String> player2 = new Pair(1,"Pikachu");
//        Pair<Integer,String> player3 = new Pair(2,"Charizard");
//        Pair<Integer,String> player4 = new Pair(3,"Venusaur");
//        Pair<Integer,String> player5 = new Pair(4,"Blastoise");
//        Pair<Integer,String> player6 = new Pair(5,"Mew");
//        Pair<Integer,String> player7 = new Pair(6,"Mewtwo");
//        Pair<Integer,String> player8 = new Pair(6,"Snivy");
//        Pair<Integer,String> player9 = new Pair(6,"Dialga");
//        Pair<Integer,String> player10 = new Pair(6,"Palkia");
//        Pair<Integer,String> player11 = new Pair(6,"Lugia");
//        Pair<Integer,String> player12 = new Pair(6,"Ho-oh");
//        Pair<Integer,String> player13 = new Pair(6,"Zapdos");
//        
//        
//        players.add(player1);
//        players.add(player2);
//        players.add(player3);
//        players.add(player4);
//        players.add(player5);
//        players.add(player6);
//        players.add(player7);
//        players.add(player8);
//        players.add(player9);
//        players.add(player10);
//        players.add(player11);
//        players.add(player12);
//        players.add(player13);
        
        System.out.println(data);
        
        for(int i =0;i<players.size();i++){
            System.out.println("players i:" + i);
            if (players.get(i).getFirst() == gomokumon.Gomokumon.playerId){
                //data.add("You");
                data.add(players.get(i).getSecond() + "< YOU >");
                dummydata.add(i);
            }
            else{
                data.add(players.get(i).getSecond());
                dummydata.add(i);
            }
        }
        
        System.out.println("!! DATA");
        System.out.println(data);
        System.out.println(dummydata);
        ListViewofPlayer.setItems(data);
        ListViewofPlayer.setStyle("-fx-background-color: transparent;");
//        playerImg = new HashMap<>();
//        playerImg.put(0, "megacharizardX.png");
//        playerImg.put(1, "pikachu.png");
//        playerImg.put(2, "megaVenusaur.png");
//        playerImg.put(3, "");
//        playerImg.put(4, "");
//        playerImg.put(5, "");
//        playerImg.put(6, "");
    }

    @FXML
    private void addPic(MouseEvent event) {
        System.out.println("Inside add pic");
        if (!myTurn){
            return;
        }
        
            Label a = (Label)event.getSource();
            int x = GridPane.getRowIndex(a);
            int y = GridPane.getColumnIndex(a);
            for (Pair P:filled){
                if (P.equals(new Pair(x,y))){
                    return;
                }
            }
            
            if (!controller.PlayerController.move(x, y)){
                return;
            }
            
            remove++;
            Image img= new Image(getClass().getResourceAsStream(playerImg.get(gomokumon.Gomokumon.playerId)));
            ImageView IV = new ImageView(img);
            IV.setStyle("-fx-alignment: Center;");
            IV.setFitHeight(a.getPrefHeight());
            IV.setFitWidth(a.getPrefWidth());
            a.setGraphic(IV);
            //myId++;
            //myId %= playerImg.size();
            updatePlayerList();            
    }
    
    private static void updatePlayerList(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //if you change the UI, do it here !
                System.out.println("Updating player list");
                int temp = dummydata.get(0);
                String top = data.get(0);
                int i = 0;
                while (i < data.size()-1){
                    data.set(i, data.get(i+1));
                    dummydata.set(i,dummydata.get(i+1));
                    i++;
                }
                data.set(data.size()-1,top);
                dummydata.set(dummydata.size()-1,temp);
            }
        });
        
        
        //System.out.println(top);
//        if (remove == 5){
//            playerDisconnect(2);
//        }
        
        
    }
    
    public static void setOtherPlayerMove(int player_id, int x, int y){
        System.out.println("Inside set other player move " + x + " " + y);
        filled.add(new Pair(x,y));
        playerImg.get(player_id);
        Label _result = null;
        ObservableList<Node> childrens = _GridPane.getChildren();
        for(Node node : childrens) {
            if(_GridPane.getRowIndex(node) == x && _GridPane.getColumnIndex(node) == y) {
                _result = (Label) node;
                break;
            }
        }
        
        final Label result = _result;
        
        System.out.println(playerImg);
        System.out.println("Setting image to " + playerImg.get(player_id));
        System.out.println(result);
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //if you change the UI, do it here !
                Image img= new Image(_FXMLDocumentController.getClass().getResourceAsStream(playerImg.get(player_id)));
                ImageView IV = new ImageView(img);
                IV.setStyle("-fx-alignment: Center;");
                IV.setFitHeight(result.getPrefHeight());
                IV.setFitWidth(result.getPrefWidth());
                result.setGraphic(IV);
            }
        });
        
        
            //myId++;
            //myId %= playerImg.size();
        updatePlayerList();
    }
    
    public static void setTurn(int player_id){
        System.out.println("Setting turn to " + player_id);
        System.out.println("My id is " + gomokumon.Gomokumon.playerId);
        if (player_id == gomokumon.Gomokumon.playerId){
            myTurn = true;
        }
        else{
            myTurn = false;
        }
    }
    
    private void currentPlayer(int player_id){
        if (myId == player_id){
            myTurn = true;
        }
    }
    
    private void setMyId(int player_id){
        myId = player_id;
    }
    
    private static void playerDisconnect(int player_id){
//        for (String dat: data){
//            if ((Integer)data.getFirst() == player_id){
//                players.remove(player);
//            }
//        }
        for (int i = 0;i<data.size();i++){
            if (dummydata.get(i) == player_id ){
                data.remove(i);
                dummydata.remove(i);
            }
        }
    }
    
    public static void setWinner(int player_id, String player_name){
        System.out.println("Setting winner to " + player_name);
        
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //if you change the UI, do it here !
                if (player_id == gomokumon.Gomokumon.playerId){
                    _winnerStatus.setText("You Are The Winner");
                }
                else{
                    _winnerStatus.setText(player_name+" Are The Winner");
                }
                    }
        });
    }

    @FXML
    private void toChooseRoom(MouseEvent event) throws IOException {
        Stage stage; 
        Parent root;
        stage=(Stage) exit.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("chooseRoom.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
    
    
    
    
}
