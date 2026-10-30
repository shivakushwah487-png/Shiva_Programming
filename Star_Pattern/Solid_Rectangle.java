import java.util.ArrayList;

public class Solid_Rectangle {
    public static void main() {
        ArrayList<String> list = new ArrayList<>();
        int m = 4;
        int n = 5;
        for (int i = 1; i <= m; i++) {
            StringBuilder line = new StringBuilder();
            for (int j = 1; j <=n; j++) {
                line.append("*");
            }
     
            list.add(line.toString());
        }
        for (String s : list){
            System.out.print(s);
        }




    }
}
