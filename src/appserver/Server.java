/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appserver;

/**
 *
 * @author Abdelmalek
 */

import java.net.*;

import java.io.*;

public class Server 
{	DataInputStream in;
	ServerSocket server ;
	 DataOutputStream out;
	Socket socket ;
	
	/*public Server(int port)
	{
		try {
					 server = new ServerSocket(port);
					
					 socket=server.accept();
					out=new PrintWriter(socket.getOutputStream());
					out.println("vous etes connecté");
					out.flush();
					server.close();
					socket.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
					}
}
        public Server(int port,String msg)
	{
		try {
					 server = new ServerSocket(port);
					
					 socket=server.accept();
					out=new PrintWriter(socket.getOutputStream());
					out.println("\n"+msg);
					out.flush();
					server.close();
					socket.close();
				}
				catch(IOException e)
				{
					e.printStackTrace();
					}
}*/
  public Server(int port)
        {
           try{
                server = new ServerSocket(2000); 
              } 
           catch (IOException e) 
              {
                  
                System.out.println("Could not listen on port 2000");
                System.exit(-1);
              }


              try{
                    socket = server.accept();
              } 
              catch (IOException e) 
              {
                  
                System.out.println("Accept failed: 2000");
                System.exit(-1);
              }


              try
              {
               in = new DataInputStream(socket.getInputStream());
               out = new DataOutputStream(socket.getOutputStream());
              } 
              catch (IOException e)
              {
                System.out.println(" failed");
                System.exit(-1);
              }

              String MyMsg="";

                while(!MyMsg.equals("exit()"))
                {
                    try{
                       MyMsg=in.readUTF();
                         //Send data back to client
                         //out.println(line);
                       } catch (IOException e) {
                         System.out.println("Read failed");
                         System.exit(-1);
                       }
                }
            }
	public String getMyIP()
	{ InetAddress ip; String s="127.0.0.1";
	try{
		ip=InetAddress.getLocalHost();
		s=ip.getHostAddress();
	}
	catch(UnknownHostException e)
	{e.printStackTrace();}
	return s;
	}	
}

