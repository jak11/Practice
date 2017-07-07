package com.searching;

/**
 * Created by kumavatj on 5/27/17.
 */
public class EditStr {
    public static void main(String[] args){
        String s1 = "aa bb  ";
        char[] in = s1.toCharArray();
        EditStr st = new EditStr();
        st.replace(in, 5);
        System.out.print(in);
    }
    void replace(char[] str, int len) {
        int spc = 0, index, i=0;
        for (i=0;i< len;i++){
            if(str[i] == ' '){
                spc++;
            }
        }

        index = len + spc*2;

        if(len < str.length){
            str[len] = '\0';
        }

        for (i=len -1;i >=0;i--){
            if(str[i] == ' '){
                str[index -1] = '0';
                str[index -2] = '2';
                str[index -3] = '%';
                index = index -3;
            }else {
                str[index -1] = str[i];
                index--;
            }
        }
        System.out.print(str);
    }

}
