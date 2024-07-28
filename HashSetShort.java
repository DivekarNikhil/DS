import com.sun.source.doctree.SeeTree;

import java.util.*;

public class HashSetShort
{
    public static void main(String[] args)
    {
        System.out.println("Creating Hashset ..");

        Set<String> sets=new HashSet();

        sets.add("Nikhil");
        sets.add("Abhi");
        sets.add("Raj");
        sets.add("Shubham");
        sets.add("Viru");
        sets.add("Anish");

        System.out.println("Creating ArrayList...");

        List<String>arrList=new ArrayList<String>(sets);
        Collections.sort(arrList);
        System.out.println("Displaying Shorted Hashset \n"+arrList);


    }
}
