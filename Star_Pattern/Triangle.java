package Star_Pattern;

import java.util.ArrayList;

public class Triangle {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        int n=5;
        for (int i = 1; i <=n ; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= i ; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    line.append("1 ");
                } else {
                    line.append("0 ");
                }
            }
            list.add(line.toString());
        }
        for (String p : list){
            System.out.println(p);
        }

    }
}
