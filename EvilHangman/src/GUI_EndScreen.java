import javax.swing.*;

import java.awt.event.*;

public abstract class GUI_EndScreen implements ActionListener {
	
	protected JFrame parentFrame;
	protected JFrame endMessageFrame;
	protected JLabel secretWordLabel;
	protected JLabel gameResultLabel;
	protected JButton returnBtn;
	protected JLabel answerLabel;
	
	public void actionPerformed(ActionEvent e){
        endMessageFrame.dispose();
        parentFrame.dispose();
    	new Start().createAndShowGUI();
    }
}
