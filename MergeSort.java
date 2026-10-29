
import java.util.Scanner;

public class MergeSort {
  public static void merge(int arr[], int left, int mid, int right) {
      int n1 = mid - left + 1;
        int n2 = right - mid;

        int larr[] = new int[n1];
        int rarr[] = new int[n2];

        // Copy elements into temporary arrays
        for (int i = 0; i < n1; i++) {
            larr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rarr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge both sorted arrays
        while (i < n1 && j < n2) {
            if (larr[i] <= rarr[j]) {
                arr[k] = larr[i];
                i++;
            } else {
                arr[k] = rarr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k] = larr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rarr[j];
            j++;
            k++;
        }
    }
  public static void mergesort(int arr[], int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergesort(arr, left, mid);
      mergesort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = { 6, 5, 4, 3, 2, 1 };

    System.out.println("Befour Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    mergesort(arr, 0, arr.length - 1);

    System.out.println();
    System.out.println("After Sorting");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i]+" ");
    }
  }
}
