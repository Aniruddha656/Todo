import java.util.ArrayList;

public class ListArray
{
    public static void main(String[] args)
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("Aniruddha");
        list.add("Manjrekar");
        list.add("Dinesh");
        list.add(1,"Raj");
        System.out.println(list);
        System.out.println(list.get(3));
    }
}
