class AlphabeticalOrder {
    public static String userName = "julius white v";
    public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    public static int letters = 0;
    public static void main(String[] args) {
        char[] alphabetArray = alphabet.toCharArray();
        char[] userNameArray = userName.toCharArray();
        char[] sortedLong = new char[alphabetArray.length];

        // sorts and puts each letter in big array in order 
        for (int i = 0; i < userNameArray.length; i++) {
            for (int j = 0; j < alphabetArray.length; j++) {
                if (userNameArray[i] == alphabetArray[j]) {
                    sortedLong[j] = userNameArray[i];
                }
            }
        }
    
        for (int i = 0; i < sortedLong.length; i++) {
            if (sortedLong[i] != 0) {
                letters++;
            }
        }
        
        char[] sortedFinal = new char[letters];

        for (int i = 0; i < sortedFinal.length; i++) {
            for (int j = 0; j < sortedLong.length; j++) {
                if (sortedLong[j] != 0) {
                    sortedFinal[i] = sortedLong[j];
                    sortedLong[j] = 0;
                    break;
                }
            }
        }
        System.out.println(sortedFinal);
    }

}