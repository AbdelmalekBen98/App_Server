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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Abdelmalek
 */
public class AppServerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button BtnSend;
    @FXML
            private TextField msg;
    Server server;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
        server=new Server(2000);
        BtnSend.setOnAction((event) -> {
            try {
                server.server.close();
            } catch (IOException ex) {
                Logger.getLogger(AppServerController.class.getName()).log(Level.SEVERE, null, ex);
            }
            String S= "MSG : "+msg.getText();
             
              
          
        });
        
        // TODO
    }    
    
}
