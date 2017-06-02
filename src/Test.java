/**
 * Created by kumavatj on 3/7/17.
 */
public class Test{
    public static void main(String[] args){
        //System.out.print("Hello");
        int[][] a = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int c=2, r=2;

        int[][] b = new int[4][3];
        for(int i=r; i >= 0; i--) {

            for(int j=0; j <= c; j++){
                int temp = a[i][j];
                a[i][j] = a[j][r-i];
                a[j][r-i] = temp;


               // b[j][r-i] = a[i][j];
                System.out.print(" "+ a[i][j] + " ");

            }
            System.out.println("");
        }

        for(int i=0; i <= 2; i++){
            for(int j=0; j <= 2; j++){
                System.out.print(" " + a[i][j] +" ");
            }
            System.out.println("");
        }


    }

    private static void swap(int i, int i1) {
    }
}


