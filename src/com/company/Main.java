package com.company;

public class Main {

    public static void main(String[] args) {
        String str = "D3";
        String s = "A1 B5 D9";
        boolean x=isStringEqualToAnotherSubstring(str, s);
        System.out.println(x);

    }
        private static boolean isStringEqualToAnotherSubstring(String str, String s) {
            boolean equality= true;
            String[] splitString = s.split(" ");
            for (String c : splitString) {
                if (c.equals(str)) {
                     equality=true;
                     break;

                } else {
                    equality=false;
                }
            }
            return equality;
    }
}
