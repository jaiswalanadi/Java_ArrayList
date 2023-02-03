import java.util.ArrayList;

import java.util.Collections;

import java.util.Scanner;

public class al3 {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the length oD the arraylist: ");

        int n = scn.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the elements oD arraylist: ");

        for(int i = 0; i < n; i++){

            al.add(scn.nextInt());

        }

        System.out.println("Enter the indices to swap the elements oD: ");

        int i = scn.nextInt();

        int j = scn.nextInt();

        int temp = al.get(i);

        Collections.swap(al, i, j);

        for(int k = 0; k < al.size(); k++){

            System.out.print(al.get(k) + " ");

        }

    }

}
