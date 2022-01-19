import java.util.Scanner;


class ReverseWord {
    static String word;

    static void reverse() {
        char[] wordarray = word.toCharArray();
        for (int i = 0; i < wordarray.length/2; i++) {
            char temp = wordarray[i];
            wordarray[i] = wordarray[wordarray.length - i - 1];
            wordarray[wordarray.length - i -1] = temp;
        }
        for (char element: wordarray) {
            System.out.print(element);
        }
    }
    public static void main(String[] args) {
        ReverseWord newword = new ReverseWord();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your word: ");

        try{
            newword.word = scan.nextLine();
            System.out.print("Your word reversed is: ");
            newword.reverse();
        }catch (Exception ex) {}
    }
}