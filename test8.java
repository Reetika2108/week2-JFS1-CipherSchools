import java.util.ArrayList;
import java.util.Comparator;

public class test8 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");

        System.out.println("Array list: " + states);
       

        String str = states.get(2);
        System.out.println("I got " + str);
        
        System.out.println("Array List size: " + states.size());

        for (int i = 0; i < states.size(); i++) {
            System.out.println(states.get(i));
        }

        

        states.set(1, "Texas");
        System.out.println("New States : " + states);

        
        states.remove(3);
        System.out.println("New States: " + states);

        states.sort(Comparator.naturalOrder());
        System.out.println("Array after sorting: " + states);

        System.out.println("Texas is at " + states.indexOf("Texas") + " index.");

        System.out.println("Is NewYork There? " + states.contains("NewYork"));

        System.out.println("Is list empty? " + states.isEmpty());

        states.removeAll(states);
        System.out.println("Is list empty? " + states.isEmpty());
    }
}