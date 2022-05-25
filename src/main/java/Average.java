import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Scanner;

public interface Average {

    ArrayList<String> numbers = new ArrayList<>();

    public void main();

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

    public String scanner();

    boolean checkEnd(String input);

    public boolean checkNumber(String num);
}
