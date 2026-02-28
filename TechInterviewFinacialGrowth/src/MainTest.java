import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void squareAndSort() {
        int[] testArray = new int[]{-5, -2, 0, 3, 10};
        int[] expected = new int[]{0, 4, 9, 25, 100};
        assertEquals(Arrays.toString(expected), Arrays.toString(Main.squareAndSort(testArray)));

        int[] testArray2 = new int[]{-8, -3, 2, 4, 12};
        int[] expected2 = new int[]{4, 9, 16, 64, 144};
        assertEquals(Arrays.toString(expected2), Arrays.toString(Main.squareAndSort(testArray2)));

        int[] testArray3 = new int[]{14, 22, 14, 300};
        int[] expected3 = new int[]{196, 196, 484, 90000};
        assertEquals(Arrays.toString(expected3), Arrays.toString(Main.squareAndSort(testArray3)));


        int[] testArray4 = new int[0];
        int[] expected4 = new int[0];
        assertEquals(Arrays.toString(expected4), Arrays.toString(Main.squareAndSort(testArray4)));

        int[] testArray5 = new int[]{1,1,1};
        int[] expected5 = new int[]{1,1,1};
        assertEquals(Arrays.toString(expected5), Arrays.toString(Main.squareAndSort(testArray5)));

        int[] testArray6 = new int[]{13};
        int[] expected6 = new int[]{69};
        assertEquals(Arrays.toString(expected6), Arrays.toString(Main.squareAndSort(testArray6)));


    }
}