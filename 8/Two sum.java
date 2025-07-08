import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of element:");
        int n = sc.nextInt();
        System.out.println("Enter a target value:");
        int r = sc.nextInt();
        int[] d = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            d[i] = scanner.nextInt();
        }
        for (int j = 0; j < d.length; j++){
            for (int k = 0; k < d.length; k++){
                if (d[j] + d[k] == r){
                    System.out.println("Indices: " + j + ", " + k);
                    scanner.close();
                    return;
                }
            }
        }
        System.out.println("No valid pair found.");
        scanner.close();
    }
}
