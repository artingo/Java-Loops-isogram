import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void isIsogram_1() {
        String word = "isogram";
        boolean isIsogram = Solution.isIsogram(word);
        assertTrue(isIsogram == true);
    }
    @Test
    void isIsogram_2() {
        String word = "uncopyrightable";
        boolean isIsogram = Solution.isIsogram(word);
        assertTrue(isIsogram == true);
    }

    @Test
    void isIsogram_3() {
        String word = "Digital Career Institute";
        boolean isIsogram = Solution.isIsogram(word);
        assertTrue(isIsogram == false);
    }
}