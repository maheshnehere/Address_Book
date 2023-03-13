package Bridgelabz;
import java.util.*;
public class Addressbook {

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
    public static void main(String[] args) {
        create();
    }
}
    

