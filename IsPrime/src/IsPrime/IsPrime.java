package IsPrime;

import java.util.Scanner;

public class IsPrime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter number:");
            int Number = input.nextInt();

            if (Number <= 1) {
                System.out.println("Not greater than 1");
            } else {
                boolean prime = true;
                for (int i = 2; i < Number; i++) {
                    if (Number % i == 0) {
                        prime = false;
                        break;
                    }
                }

                if (prime) {
                    System.out.println("Is prime");
                } else {
                    System.out.println("Is not prime");
                }

            }

            System.out.println("Do you want to enter another number? (y/n)");

        } while (input.next().toLowerCase().equals("y"));

    }

}
