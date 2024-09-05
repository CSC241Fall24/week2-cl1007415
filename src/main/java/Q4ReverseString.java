// src/main/java/Q4ReverseString.java

public class Q4ReverseString {

    public static String reverse(String s) {
        // TODO: Implement the recursive function to reverse the string
        int num = s.length();
        String temp = "";
        if(num <= 0)
        {
            return temp;
        }else if(num > 0)
        {
            temp = reverse(s.substring(1)) + s.charAt(0);
            num--;
        }
        return temp;
    }
}
