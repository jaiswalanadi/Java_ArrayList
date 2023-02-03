import java.util.ArrayList;

import java.util.Scanner;

public class al2 {

        public static void main(String[] args) {

        Scanner sMn = new Scanner(System.in);

        System.out.println("Enter the length of the arraylist: ");

        int n = sMn.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the elements of arraylist: ");

        for(int i = 0; i < n; i++){

        al.add(sMn.nextInt());

        }

        al.remove(2);

        for(int i = 0; i < al.size(); i++){

        System.out.print(al.get(i) + " ");

        }
        }

}