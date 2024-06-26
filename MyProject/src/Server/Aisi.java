/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author S
 */
public class Aisi {
    public void ServerSnd(String txt){
        int p=1003;
        try{
        Socket s=new Socket("localhost",p);  
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());   
        dout.writeUTF(txt);  
        dout.flush();  
        dout.close();  
        s.close();
        }catch(Exception e){
            
        }   
    }
    public void ServerRec(){
        int p=1002;
        String str;
        try{
        ServerSocket ss=new ServerSocket(p);  
        Socket s=ss.accept();
        DataInputStream din=new DataInputStream(s.getInputStream());  
        str=din.readUTF();
        ServerSnd(str);
        din.close();  
        s.close();  
        ss.close();
        }catch(Exception e){
            
        }
        
    }
    public void funcR(){
            Thread t1 = new Thread(new Runnable() {
            public void run() { 
            ServerRec();
        }});
            t1.start();
            }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        
    }
}
