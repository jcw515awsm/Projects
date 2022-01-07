import javax.swing.*;
import java.awt.*;

public class gui{

    public static void main(String[] args) {

        JFrame frame = new JFrame("Password Generator by Julius White V");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.setSize(400, 300);
        frame.add(panel);
        panel.setLayout(null);
        JLabel userLabel = new JLabel("Enter Password Length:");
        userLabel.setBounds(90,30, 160, 25);
        panel.add(userLabel);
        JTextField userText = new JTextField();
        userText.setBounds(235,30,30,25);
        panel.add(userText);
        JButton button = new JButton();
        button.setBounds(110, 80, 120, 20);
        panel.add(button);
        frame.setVisible(true);
    }
}