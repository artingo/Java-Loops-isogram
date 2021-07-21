import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String word1 = "isogram";
        System.out.println("word1    = " + word1);
        System.out.println("isogram  = " + isIsogram(word1));

        String word2 = "uncopyrightable";
        System.out.println("\nword2    = " + word2);
        System.out.println("isogram  = " + isIsogram(word2));

        String word3 = "Digital Career Institute";
        System.out.println("\nword3    = " + word3);
        System.out.println("isogram  = " + isIsogram(word3));
    }

    /**
     * Function that takes a string and returns either true or false depending on whether or not it's an "isogram"
     *
     * @param word - a String containing the word
     * @return boolean - is the word an isogram?
     */
    public static boolean isIsogram(String word) {
        word = word.toLowerCase();
        char arr[] = word.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }
}
