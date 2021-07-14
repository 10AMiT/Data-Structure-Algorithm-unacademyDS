package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        for (int i = 0; i <10; i++) {
            System.out.print((5 * (i + 1))+" ");
        }

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(pow(a,b));
    }

    private static long pow(int a, int b) {

        if (b == 0)
            return 1;

        return a * pow(a,b - 1);
    }
}
