import javax.swing.*;
import java.awt.*;

public class GUI_Winner extends GUI_EndScreen{
    private static JFrame congratulationsFrame = new JFrame("You are the winner!!!");;
    private ImageIcon background;
    private JPanel imagePanel;
    private static JLabel secretWordLabel = new JLabel();
    
    public GUI_Winner(String Letters,JFrame frame){
    	super(Letters, secretWordLabel, "You are the winner!!!", frame, congratulationsFrame);
        bg(congratulationsFrame);
        secretWordLabel.setFont(new Font("Default",Font.PLAIN,23));
        secretWordLabel.setForeground(Color.red);

        congratulationsFrame.setVisible(true);
    }

    public void bg(JFrame frame)
    {
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