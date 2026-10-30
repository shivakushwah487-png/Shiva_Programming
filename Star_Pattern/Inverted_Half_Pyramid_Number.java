import java.util.ArrayList;
class Inverted_Half_Pyramid_Number{
public static void main(String[] args){
ArrayList<String> list = new ArrayList<>();

for(int i=1; i<5; i++)
    {
       StringBuilder line = new StringBuilder();
       for(int j=1; j<=i; j++)
       {
          line.append("*"+" ");

       }
        list.add(line.toString());

    }


    for(int i=5; i>=1; i--)
    {
        StringBuilder line = new StringBuilder();
        for(int j=1; j<=i; j++)
        {
            line.append("*"+" ");

        }
        list.add(line.toString());

    }


     for(String p : list)
      {
         System.out.println(p);
      }


}

}