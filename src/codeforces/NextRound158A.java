package codeforces;

import java.util.Scanner;

public class NextRound158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int mark = nums[k - 1], count = 0;

        for (int i : nums)
            if (i > 0 && i >= mark)
                count++;

        System.out.println(count);

    }

}
