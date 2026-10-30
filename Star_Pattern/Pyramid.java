package Star_Pattern;

import java.util.ArrayList;

public class Pyramid {
    public static void main() {
        ArrayList<String> list = new ArrayList<>();
        int n = 5;
        for (int i = 1; i <= n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = i; j < n; j++) {
                line.append(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                line.append("*");
            }

            list.add(line.toString());
        }
        int n1 = 4;
        for (int i = n1; i >=1; i--) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= n1-i+1; j++) {
                line.append(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                line.append("*");
            }
//            for (int j = n1-i+1; j <= i; j++) {
//                line.append(" ");
//            }

            list.add(line.toString());


        }
        for (String d : list) {
            System.out.println(d);
        }

    }
}
