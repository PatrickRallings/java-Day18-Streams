import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Divisible {

    public void main(ArrayList<Integer> nums){
        System.out.println(divisibleNumbers(nums));
    }

    private List<Integer> divisibleNumbers(ArrayList<Integer> nums){
        return nums.stream().filter(i -> i % 5 == 0 || i % 3 == 0  || i % 2 == 0 ).collect(Collectors.toList());
    }
}