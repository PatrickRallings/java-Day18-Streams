import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfSelectedNumbers implements Average{

    ArrayList<String> numbers;

    public AverageOfSelectedNumbers(){
        this.numbers = new ArrayList<>();
    }

    public void main(){
        System.out.println("Input numbers, type 'end' to stop.");
        loop();
        System.out.println("Would you like the average of your positive or negative numbers? p | n");
        chooseStream(scanner());
    }

    private void loop(){
        while(true){
            String temp = scanner();
            if (!checkEnd(temp)) {
                if(checkNumber(temp))
                    numbers.add(temp);
            }
            else {
                break;
            }
        }
    }

    public String scanner(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public boolean checkEnd(String input){
        return input.equalsIgnoreCase("end");
    }

    public boolean checkNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch(NumberFormatException n) {
            return false;
        }
    }

    private void chooseStream(String input){
        if (input.equalsIgnoreCase("p") || input.equalsIgnoreCase("positive")) {
            System.out.println("The average of your positive numbers is: "+averagePositiveStream());
        } else if (input.equalsIgnoreCase("n") || input.equalsIgnoreCase("negative")){
            System.out.println("The average of your positive numbers is: "+averageNegativeStream());
        } else {
            System.out.println("Sorry, that was an option. Please enter 'n' for negative numbers or 'p' for positive numbers.");
            chooseStream(scanner());
        }
    }

    private double averagePositiveStream(){
        OptionalDouble avg = numbers.stream().mapToDouble(Double::parseDouble).filter(n -> n > 0).average();
        return avg.isPresent() ? avg.getAsDouble() : 0;
    }

    private double averageNegativeStream(){
        OptionalDouble avg = numbers.stream().mapToDouble(Double::parseDouble).filter(n -> n > 0).average();
        return avg.isPresent() ? avg.getAsDouble() : 0;
    }
}
