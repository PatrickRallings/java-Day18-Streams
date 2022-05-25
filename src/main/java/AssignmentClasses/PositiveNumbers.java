package AssignmentClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public void main(ArrayList<Integer> nums){
        System.out.println(positiveNumbers(nums));
    }

    private List<Integer> positiveNumbers(ArrayList<Integer> nums){
        return nums.stream().filter(i -> i > 0).collect(Collectors.toList());
    }
}
