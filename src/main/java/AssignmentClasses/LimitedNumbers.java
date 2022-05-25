package AssignmentClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {

    public void main(){
        System.out.println("Enter as many positive numbers as you would like and enter a negative number to stop.");
        List<Double> inputList = new ArrayList<>();
        while (true) {
            Double input = scanner();
            if (input < 0) {
                break;
            }
            inputList.add(input);
        }
        inputList.stream().filter(n -> n >=1 && n <= 5).forEach(System.out::println);
    }

    private Double scanner(){
        Scanner scanner = new Scanner(System.in);
        return Double.valueOf(scanner.nextLine());
    }
}