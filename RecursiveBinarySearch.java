public class RecursiveBinarySearch {
  int binarySearch(int[] arr, int key) {
    return binarySearch(arr, 0, arr.length - 1, key);
  }

  int binarySearch(int[] arr, int lo, int hi, int key) {
    if (lo <= hi) {
      int mid = (lo + hi) / 2;
      if (key == arr[mid])
        return mid;
      else if (key < arr[mid])
        return binarySearch(arr, lo, mid - 1, key);
      else if (key > arr[mid])
        return binarySearch(arr, mid + 1, hi, key);
    }
    return -1;
  }
}
