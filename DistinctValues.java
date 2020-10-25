package com.adrianCurso;

public class DistinctValues {

        public static void main(String[] args) {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            int c=Integer.parseInt(args[2]);
            int distinct=0;

            if ((a==b) && (b==c)){
                distinct=1;
            }
            else if ((a!=b) && (b!=c) && (a!=c)){
                distinct=3;
            }
            else {
                distinct=2;
            }

            System.out.println(distinct);
        }

}
