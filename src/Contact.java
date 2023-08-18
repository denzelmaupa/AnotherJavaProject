import java.util.ArrayList;
import java.util.List;

public class Contact {
    public static List<Contact> contacts = new ArrayList<Contact>();
    public static Contact getContact(String searchString){
        boolean isFound = contacts.contains(searchString);
        if (isFound){
            System.out.println(Contact.contacts.get());
        }
    }
    private String email;
    private String phone;

    public Contact(String email, String phone) {
        this.email = email;
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
