package ippoForce;

import java.util.Scanner;

public class volg {
    public static void main(String[] args) {

        // read weights;

        Scanner sn = new Scanner(System.in);

        int a = sn.nextInt();
        int b = sn.nextInt();

        System.out.println(weight(a, b));

    }

    public static int weight(int a, int b) {
        int count = 0;

        for (int i = 0; i < 200; i++) {
            a = a * 3;
            b = b * 2;
            count++;
            if (a > b) {
                break;
            }
        }

        return count;

    }
}