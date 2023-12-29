
// w a program to input String and count special char, white space, uppercase and lowercase letter
public class Count {

    public static void main(String[] args) {
        String str = "Hi @bhay how #are you..!";
        System.out.println(str);
        int whiteSpace = 0, specialChar = 0, upperCase = 0, lowerCase = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isWhitespace(str.charAt(i))) {
                whiteSpace++;
            } else if (Character.isUpperCase(str.charAt(i))) {
                upperCase++;
            } else if (Character.isLowerCase(str.charAt(i))) {
                lowerCase++;
            } else if (!Character.isWhitespace(str.charAt(i)) || !Character.isDigit(str.charAt(i))
                    || !Character.isLetter(str.charAt(i))) {
                specialChar++;
            }

        }

        System.out.println("White Space:" + whiteSpace);
        System.out.println("Special Char:" + specialChar);
        System.out.println("Upper Case:" + upperCase);
        System.out.println("Lower Case:" + lowerCase);
    }

}
