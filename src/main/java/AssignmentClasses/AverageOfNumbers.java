package AssignmentClasses;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public class AverageOfNumbers implements Average {

    ArrayList<String> numbers;

    public AverageOfNumbers(){
        this.numbers = new ArrayList<>();
    }

    public void main(){
        System.out.println("Input numbers, type 'end' to stop.");
        loop();
        System.out.println("The average of your numbers is: "+String.valueOf(averageStream()));
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

    private double averageStream(){
        OptionalDouble avg = numbers.stream().mapToDouble(Double::parseDouble).average();
        return avg.isPresent() ? avg.getAsDouble() : 0;
    }
}
