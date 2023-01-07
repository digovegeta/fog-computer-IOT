import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
/**
 *
 * @author digo_
 */
public interface IServer extends Remote{
    public void addServer(String nameServer) throws RemoteException;  
    public void sendMensageServer(String msg) throws RemoteException;
    public void receiveServer(String list) throws RemoteException;
    public boolean ping() throws RemoteException;
}
