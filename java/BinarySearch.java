public static int BinarySearch(int[] a, int target) {
  int left = 0, right = a.length -1;
  while (left <= right) {
    int mid = (left + right) / 2;

    if (a[mid] == target)
      return mid;
    else if (a[mid] < target)
      left = mid + 1;
    else
      right = mid -1;
  }
  return -1;
}
