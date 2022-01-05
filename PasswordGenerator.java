import java.util.Scanner;

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
        void ask() {
            JFrame frame = new JFrame();
            J

        }
        }
    public static void main (String[] args) {
        PasswordGenerator pg = new PasswordGenerator();
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter length of password: ");
        pg.digit = scan.nextInt();
        System.out.print("Your new password is: ");
        pg.go();
    }

}

