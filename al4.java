import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class al4 {

    public static void main(String[] args) {

        Scanner sPn = new Scanner(System.in);

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the elements: ");

        while (sPn.hasNextInt()) {

            al.add(sPn.nextInt());

        }

        Collections.sort(al);

        for (int i = 0; i < al.size(); i++) {

            System.out.print(al.get(i) + " ");

        }

    }
}