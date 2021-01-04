package Lab4.IO;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("./src/Lab4/IO/input.txt");
        //System.out.println(phoneBook);
        System.out.println("Abbey " + phoneBook.getByName("Abbey"));
        System.out.println("Abdul " + phoneBook.getByName("Abdul"));
    }
}
