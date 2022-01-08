import java.util.Scanner;
import javax.swing.*;
import java.awt.*;


public class PasswordGenerator {

        public  int digit;
        private String lower_case = "qwertyuiopasdfghjklzxcvbnm";
        private String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
        private String symbols = "!@#$%^&*()-_=+[];',./<>?:";

        public String MakePassword() {
            for (int i = 0; i < digit; i++) {
                String value = lower_case + upper_case + symbols;
                double random = value.length()*Math.random();
                int randomcharacter = (int)random;
                System.out.print(value.charAt(randomcharacter));
            }
        }

    /// edit the main() to allow for a smoother implementation of GUI
    public static void main (String[] args) {
        Gui guibox = new Gui();
        PasswordGenerator pg = new PasswordGenerator();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of password: ");
        try {
            pg.digit = scan.nextInt();
            pg.MakePassword();
            System.out.print("Your new password is: ");
            pg.MakePassword();
        } catch (Exception ex){
            System.out.println("Please enter a number");
            System.out.println("Try Again");
        }
    }
}

class Gui implements ActionListener {
    public JTextfield userText;

    public Gui() implements ActionListener {

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
    button.addActionListener(this);
    button.setBounds(110, 80, 120, 20);
    panel.add(button);
    frame.setVisible(true);
    }

    void actionPreformed(ActionEvent e) {
        PasswordGenerator pg = new PasswordGenerator();
        pg.digit = userText.getText();
        pg.MakePassword();
    }
}