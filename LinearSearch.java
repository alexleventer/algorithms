public class LinearSearch {
  public static int selectionSort(int[] a, int target) {
    for (int i = 0; i < a.length; i++) {
      if (a[i] == target) {
        return i;
      }
    }
    // Target was not found
    return -1;
  }
}
