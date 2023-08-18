public class Main {
    public static void main(String[] args) {
       Contact.contacts.add(new Contact("denzel@gmail.com", "12344321"));
       Contact.contacts.add(new Contact("denzel@gmail.com", "12344321"));
       Contact.contacts.add(new Contact("denzel@gmail.com", "12344321"));
       Contact.contacts.add(new Contact("denzel@gmail.com", "12344321"));
       Contact.contacts.add(new Contact("denzel@gmail.com", "12344321"));
       Contact.contacts.add(new Contact("denzel@gmail.com", "12344321"));
       Contact.contacts.add(new Contact("denzel@gmail.com", "12344321"));
        System.out.println("Welcome to my Contact Manager");
        System.out.println("You have " + Contact.contacts.size() + " contacts on your list.");
    }
}