//Mariam Mohamed
//20216133


import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int N = input.nextInt();
 
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = input.nextInt();
        }
 
        for (int i = 0; i < N; i++) {
            if (A[i] > 0) {
                A[i] = 1;
            } else if (A[i] < 0) {
                A[i] = 2;
            }
        }
 
        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
