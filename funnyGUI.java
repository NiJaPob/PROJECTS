import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel; 

public class GUI implements ActionListener{

    private JLabel label;
    private JFrame frame;
    private JButton button;
    public GUI () {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("AMBATUKUM!!!");

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 250, 250));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("HHHHHHHHHH!!!");
        frame.pack();
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Desktop.getDesktop().browse(new URI(""));
        } catch (Exception ex) {
            ex.printStackTrace(); // Print error if URL fails to open
        }
    }
    public static void main(String[] args) {
        new GUI();
    }
}
