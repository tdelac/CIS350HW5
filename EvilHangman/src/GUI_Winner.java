import javax.swing.*;

import java.awt.*;

public class GUI_Winner extends GUI_EndScreen{

	private ImageIcon background;
	private JPanel imagePanel;

	public GUI_Winner(String Letters,JFrame frame){
		parentFrame = frame;
		endMessageFrame = new JFrame("You are the winner!!!");
		bg(endMessageFrame);
		answerLabel = new JLabel("The answer is ");

		secretWordLabel = new JLabel(Letters);
		secretWordLabel.setFont(new Font("Default",Font.PLAIN,23));
		secretWordLabel.setForeground(Color.red);
		gameResultLabel = new JLabel("You are winner!");
		returnBtn = new JButton("Return to the main menu");

		returnBtn.addActionListener(this); 

		endMessageFrame.add(answerLabel);
		endMessageFrame.add(secretWordLabel);
		endMessageFrame.add(gameResultLabel);
		endMessageFrame.add(returnBtn);

		endMessageFrame.setVisible(true);
	}

	public void bg(JFrame frame){
		background = new ImageIcon("Congrats.gif");
		JLabel label = new JLabel(background);

		label.setBounds(0, 0, background.getIconWidth(),
				background.getIconHeight());

		imagePanel = (JPanel) frame.getContentPane();
		imagePanel.setOpaque(false);

		imagePanel.setLayout(new FlowLayout());

		frame.getLayeredPane().setLayout(null);

		frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(background.getIconWidth(), background.getIconHeight());
		frame.setResizable(false);

	}
}