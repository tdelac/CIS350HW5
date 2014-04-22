import javax.swing.*;

import java.awt.event.*;

public class GUI_EndScreen implements ActionListener {
	
	private JFrame endMessageFrame;
	private JFrame parentFrame;
	private JLabel secretWordLabel;
	private JLabel gameResultLabel;
	private JLabel answerLabel;
	private JButton rtnBtn;
	
	public GUI_EndScreen(String Letters, JLabel secWord, String result, 
			JFrame parentFrame, JFrame endMessageFrame){
		this.endMessageFrame = endMessageFrame;
		this.parentFrame = parentFrame;
		
		answerLabel = new JLabel("The answer is");
		secretWordLabel = secWord;
		secretWordLabel.setText(Letters+".");
		gameResultLabel = new JLabel(result);
		rtnBtn = new JButton("Return to the main menu");

		rtnBtn.addActionListener(this); 
		
		endMessageFrame.add(answerLabel);
		endMessageFrame.add(secretWordLabel);
		endMessageFrame.add(gameResultLabel);
		endMessageFrame.add(rtnBtn);
	}
	
	public void actionPerformed(ActionEvent e){
        endMessageFrame.dispose();
        parentFrame.dispose();
    	new Start().createAndShowGUI();
    }
}
