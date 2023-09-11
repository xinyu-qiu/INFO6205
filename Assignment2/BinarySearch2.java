public class BinarySearch2 {
  // Binary search to find the index of target in a rotated sorted array
  public static int searchInRotatedSortedArray(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
      int mid = (left + right) / 2;

      // Target found
      if (arr[mid] == target) {
        return mid;
      }

      if (arr[left] <= arr[mid]) {
        if (arr[left] <= target && target < arr[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (arr[mid] < target && target <= arr[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }
    // Target not found
    return -1;
  }

  public static void main(String[] args) {
    int[] rotatedSortedArray = { 6, 7, 8, 2, 3, 4, 5 };

    int target1 = 8;
    int target2 = 9;
    int index1 = searchInRotatedSortedArray(rotatedSortedArray, target1);
    int index2 = searchInRotatedSortedArray(rotatedSortedArray, target2);

    if (index1 == -1) {
      System.out.println("Target " + target1 + " = " + index1 + " ( " + target1 + " does not exist)");
    } else {
      System.out.println("Target " + target1 + " = " + index1 + " (" + index1 + " is the index of " + target1 + ")");
    }

    if (index2 == -1) {
      System.out.println("Target " + target2 + " = " + index2 + " (" + target2 + " does not exist)");
    } else {
      System.out.println("Target " + target2 + " = " + index2 + " (" + index2 + " is the index of " + target2 + ")");
    }
  }
}
