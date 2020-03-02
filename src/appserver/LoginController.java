/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appserver;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdou
 */
public class LoginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML 
    Button BtnLogin;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BtnLogin.setOnAction((event) -> {
           FXMLLoader Loader=new FXMLLoader();
           Loader.setLocation(getClass().getResource("AppServer.fxml"));
            try {
                Loader.load();
                        } catch (IOException ex) {
                Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
            }
           AppServerController server=Loader.getController();
           Parent p= Loader.getRoot();
           Stage stage=new Stage();
           stage.setScene(new Scene(p));
           stage.setTitle("Serveur");
           stage.showAndWait();
           
        });
        // TODO
    }    
    public void changeScene(ActionEvent event) throws IOException
    {
       /* Parent client=FXMLLoader.load(getClass().getResource("AppServer.fxml"));
        Scene ClientScene= new Scene(client);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(ClientScene);
        window.show();*/
        
        }
    
}
