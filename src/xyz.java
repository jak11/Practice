/**
 * Created by kumavatj on 4/9/17.
 */
public class xyz {

    public static void main(String[] args){
        String str1 = "xyzzz";
        String str2 = "xyzzz";
        int m = str1.length();
    int n = str2.length();
        int[][] lcs = new int[m][n];

        for(int i = 0; i < m; ++i)
        {
            for(int j = 0; j < n;++j)
            {
                lcs[i][j] = 0;
            }
        }

        for(int i = 0; i < m; ++i)
        {
            for(int j = 0; j < n;++j)
            {
                if(str1.charAt(i) == str2.charAt(j))
                {
                    if((i-1 >= 0 ) && ( j-1 >= 0))
                    {
                        if(str1.charAt(i-1) == str2.charAt(j-1))
                        {
                            lcs[i][j] = lcs[i-1][j-1]+1;
                        }
                    }
                }
                else
                {

                    if((i-1 >= 0 ) &&( j-1 >= 0))
                    {
                        lcs[i][j] = Math.max(lcs[i][j-1], lcs[i-1][j]);
                    }
                }
            }
        }

    }
}

