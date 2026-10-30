import java.util.ArrayList;


public class Half_Pyramid {
    public static void main() {
        ArrayList<String> list = new ArrayList<>();
        int n = 4;
        for (int i = 1; i <=n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                line.append("*");
            }

            list.add(line.toString());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}