import java.util.Scanner;
import javax.swing.*;
import java.awt.*;

public class PasswordGenerator {

        public  int digit;
        private String lower_case = "qwertyuiopasdfghjklzxcvbnm";
        private String upper_case = "QWERTYUIOPASDFGHJKLZXCVBNM";
        private String symbols = "!@#$%^&*()-_=+[];',./<>?:";
        private String numbers = "1234567890";

        public void MakePassword() {
            for (int i = 0; i < digit; i++) {
                String value = lower_case + upper_case + symbols + numbers + numbers;
                double random = value.length()*Math.random();
                int randomcharacter = (int)random;
                System.out.print(value.charAt(randomcharacter));
            }
        }
    public static void main (String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of password: ");
        try {
            pg.digit = scan.nextInt();
            System.out.print("Your new password is: ");
            pg.MakePassword();
        } catch (Exception ex){
            System.out.println("Please enter a number");
            System.out.println("Try Again");
        }
    }

    }