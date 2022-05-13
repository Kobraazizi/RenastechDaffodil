package student.Ulzana;

import java.util.Arrays;

public class lab02 {

    public static void main(String[] args) {

        System.out.println(buildSame("abc","cab"));
        System.out.println(buildSame("abc","abb"));
    }

    public static boolean buildSame(String first, String second) {
        //(String) Same Letters
        //Write a return method that check if a string is build out of the same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:

        char[] firstString = first.toCharArray();
        char[] secondString = second.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        boolean result = Arrays.equals(firstString, secondString);

        return result;

    }
}
