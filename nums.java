import java.util.Scanner;
public class nums {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the NUmber of Element");
    n = sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter "+n+" Element");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int target;
    System.out.println("Enter the target value: ");
    target = sc.nextInt();

    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        System.out.print(i + " ");
        return;
      }
    }
  }
}
