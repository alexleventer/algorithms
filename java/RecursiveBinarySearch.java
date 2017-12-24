public class RecursiveBinarySearch {
  public static int binarySearch(int[] arr, int key) {
    return binarySearch(arr, 0, arr.length - 1, key);
  }
  public static int binarySearch(int[] arr, int lo, int hi, int key) {
    if (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (key == arr[mid])
        return mid;
      else if (key < arr[mid])
        return binarySearch(arr, lo, mid - 1, key);
      else
        return binarySearch(arr, mid + 1, hi, key);
    }
    return -1;
  }
}
