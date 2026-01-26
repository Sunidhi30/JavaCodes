import java.util.List;

public class Start {
   
        public static void main(String[] args) {
            // MathUtils math = new MathUtils();
            // System.err.println("Result "+ math.add(4, 5));

            //leetcode 1200 
        MinimumAbsoluteDifference obj = new MinimumAbsoluteDifference();

        int[] arr = {4, 2, 1, 3};

        List<List<Integer>> answer = obj.minimumAbsDifference(arr);

        System.out.println(answer);
        }

}
