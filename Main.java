import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // AddressBook<BussinessContact> a1 = new AddressBook<>();
        AddressBook<Contact> a1 = new AddressBook<>();
        a1.adBook.add(new Contact("Akshitha", "Kulkarni", "Hyd", "Telangana", "abc", 123, 111));
        a1.adBook.add(new Contact("Angira", "Tiwari", "Mirzapur", "UP", "abc", 123, 111));
        a1.adBook.add(new Contact("Akshaya", "Nalan", "Guntur", "AP", "abc", 123, 111));
        a1.adBook.add(new Contact("Praneet", "Darlanka", "Hyd", "Telangana", "abc", 123, 111));
        a1.adBook.add(new Contact("Akshitha", "Kulkarni", "Hyd", "Telangana", "abc", 123, 111));
        a1.adBook.add(new Contact("Deepa","Pandey","Haldwani","Uttrakhand","abc",123,111));
        a1.adBook.add(new Contact("Priya","Chintagunta","Rajahmundry","AndhraPradesh","xyz",123,111));
        a1.adBook.add(new Contact("Aakriti","Tiwari","Jhansi","Uttar pradesh","abc",145,414));
        a1.adBook.add(new Contact("Komal","Varshney","ALigarh","UttarPradesh","xyz",123,112));
        a1.adBook.add(new Contact("Kritika", "Kashyap", "Patiala", "Punjab", "pqr", 345, 333));

        int i = 1;
        // LinkedListDemo<BussinessContact> l1 = new LinkedListDemo();
        LinkedListDemo<Contact> l1 = new LinkedListDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        do{
            System.out.println("Enter 1 to create contact \n Enter 2 to display all contacts \n Enter 3 to migrate data to linked list \n Enter 4 to display migrated list"); 
            int input = sc.nextInt();

            switch(input) {
                // case 1 -> a1.addContact(createBussinessContact());
                case 1 -> a1.addContact(createContact());
                case 2 -> a1.display();
                // case 3 -> l1.migrate(a1);
                case 3 -> a1.search();
                case 4 -> l1.printMigratedList();
                default -> System.out.println("Wrong input");
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();

        }while(i != 0);

        System.out.println("Thank you for using address book");
        sc.close();
    }

    public static Contact createContact() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter last name");
        String lname = sc.next();
        System.out.println("Enter city");
        String city = sc.next();
        System.out.println("Enter state");
        String state = sc.next();
        System.out.println("Enter email");
        String email = sc.next();
        System.out.println("Enter phone");
        int phone = sc.nextInt();
        System.out.println("Enter zip code");
        int zip = sc.nextInt();
        
        Contact c1 = new Contact(name, lname, city, state, email, phone, zip);
        return c1;
    }
    
    public static BussinessContact createBussinessContact(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Company name ");
        String cname = sc.next();
        System.out.println("Employee Name");
        String ename = sc.next();
        System.out.println("Employee mail");
        String bmail= sc.next();
    
        BussinessContact b1 = new BussinessContact(cname,ename,bmail);
        return b1;
    }
}


