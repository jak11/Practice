package com.searching;

/**
 * Created by kumavatj on 6/5/17.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Started the app");
        String s = solution("ABBCC");
        System.out.println(s);
    }

    static String solution(String S) {

        StringBuilder sb = new StringBuilder();

        int start=-1, end=-1;
        char[] s = S.toCharArray();
        for(int i=0; i<s.length; ++i) {
            char c = s[i];

            if(c == 'Z') continue;

            if(sb.length() == 0) {
                sb.append(c);
                start = i;
            } else if(sb.length() == 1) {
                sb.append(c);
                end = i;
            }


            boolean isEvaluated = false;
            if(sb.length() == 2) {
                switch(sb.toString()) {
                    case "AB" :
                        s[start] = 'A';
                        s[end] = 'A';
                        isEvaluated = true;
                        break;
                    case "BA" :
                        s[start] = 'A';
                        s[end] = 'A';
                        isEvaluated = true;
                        break;
                    case "CB" :
                        s[start] = 'C';
                        s[end] = 'C';
                        isEvaluated = true;
                        break;
                    case "BC" :
                        s[start] = 'C';
                        s[end] = 'C';
                        isEvaluated = true;
                        break;
                    case "AA" :
                        s[start] = 'A';
                        s[start] = 'Z';
                        isEvaluated = true;
                        break;
                    case "CC" :
                        s[start] = 'C';
                        s[end] = 'Z';
                        isEvaluated = true;
                        break;
                }

                if(isEvaluated) {
                    i=-1;
                    isEvaluated = false;
                } else {
                    i = start;
                }

                sb = new StringBuilder();
                start = -1;
                end = -1;
            }
        }


        sb = new StringBuilder();
        for(int i=0; i<s.length; ++i) {
            if(s[i] != 'Z') {
                sb.append(s[i]);
            }
        }

        return sb.toString();
    }
}


