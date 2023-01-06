import java.rmi.*;
import java.rmi.registry.*;
import java.net.*;

public class RmiClient
{
    static public void main(String args[])
    {
        new RmiClient().msg(3232, "Amor");
    }
    public void msg(int serverPort, String text){
        
       String s = "192.168.0.18";
       IClient rmiServer;
       Registry registry;
       String serverAddress = s;
       System.out.println("enviando mensagem \"" + text + "\" para " + serverAddress + ":" + serverPort);
       try
       {
           registry = LocateRegistry.getRegistry(serverAddress,serverPort);
           rmiServer = (IClient)(registry.lookup("rmiServer-" + serverPort));
           rmiServer.sendMensage(text);
       }
       catch(RemoteException e)
       {
          
       }
       catch(NotBoundException e)
       {
          
       }
    }    
}