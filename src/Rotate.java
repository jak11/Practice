/**
 * Created by kumavatj on 3/7/17.
 */
public class Rotate {
    public static void main(String[] args){

        int[] a = new int[]{1,2,3,4,5};
        int n = a.length;
        int i ,temp =0;
        /*temp = a[0];
        for(i =0; i < n-1; i++){
            a[i]=a[i+1];
        }
        a[i] = temp;*/

        for(int a_i=0; a_i < n; a_i++){
            System.out.print(a[a_i]);
        }

        System.out.println();
        temp = a[n-1];
        for(i =n-1; i > 0; i--){
            a[i] = a[i-1];
        }
        a[i] = temp;

        temp = a[n-1];
        for(i =n-1; i > 0; i--){
            a[i] = a[i-1];
        }
        a[i] = temp;



        for(int a_i=0; a_i < n; a_i++){
            System.out.print(a[a_i]);
        }


    }

}


