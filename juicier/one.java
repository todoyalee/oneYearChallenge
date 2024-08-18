package ippoForce;

import java.util.Scanner;

public class volg {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int b = sn.nextInt();
        int d = sn.nextInt();

        int sum = 0;
        int count = 0;

        int t[] = new int[n];
        for (int i = 0; i < n; i++) {

            t[i] = sn.nextInt();

            if (t[i] > b) {
                continue;
            } else {
                sum = sum + b;
            }

            if (sum > d) {
                count++;
            }

        }

        System.out.println(count);

    }
}