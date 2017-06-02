/**
 * Created by kumavatj on 3/19/17.
 */
public class BitString {
    private static int[] A = new int[4];
    public static void main(String[] args){
       // binary(4);
        System.out.println(reversestring("ABZ$!@XABB"));
    }
    static void binary(int n){
        if(n < 1){
            System.out.println(A);
        }else{
            A[n-1]=0;
            binary(n-1);
            A[n-1]=1;
            binary(n-1);
        }
    }

    static String reversestring(String input1){
        char[] input = input1.toCharArray();
        String res = null;
        int i =0, j = input1.length() - 1;
        while (i <= j){
            char one = input[i];
            char two = input[j];
            if( one < 65 || one > 90){
                i++;
                continue;
            }
            if(two < 65 || two > 90){
                j--;
                continue;
            }
            char temp = one;
            input[i] = two;
            input[j] = temp;
            i++;j--;
        }

        return new String(input);
    }
}
