import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for QuickSort.
 *
 * Many tests use the example from lecture: 
 *     {38, 27, 43, 3, 9, 82, 3, 10}
 *
 * These starter tests (with these exact names) should all pass by the
 * time you're done. They are NOT enough on their own - add your own
 * tests (see the TODO list at the bottom and the lab handout).
 */
public class QuickSortTest {

    private static int[] lectureExample() {
        return new int[]{38, 27, 43, 3, 9, 82, 3, 10};
    }

    // ---- starter tests ----

    @Test
    void medianOfThreeLectureExample() {
        // a[lo] = 38, a[mid] = a[3] = 3, a[hi] = 10: the median is 10
        int[] a = lectureExample();
        QuickSort.medianOfThree(a, 0, 7);
        assertArrayEquals(new int[]{3, 27, 43, 38, 9, 82, 3, 10}, a);
    }

    @Test
    void partitionLectureExample() {
        // partition alone uses a[hi] = 10 as the pivot, as in lecture
        int[] a = lectureExample();
        assertEquals(3, QuickSort.partition(a, 0, 7));
        assertArrayEquals(new int[]{3, 9, 3, 10, 27, 82, 43, 38}, a);
    }

    @Test
    void quickSortLectureExample() {
        int[] a = lectureExample();
        QuickSort.quickSort(a);
        assertArrayEquals(new int[]{3, 3, 9, 10, 27, 38, 43, 82}, a);
    }

    // TODO: add your own tests. At a minimum, cover:
    //   - medianOfThree on sorted input {1, 2, 3, 4, 5, 6, 7} (see the handout)
    //   - medianOfThree on all six orders of three values, on two values,
    //     and on a range that doesn't start at 0 (only lo, mid, hi change)
    //   - medianOfThree followed by partition on the lecture example and on
    //     sorted input (check both the array and the returned index)
    //   - partition when the pivot is the smallest / largest value, and on a
    //     range that doesn't start at 0
    //   - quickSort: empty array, one value, two values, duplicates,
    //     negatives, a subrange only, and null throwing IllegalArgumentException
    //   - many random arrays compared with Arrays.sort
    //   - a large sorted and a large reverse-sorted array (1,000,000 values)
}
