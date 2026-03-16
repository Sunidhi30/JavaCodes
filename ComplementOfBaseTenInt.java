public class ComplementOfBaseTenInt {
    public int bitwiseComplement(int n) {
        String binary = Integer.toBinaryString(n);
        String ans="";
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='0'){
                  ans=ans+'1';
            }
            else{
                ans=ans+'0';
            }
        }
        System.out.println(ans);
        int converted= Integer.parseInt(ans,2);
        return converted;
    }
}
