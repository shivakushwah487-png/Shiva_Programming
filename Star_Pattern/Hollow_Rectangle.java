import java.util.ArrayList;


public class Hollow_Rectangle {
    public static void main() {
        ArrayList<String> list = new ArrayList<>();
        int n = 4;
        int m = 5;
        for (int i = 1; i<=n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j<=m; j++) {
                if (i == 1 || j == 1 || i ==n || j == m) {
                    line.append("*");
                } else {
                    line.append(" ");
                }
            }
            list.add(line.toString());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
