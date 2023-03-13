package Bridgelabz;
import java.util.*;
public class Addressbook {
    public static ArrayList<String> contact = new ArrayList<>();
    static Scanner Input = new Scanner(System.in);
    static String firstName,lastName,address,city,state,email,zip,phoneNo;

    AddressBook(String firstName, String lastName, String address, String city, String state, String zip, String phoneNo, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNo = phoneNo;
        this.email = email;
    }
    public String toString(){
        return "First Name = "+firstName+"\nLast Name = "+lastName+"\nAddress = "+address+"\nCity = "+city+"\nstate = "+state+"\nzip = "+zip+"\nphoneNo = "+phoneNo+"\nemail = "+email;
    }

    public static void create() {
        System.out.println("Persons Details ::");
        System.out.println("Enter FirstName = ");
        String firstName = Input.next();
        System.out.println("Enter LastName = ");
        String lastName = Input.next();
        System.out.println("Enter Address = ");
        String address = Input.next();
        System.out.println("Enter City = ");
        String city = Input.next();
        System.out.println("Enter State = ");
        String state = Input.next();
        System.out.println("Enter Zip = ");
        String zip = Input.next();
        System.out.println("Enter PhoneNumber = ");
        String phoneNo = Input.next();
        System.out.println("Enter Email = ");
        String email = Input.next();

        AddressBook student = new AddressBook(firstName, lastName, address, city, state, zip, phoneNo, email);
        System.out.println(student.toString());
    }

    public static void add(){
        contact.add(firstName);
        contact.add(lastName);
        contact.add(address);
        contact.add(city);
        contact.add(state);
        contact.add(zip);
        contact.add(phoneNo);
        contact.add(email);

        System.out.println("contact added Successfully");
        for(String run : contact) {
           System.out.println(run);
         }
    }

    public static void edit(){
        System.out.println("Choose Element to edit and press number accordingly");
        System.out.println("0.firstName ,1.lastName, 2.address, 3.city, 4.state, 5.zip, 6.phoneNo, 7.email");
        int choice = Input.nextInt();

        switch (choice){
            case 0 : contact.set(0,Input.next());break;
            case 1 : contact.set(1,Input.next());break;
            case 2 : contact.set(2,Input.next());break;
            case 3 : contact.set(3,Input.next());break;
            case 4 : contact.set(4,Input.next());break;
            case 5 : contact.set(5,Input.next());break;
            case 6 : contact.set(6,Input.next());break;
            case 7 : contact.set(7,Input.next());break;
            default:
                System.out.println("You made wrong choice");
        }

        System.out.println("contact added Successfully");
        for(String run : contact) {
            System.out.println(run);
        }

    }
    public static void main(String[] args) {
        create();
        add();
        edit();
    }
     }

        

    

