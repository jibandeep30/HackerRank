package DataStructures;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT.
         * Your class should be named Solution.
         */
        Scanner s = new Scanner(System.in);
        List l = new ArrayList();
        int no_elements = s.nextInt();
        // System.out.println("No of elements: " + no_elements);
        for (int i = 0; i < no_elements; i++) {
            l.add(s.nextInt());
        }
        // System.out.println("List: " + l);
        int queries = s.nextInt();
        // System.out.println("No of queries: " + queries);
        for (int i = 0; i < queries; i++) {
            String operation = s.next();
            // System.out.println("Operation is : " + operation);
            if (operation.equals("Insert")) {
                int pos = s.nextInt();
                int value = s.nextInt();
                l.add(pos, value);
            }
        }
        Iterator itr = l.iterator();
        while (itr.hasNext())
            System.out.print(itr.next() + " ");
    }

}
