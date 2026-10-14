class shiva{
public static void main(String[] args){
List<String> names = getNameList();
String name = "John Doe";
String list = "";
for (int i = 0; i < names.length; i++) { 
    if (names[i].equals(name)) {
        continue;
    }
}
    list += names[i];
}
}
