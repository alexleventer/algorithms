public static int[] selectionSort(int[] a) {
  int temp, min;
  for (int i = 0; i < a.length - 1; i++) {
    min = i;
    for (int j = i + 1; j < a.length; i++) {
      if (a[j] < a[min])
        min = j;
    }

    if (min != i) {
      temp = a[i];
      a[i] = a[min];
      a[min] = temp;
    }
  }
}
