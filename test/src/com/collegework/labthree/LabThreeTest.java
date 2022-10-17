package test.src.com.collegework.labthree;

public class LabThreeTest {
    public static void main(String[] args){
        String penis = "I hate you m'lady";
        String word = withoutPunct(penis);
        System.out.println(word);
    }
    public static boolean isPunct(char c) {
        if (c == '\'' || c == ',' || c == '.' || c == ';' || c == ':' || c == '!' || c == '?') {
            return true;
        } else {
            return false;
        }
    }

    public static String withoutPunct(String s) {
        for(int i = s.length()-1; i >= 0; i--) {
            char indChar = s.charAt(i);
            if(isPunct(indChar)) {
                String replaceString = Character.toString(indChar);
                s = s.replace(replaceString, "");
            }
        }
        return s;
    }
}
