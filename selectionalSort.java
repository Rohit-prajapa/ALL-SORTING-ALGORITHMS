import java.util.Scanner;

public class selectionalSort {
  public static void  selectionalsort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int min = i;
      for (int j = i + 1; j < n-1; j++) {
        if (arr[j] < arr[min]) {
          min = j;
        }
      }
      int temp = arr[i];
      arr[i] = arr[min];
      arr[min] = temp;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 6, 5, 2, 7, 3, 8 };
    System.out.println("Befour Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    selectionalsort(arr);
    System.out.println();
    System.out.println("After Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
