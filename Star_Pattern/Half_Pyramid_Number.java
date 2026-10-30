import java.util.ArrayList;
class Half_Pyramid_Number{
public static void main(String[] args){
ArrayList<String> list = new ArrayList<>();
int n=4;
for(int i=1; i<=n; i++)
    {
       StringBuilder line = new StringBuilder();
       for(int j=1; j<=i; j++)
       { 
          line.append(j);
        
       }
        list.add(line.toString());

    }
     
     for(String p : list)
      {
         System.out.println(p);
      }
}

}