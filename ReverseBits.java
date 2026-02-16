
public class ReverseBits {
    public int reverseBits(int n) {
        String str = Integer.toBinaryString(n);
        System.out.println(str);
        while(str.length()<32){
             str="0"+str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        System.out.println(sb.toString());
        int ans = Integer.parseInt(sb.toString(), 2);
        return ans;
    }
}

