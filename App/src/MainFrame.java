import java.awt.*;
import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font maiFont = new Font("Segoe print", Font.BOLD, 18);
    JTextField tfFirstName, tfLastName;
    JLabel lbWelcome;

    public void intialize() {
        JLabel lbFirstName = new JLabel("First Name");
        lbFirstName.setFont(maiFont);

        tfFirstName = new JTextField();
        tfFirstName.setFont(maiFont);

        JLabel lbLastName = new JLabel("Last Name");
        lbLastName.setFont(maiFont);

        tfLastName = new JTextField();
        tfLastName.setFont(maiFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(lbFirstName);
        formPanel.add(tfFirstName);
        formPanel.add(tfLastName);
        formPanel.add(lbLastName);

        // welcome label
        lbWelcome = new JLabel();
        lbWelcome.setFont(maiFont);

        JPanel maiPanel = new JPanel();
        maiPanel.setLayout(new BorderLayout());
        maiPanel.setBackground(new Color(128, 128, 255));
        maiPanel.add(formPanel, BorderLayout.NORTH);
        maiPanel.add(lbWelcome, BorderLayout.CENTER);

        // buttons panel
        JButton btnOk = new JButton("Ok");
        setTitle("Welcome");
        setSize(500, 601);
        setMinimumSize(new Dimension(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
