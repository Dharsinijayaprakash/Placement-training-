import java.util.Scanner;
class Solution {
    public static int mySqrt(int x) {
        int i = 0;
        while (i * i <= x) {
            i++;
        }
        return i - 1; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int r = mySqrt(number);
        System.out.println("Square root of " + n + " is: " + r);
        scanner.close();
    }
}

