//Mariam Mohamed
//20216133

import java.util.Scanner;
public class Sum{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = 0;
        int count = 0;
        while (count < y) {
        if (x % 2 == 1) {
        sum += x;
        count++;
        }
          x++;
        }
          System.out.println(sum);
        }
        }
    }
