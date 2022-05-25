import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public void main(){
        System.out.println("Enter as many inputs as you would like and enter an empty line to stop.");
        List<String> inputList = new ArrayList<>();
        while (true) {
            String input = scanner();
            if (input.equalsIgnoreCase("")) {
                break;
            }
            inputList.add(input);
        }
        inputList.forEach(System.out::println);
    }

    private String scanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
