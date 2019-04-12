package lab3in;

import ocsf.client.AbstractClient;

public class ChatClient extends AbstractClient
{
  public ChatClient()
  {
    super("localhost",12345);
  }
  
  public void connectionException (Throwable exception) 
  {
    System.out.println("Connection Exception Occurred");
    exception.getMessage();
    exception.getStackTrace();
  }
  

  @Override
  protected void handleMessageFromServer(Object msg)
  {
    // TODO Auto-generated method stub
    System.out.println("Server Message sent to Client" + msg);

  }
  
  public void connectionEstablished() 
  {
    System.out.println("Client Connected");
  }

}
