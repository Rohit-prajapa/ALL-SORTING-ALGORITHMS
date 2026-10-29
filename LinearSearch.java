
import java.util.Scanner;
public class LinearSearch {
  public static int linearsearch(int[] arr, int target) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        return i;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 1, 3, 5, 7, 9, 11 };
    int target = 9;
    int result = linearsearch(arr, target);
    if (result > -1) {
      System.out.println("Element found at Index :" + result);
    }
    else {
      System.out.println("Element is not Found");
    }
  }
}
