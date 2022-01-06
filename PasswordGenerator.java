import java.util.Scanner;
import java.swing.*;

class PasswordGenerator {

        public int digit;
        private String lower_case = "qwertyuiopasdfghjklzxcvbnm";
        private String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
        private String symbols = "!@#$%^&*()-_=+[];',./<>?:";

        void go() {
            for (int i = 0; i < digit; i++) {
                String value = lower_case + upper_case + symbols;
                double random = value.length()*Math.random();
                int randomcharacter = (int)random;
                System.out.print(value.charAt(randomcharacter));

            }
        }
    }
    public static void main (String[] args) {

        JFrame frame = new JFrame();
        JTextBox textbox = new JTextBox("Enter Length of Password");
        frame.getContentPane().add(textbox);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PasswordGenerator pg = new PasswordGenerator();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of password: ");
        pg.digit = scan.nextInt();
        System.out.print("Your new password is: ");
        pg.go();
    }
}

