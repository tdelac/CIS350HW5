import javax.swing.*;

import java.awt.*;

public class GUI_Loser extends GUI_EndScreen{

	public GUI_Loser(String Letters, JFrame frame){  
        parentFrame = frame;
        endMessageFrame = new JFrame("You are the loser!");
        endMessageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        endMessageFrame.setSize(new Dimension(300,470));
        endMessageFrame.setLayout(new FlowLayout());
        
        secretWordLabel = new JLabel("The answer is "+Letters+".");
        gameResultLabel = new JLabel("You are the Loser!");
        returnBtn = new JButton("Return to the main menu");
        
        returnBtn.addActionListener(this); 
        
        ImageIcon icon = new ImageIcon("loser.gif"); 
        JLabel loserPic = new JLabel(icon);
      
        endMessageFrame.add(secretWordLabel);
        endMessageFrame.add(gameResultLabel);
        endMessageFrame.add(returnBtn);
        endMessageFrame.add(loserPic);
        
        endMessageFrame.setVisible(true);
    }
}