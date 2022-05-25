import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public abstract class Average {

    ArrayList<String> numbers;

    public Average(){
        this.numbers = new ArrayList<>();
    }

    public abstract void main();

    public void loop(){
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

    private boolean checkEnd(String input){
        return input.equalsIgnoreCase("end");
    }

    private boolean checkNumber(String num) {
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
