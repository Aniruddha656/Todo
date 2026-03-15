import java.util.ArrayList;

public class ListArray
{
    public static void main(String[] args)
    {
        //How to create arraylist
        ArrayList<String> list=new ArrayList<>();
        //How to add elements
        list.add("Aniruddha");
        list.add("Manjrekar");
        list.add("Dinesh");
        //How to insert elements
        list.add(1,"Raj");
        //How to access
        System.out.println(list);
        System.out.println(list.get(3));

    }
}
