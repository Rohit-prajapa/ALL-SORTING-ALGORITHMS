import java.util.Scanner;
public class bubbleSort {
  public static void bubbleSort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 2, 4, 6, 5, 3, 9 };
    System.out.println("=========Befour Sorting=========");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
    bubbleSort(arr);
    System.out.println();
    System.out.println("=======After Sorting========");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
