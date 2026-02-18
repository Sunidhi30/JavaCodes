public class BinaryNumberWithAlernativeBits {
    public boolean hasAlternatingBits(int n) {
        String str = Integer.toBinaryString(n);
        char start= str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==start){
                System.out.println("Second : "+str.charAt(i));
                System.out.println("First : "+start);
                return false;
            }
            else {
                start=str.charAt(i);
            }
        }
        return true;
    }
}