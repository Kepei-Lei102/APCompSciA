public class BaronP359 {

    public static int numLetters (String s) {
        int num = 0;
        for (char ch: s.toCharArray()){
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                num ++;
        }
        return num;
    }

    public static int numDigits (String s) {
        int num = 0;
        for (char ch: s.toCharArray()) {
            if (ch >= '0' && ch <= '9')
                num ++;
        }
        return num;
    }

    public static int numSymbols (String s) {
        int length = s.length();
        return length - numDigits(s) - numLetters(s);
    }
}
