package lab2in;

import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

public class ChatServer extends AbstractServer
{
  public ChatServer()
  {
    super(12345);
    this.setTimeout(500);
   
  }
  public ChatServer(int port, int timeout)
  {
    super(port);
    this.setTimeout(timeout);
    
  }
  
  public void handleMessageFromClient(Object arg0, ConnectionToClient arg1)
  {
    System.out.println("Client Message sent to Server");
  }
  
  public void listeningException(Throwable exception) 
  {
    System.out.println("Listening Exception Occurred");
    System.out.println(exception);
    exception.printStackTrace();
  }
  public void serverStarted() 
  {
    System.out.println("Server Started");
  }

}
