package AssignmentClasses;

import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    int birthYear;

    public Person(){
        setFirstName();
        setLastName();
        setBirthYear();
    }

    public Person(String s){
        this.firstName = s;
        setLastName();
        setBirthYear();
    }

    private String scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName() {
        System.out.println("Input first name:");
        this.firstName = scanner();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        System.out.println("Input last name:");
        this.lastName = scanner();
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear() {
        System.out.println("Input birth year:");
        this.birthYear = Integer.parseInt(scanner());
    }
}
