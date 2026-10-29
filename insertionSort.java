
import java.util.Scanner;

public class insertionSort {
  public static void insertionsort(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j>=0 && arr[j]>key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 6, 8, 9, 7, 5 };
    System.out.println("Befout Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    insertionsort(arr);
    
System.out.println();
    System.out.println("Befout Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

}
