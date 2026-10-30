import java.util.ArrayList;


public class Inverted_Half_Pyramid_2 {
    public static void main() {
        ArrayList<String> list = new ArrayList<>();
        int n = 4;
        for (int i = 1; i<=n; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <=n-i; j++) {
                line.append(" ");
            }
            for (int j=1; j<=i; j++){
                line.append("*");
            }

            list.add(line.toString());
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
