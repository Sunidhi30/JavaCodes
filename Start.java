
public class Start {
   
        public static void main(String[] args) {
            // MathUtils math = new MathUtils();
            // System.err.println("Result "+ math.add(4, 5));

            //leetcode 1200 
        // MinimumAbsoluteDifference obj = new MinimumAbsoluteDifference();

        // int[] arr = {4, 2, 1, 3};

        // List<List<Integer>> answer = obj.minimumAbsDifference(arr);

        // System.out.println(answer);
    //     ReverseBits bits = new ReverseBits();
    //    int n = 43261596; 
    //   int result= bits.reverseBits(n);
    //   System.out.println("Result"+ result);

    BinaryNumberWithAlernativeBits bits = new BinaryNumberWithAlernativeBits();
    int n = 11;
    boolean ans = bits.hasAlternatingBits(n);
    System.out.println("ans: "+ans);

        }

}
