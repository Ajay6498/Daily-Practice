public class RemoveBlankS {
    public static void main(String[] args) {
        String s = "Ajay Bawaskar";
        char[] ch = s.toCharArray();

        char[] ch2 = new char[ch.length];
        int j = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {

                ch2[j] = ch[i];
                j++;

            }

        }
        System.out.println(ch2);
    }
}
