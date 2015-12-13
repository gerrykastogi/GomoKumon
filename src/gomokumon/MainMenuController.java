/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomokumon;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author X450
 */
public class MainMenuController implements Initializable {
    @FXML
    private TextField username;
    @FXML
    private Button chooseButton;
    private String uName;
    @FXML
    private Label Logo;
    private static Stage stage; 
    /**
     * Initializes the controller class.
     */
    @Override
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Image img= new Image(getClass().getResourceAsStream("pokemon-final.png"));
        ImageView IV = new ImageView(img);
        IV.setStyle("-fx-alignment: Center;");
        IV.setFitHeight(Logo.getPrefHeight());
        IV.setFitWidth(Logo.getPrefWidth());
        Logo.setGraphic(IV);
    }    
    
    private String getUsername(){
        return uName;
    }

    @FXML
    private void moveToChooseRoom(MouseEvent event) throws IOException {
        uName = username.getText();
        if (uName.equals("") || uName.equals(null) || !controller.PlayerController.setName(uName)){
            return;
        }
        
        
        Parent root;
        stage=(Stage) chooseButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("chooseRoom.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
    public static Stage getStage(){
        return stage;
    }

    
    

}
