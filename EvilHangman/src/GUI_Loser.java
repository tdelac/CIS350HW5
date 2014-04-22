import javax.swing.*;
import java.awt.*;


public class GUI_Loser extends GUI_EndScreen{
	private static JFrame loserFrame = new JFrame("You are the loser!");

	public GUI_Loser(String Letters, JFrame frame){
		super(Letters, new JLabel(), "You are the Loser!", frame, loserFrame);
		loserFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loserFrame.setSize(new Dimension(300,470));
		loserFrame.setLayout(new FlowLayout());

		ImageIcon icon = new ImageIcon("loser.gif"); 
		JLabel loserPic = new JLabel(icon); 
		
		loserFrame.add(loserPic);
		loserFrame.setVisible(true);
	}
}