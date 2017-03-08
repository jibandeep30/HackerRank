package DataStructures;

import java.util.*;

public class JavaMap {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map m = new HashMap();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            in.nextLine();
            m.put(name, phone);
        }
        System.out.println(m);
        Set keys = m.keySet();
        while (in.hasNext()) {
            String s = in.nextLine();
            if(keys.contains(s))
                
        }
    }

}
