//Count & Remove Special Charactor from string
public class CountSpecialChar {
    public static void main(String[] args) {
        String str = "Hello S@m how @re you# ";
        int count = 0;
        String removeSpecialChar = " ";
        for (int i = 0; i < str.length(); i++) {

            if (!Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {

                count++;

            } else {
                removeSpecialChar = removeSpecialChar + str.charAt(i);
            }
        }
        System.out.println("No of Special char  : " + count);
        System.out.println("After remove special char : " + removeSpecialChar);
    }
}
