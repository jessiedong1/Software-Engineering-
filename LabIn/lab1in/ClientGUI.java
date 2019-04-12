package lab1in;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClientGUI extends JFrame
{
  private JLabel status;
  private JLabel notcon;
  private JButton connect;
  private JButton submit;
  private JButton stop;
  
  public ClientGUI(String title)
  {
    int i = 0;
    
    this.setTitle(title);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    //ADD YOUR CODE HERE TO CREATE THE STATUS JLABEL AND THE JBUTTONS
   
   status = new JLabel("Status: ");
   notcon = new JLabel("Not Connected");
   notcon.setForeground(Color.RED);
   
   
   connect = new JButton ("Connect");
   submit = new JButton("Submit");
   stop = new JButton("Stop");
   
   //add panels
   JPanel north = new JPanel();
   JPanel south = new JPanel();
   this.setLayout(new BorderLayout());
   this.getContentPane().add(north, BorderLayout.NORTH);
   this.getContentPane().add(south, BorderLayout.SOUTH);
   
   //Add buttons and labels
   north.add(status);
   north.add(notcon);
   south.add(connect);
   south.add(submit);
   south.add(stop);
   
   
   north.setLayout(new FlowLayout(FlowLayout.CENTER));
   south.setLayout(new FlowLayout(FlowLayout.CENTER));
   
  connect.addActionListener(new EventHandler());
  submit.addActionListener(new EventHandler());
  stop.addActionListener(new EventHandler());
  
   
   setSize(500,500);
   setVisible(true);
   
    
  }
  
  public static void main(String[] args)
  {
    new ClientGUI(args[0]); //args[0] represents the title of the GUI
  }

  private class EventHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e)
    {
      // TODO Auto-generated method stub
      if(e.getActionCommand() == "Connect")
      {
        System.out.println("Connect Button Pressed");
        
        
      }
      else if (e.getActionCommand() == "Submit")
      {
        System.out.println("Submit Button Pressed");
       
      }
      else if(e.getActionCommand() == "Stop")
      {
        System.out.println("Stop Button Pressed");
        
      }
      else
      {
        System.out.println("Not Connected");
        
        
      }
    }
    
    
  }
}
