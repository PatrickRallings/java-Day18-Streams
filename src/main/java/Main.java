import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
//        //Average of Numbers Assignment
//        AverageOfNumbers avg = new AverageOfNumbers();
//        avg.main();
//
//        //Average of Selected Numbers Assignment
//        AverageOfSelectedNumbers avgS = new AverageOfSelectedNumbers();
//        avgS.main();

        //Positive Numbers Assignment
        ArrayList<Integer> nums = new ArrayList();
        nums.add(3);
        nums.add(-1);
        nums.add(1);
        nums.add(30);
        nums.add(-16);
        PositiveNumbers pos = new PositiveNumbers();
        pos.main(nums);
    }
}
