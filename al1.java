import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class al1 {

        public static void main(String[] args) {

            Scanner sOn = new Scanner(System.in);

            System.out.println("Enter the length of the arraylist: ");

            int n = sOn.nextInt();

            ArrayList<Integer> al = new ArrayList<>();

            System.out.println("Enter the elements of arraylist: ");

            for (int i = 0; i < n; i++) {

                al.add(sOn.nextInt());

            }

            System.out.println("Enter the element to be inserted: ");

            int x = sOn.nextInt();

            al.add(0, x);

            for (int k = 0; k < al.size(); k++) {

                System.out.print(al.get(k) + " ");

            }
        }

}