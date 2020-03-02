/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appserver;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Abdelmalek
 */
public class AppServerController implements Initializable {

    /**
     * Initializes the controller class.
     */
    /*DataInputStream in;
   
    DataOutputStream out;*/
     ServerSocket server ;
    InputStreamReader in;
    PrintWriter out;
    BufferedReader  bf,str;
    Socket socket ;
    @FXML
     Button BtnSend;
    @FXML
     TextField msg;
    @FXML
     TextArea zone;           
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       String MyMsg="";
        try{
                server = new ServerSocket(2200); 
               
                 
                 out = new PrintWriter(socket.getOutputStream(),true);
                System.out.println("Client Connected");
                in = new InputStreamReader(socket.getInputStream());
                bf=new BufferedReader(in);
                str=new BufferedReader(new InputStreamReader(System.in));
                
               socket = server.accept();
              String userInput;
while ((userInput = str.readLine()) != null) {
    out.println(userInput);
    System.out.println("echo: " + bf.readLine());
}

              // Initiate conversation with client
              
              

              
               
               
            } 
       catch (IOException e) 
              {
                  
                System.out.println(" erreorrr ");
               
              }


           

            
        
        BtnSend.setOnAction((event) -> {
           
           String MsgOut="";
           MsgOut=msg.getText();
           zone.setText(zone.getText()+"   \n"+MsgOut);
           out.println(MsgOut);
           out.flush();
           
                   
             
              
          
        });
        /* while(!MyMsg.equals("exit"))
                {
                    System.out.println("2");
                    
           try {
               MyMsg=in.readUTF();
           } catch (IOException ex) {
               Logger.getLogger(AppServerController.class.getName()).log(Level.SEVERE, null, ex);
           }
                       zone.setText(zone.getText()+" \n"+MyMsg);
                         //Send data back to client
                         //out.println(line);
                      System.out.println("3");
                }
        */
        // TODO
     
    
}}
