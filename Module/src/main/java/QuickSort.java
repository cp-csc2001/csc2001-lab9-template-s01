/**
 * Quicksort on an int array, with Lomuto partitioning (as in lecture) and a
 * median-of-three pivot (new in this lab).
 *
 * Do not rename the class, the public methods, or change their
 * parameters/return types. You may add private helper methods.
 * Do not use Arrays.sort or any other library sort in this file.
 */
public class QuickSort {

    /**
     * Sorts the whole array into ascending order.
     * throws IllegalArgumentException if a is null
     */
    public static void quickSort(int[] a) {
        // TODO: check for null, then sort the whole array
    }

    /**
     * Sorts a[lo..hi] into ascending order: if the range has at least two
     * values, calls medianOfThree, then partition, then sorts the values on
     * each side of the pivot recursively. Does nothing if lo >= hi.
     */
    public static void quickSort(int[] a, int lo, int hi) {
        // TODO: base case, medianOfThree, partition, then two recursive calls
    }

    /**
     * Chooses the pivot for a[lo..hi] (lo < hi) and moves it to a[hi]:
     *   1. mid = (lo + hi) / 2
     *   2. if a[mid] < a[lo], swap them
     *      if a[hi]  < a[lo], swap them
     *      if a[hi]  < a[mid], swap them
     *      (now a[lo] <= a[mid] <= a[hi])
     *   3. swap a[mid] and a[hi], so the median of the three is the pivot
     */
    public static void medianOfThree(int[] a, int lo, int hi) {
        // TODO: follow steps 1-3 above exactly - the tests check the array
    }

    /**
     * Lomuto partition, exactly as in lecture: puts the pivot a[hi] in its
     * final place, with every smaller value to its left and every value
     * that is >= the pivot to its right. Returns the pivot's new index.
     */
    public static int partition(int[] a, int lo, int hi) {
        // TODO: Lomuto partition, as in lecture
        return lo;
    }

    /** Exchanges a[i] and a[j]. */
    private static void swap(int[] a, int i, int j) {
        // TODO
    }
}
