
package lab3in;

import java.io.IOException;


public class TestChatServer
{

  private ChatServer server;
  
  public TestChatServer(int port, int timeout)
  {
    server = new ChatServer();
    try {
      server.setPort(port);
      server.setTimeout(timeout);
      server.listen();
    }catch(IOException e)
    
    {
      e.printStackTrace();
    }
    
  }
  public static void main(String[] args)
  {
    // TODO Auto-generated method stub
    new TestChatServer(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

  }

}
