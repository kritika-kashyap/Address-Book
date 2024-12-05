// import java.util.HashSet;
// import java.util.Set;

public class Dummy {
    public static void main(String[] args) {
        // Contact c1 = new Contact("a","a","a","a","a",9, 3);
        // Contact c2 = new Contact("a","a","a","a","a",9, 3);

        // Set<Contact> list1 = new HashSet<>();
        // list1.add(c1);
        // list1.add(c2);
        // System.out.println(list1);

        // Here, we create object of an interface using lambda
        Printable p1 = (b) -> {
            System.out.println("Hey");
            System.out.println("Somebody is good");
            System.out.println(b);
        };

        Dummy d = new Dummy();
        d.display(p1);
        
    }

    public void display(Printable p) {
        p.print(10);
    }
}
