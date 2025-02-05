package org.example;

public class Test2 {
    public static void main(String[] args) {
        for(int i=0; i<6; i++) {
            int n = 6+1-i;
            int j=7;
            while(j-- > 0 && n!=1) {
                System.out.print(j);
                n--;
            }
            System.out.println();
        }
    }
}
