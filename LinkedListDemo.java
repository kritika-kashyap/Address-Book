import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LinkedListDemo <T> {
    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(10);
        a1.add(24);
        a1.add(36);
        a1.add(17);
        a1.add(50);
        a1.add(49);
        a1.add(54);
        a1.add(21);
        a1.add(88);
        a1.add(13);
        a1.add(7);
        a1.add(29);
        a1.add(27);
        a1.add(56);
        a1.add(55);
        a1.add(9);
        a1.add(30);
        a1.add(63);
        a1.add(116);
        a1.add(99);
        a1.add(63);
        a1.add(13);
        a1.add(74);
        a1.add(5);

        // using stream
        // Stream<Integer> a = a1.stream();
        // System.out.println(a);

        // printing stream
        // a.forEach(System.out::println);
        // a.forEach(System.out::println); // Gives exception as stream can only be used once

        // printing arrayList
        // a1.forEach(System.out::println);
        // a1.forEach(System.out::println); // no such exception 

        // sort the array but keep the insertion order
        // either we create another array and display the sorted one or go to each element and print it
        // one, we will only print numbers, not array
        // other will give double

        // a1.stream().sorted().forEach(System.out::println); // sorted 
        // System.out.println(a1);

        // using comparator function
        // a1.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        // System.out.println(a1);

        // a1.stream().sorted((a, b) -> a - b).forEach(System.out::println);
        // System.out.println(a1); // Ascending order

        // need only the first five small numbers
        // a1.stream().sorted().limit(5).forEach(System.out::println);
        // System.out.println(a1);
        
        // removes duplicates
        // a1.stream().sorted().distinct().forEach(System.out::println);
        // System.out.println(a1);

        // want to find the odd numbers
        // a1.stream().filter(i -> i%2 != 0).sorted().distinct().forEach(System.out::println); 
        // System.out.println(a1);

        // want to put everything into another arrayList
        // List<Integer> updatedList = a1.stream().filter(i -> i%2 != 0).sorted().distinct().toList();
        // List<Integer> updatedList = a1.stream().filter(i -> i%2 != 0).sorted().distinct().collect(Collectors.toList());
        // System.out.println(updatedList);

        // want to add 5 to every number and store
        // List<Integer> updatedList = a1.stream().filter(i -> i%2 != 0).map(i -> i + 5).sorted().distinct().toList();
        // System.out.println(updatedList);

        // known as Basic Stream Functionalities
    }

    LinkedList<T> migrateList = new LinkedList<>();

    // public void migrate(AddressBook<T> a) {  
    //     for(T c: a.adBook) {
    //         migrateList.add(c);
    //     }

    // }

    public void printMigratedList() {
        migrateList.display();
    }
}
