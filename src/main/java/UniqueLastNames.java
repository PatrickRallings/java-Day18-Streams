import java.util.ArrayList;
import java.util.Scanner;

public class UniqueLastNames {

    ArrayList<Person> personList;
    Scanner scanner = new Scanner(System.in);

    public UniqueLastNames(){
        personList = new ArrayList<Person>();
    }

    public void main(){
        System.out.println("Hello, please enter your personal information below.");
        personList.add(new Person());
        while (true){
            System.out.println("Please enter another person's information below. Enter 'quit' if you are done entering personnel.\nInput first name:");
            String s = scanner.nextLine();
            if (s.equalsIgnoreCase("quit")){
                break;
            } else {
                personList.add(new Person(s));
            }
        }
        System.out.println("You enter the following unique last name (alphabetized):");
        personList.stream().map(Person::getLastName).distinct().sorted().forEach(System.out::println);
    }

}
