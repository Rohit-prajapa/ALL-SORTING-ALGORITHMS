
import java.util.Scanner;

public class QuickSort {
  public static int partition(int arr[], int low, int high) {
    int pi = arr[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
      if (arr[j] <= pi) {
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
  }
  public static void Quicksort(int arr[], int low, int high) {
    if (low < high) {
      int pi = partition(arr, low, high);
      Quicksort(arr, low, pi - 1);
      Quicksort(arr, pi+1, high);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 6, 5, 4, 3, 2, 1 };
    System.out.println("Befour sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    Quicksort(arr, 0, arr.length - 1);

    System.out.println();
    System.out.println("After Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
