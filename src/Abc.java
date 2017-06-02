import java.util.Arrays;

/**
 * Created by kumavatj on 4/18/17.
 */
public class Abc {
    public static void main(String[] args){
        String a = "ababxz";
        String b = "zyaabc";

        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        int c =0;
        for (int i =0 ; i< c1.length; i++){
            if(c1[i] != c2[i]){
                c++;
            }
        }

        System.out.print(c);

    }
}
