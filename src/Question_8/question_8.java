package Question_8;

import java.util.Scanner;
import java.util.Arrays;

public class question_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers of cells n: ");
        int n = scanner.nextInt();
        int[] a = new int[n];
        int [] b = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value of array " + i + ": ");
            a[i] = scanner.nextInt();

        }
        int min = a[0];
        for(int i=0; i<n;i++) {
            min = a[0];
            if(min>a[i]) {
                min = a[i];
            }
        }
        int z = b[0];
        for(int i=0; i<n;i++) {
            if(a[i]!= min) {
                  b[z]= a[i];
                  z++;
            }
        }
        System.out.println("Original array: " + Arrays.toString(a));
        System.out.println("Min: " + min);
       System.out.println("New array: " + Arrays.toString(b));
    }
}
