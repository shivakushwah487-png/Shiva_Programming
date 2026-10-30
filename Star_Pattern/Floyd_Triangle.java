package Star_Pattern;

import java.util.ArrayList;

public class Floyd_Triangle {
    public static void main() {
        ArrayList<String> list = new ArrayList<>();
        int n = 5;
        int Number = 1;
        for (int i = 1; i <= n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                line.append(Number+" ");
                Number++;
            }
            list.add(line.toString());
        }

        for(String p : list){
            System.out.println(p);
        }
    }
}