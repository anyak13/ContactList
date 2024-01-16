import java.util.ArrayList;
import java.util.Scanner;
public class ContactList {
    private ArrayList<Person> contacts;

    public ContactList() {
        contacts = new ArrayList<Person>();
    }

    public ArrayList<Person> getContacts() {
        return contacts;
    }

    public void addContact() {
        System.out.println("Select a type of contact to add: \n 1. Student \n 2. Worker");
        
    }

    public void printContacts() {
        for (int i = 0; i < contacts.size(); i++)
        {
            System.out.println(contacts.get(i));
        }
    }

    public void sort (int soryBy) {

    }

    public void listStudents() {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i) instanceof Student)
            {
                System.out.println(contacts.get(i));
            }
        }
    }

    public void run() {
        System.out.println("Welcome to your contact list \n Please pick from the following menu options");
        System.out.println("Menu: ");
        System.out.println("\n 1. Add Contact \n 2. List All Contacts By First Name \n 3. List All Contacts By Last Name" +
                "\n 4. List All Contacts By Phone Number \n 5. List All Students \n 6. Search By First Name" +
                " \n 7. Search By Last Name \n 8. Search By Phone Number \n 0. Exit");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


    }
}
