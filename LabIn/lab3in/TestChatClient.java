package lab3in;

import java.io.IOException;

public class TestChatClient
{
    private ChatClient client;
    
    public TestChatClient(String host, int port)
    {
      client = new ChatClient();
      client.setHost(host);
      client.setPort(port);
      try
      {
        client.openConnection();
      } catch (IOException e)
      {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      try
      {
        client.sendToServer("Hello Server");
      } catch (IOException e)
      {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    
    public static void main(String[] args)
    {
      String host = args[0];
      int port = Integer.parseInt(args[1]);
       new TestChatClient(host,port);
    }
    
}
