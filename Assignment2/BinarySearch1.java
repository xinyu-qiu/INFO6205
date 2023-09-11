public class BinarySearch1 {
  // Binary search to count occurrences of target in sorted array
  public static int countOccurrences(int[] arr, int target) {
    int firstIndex = lowerBoundBinarySearch(arr, target);
    // Target not found
    if (firstIndex == -1) {
      return 0;
    }

    int lastIndex = lowerBoundBinarySearch(arr, target + 1) - 1;
    return lastIndex - firstIndex + 1;
  }

  // Binary search to find the first occurrence of target
  public static int lowerBoundBinarySearch(int[] arr, int target) {
    int left = 0, right = arr.length;
    while (left < right) {
      int mid = (left + right) / 2;
      if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid;
      }
    }
    return left;
  }

  public static void main(String[] args) {
    int[] sortedArray = { 2, 2, 3, 3, 4, 4, 4, 8, 8, 8, 8, 8, 9, 9, 10, 12, 15 };

    int target1 = 4;
    int target2 = 2;
    int target3 = 5;

    System.out.println(
        "Target " + target1 + " = " + countOccurrences(sortedArray, target1) + " Occurrences (Parameter array, "
            + target1 + ")");
    System.out.println("Target " + target2 + " = " + countOccurrences(sortedArray, target2)
        + " Occurrences (Parameter array, " + target2 + ")");
    System.out.println("Target " + target3 + " = " + countOccurrences(sortedArray, target3)
        + " Occurrences (Parameter array, " + target3 + ")");
  }
}
