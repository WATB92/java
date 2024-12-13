package com.tj703.study;

public class L07NumberOperator {
    public static void main(String[]args) {
        /*
        * js : +,-,*,/,%,** (>>,<<,~)
        * java : +,-,*,/,%, Math.pow() (>>,<<,~)
         */
        int i =10 + 20;
        i=10 - 20;
        i=10 * 20;
        //i=2**5;
        i=(int)Math.pow(2,5); //거듭 제곱의 결과가 큰 수기 때문에 double 을 반환
        System.out.println(i);
        System.out.println(10/3); //3.333333333333333 (x) => 3
        //정수를 정수와 연산하면 무조건 정수로 변환
        System.out.println(10/3.0);
        double d=10/3;
        System.out.println(d);

        i=10%3; //1
        i=10%4; //2
        System.out.println(i); //2
        i=2>>1; //0010 => 0001
        System.out.println(i); //1
        i=2>>2; //0010 => 0000
        System.out.println(i); //0
        i=2<<2; //8 //31 bit
        i=2<<30; //**sign bit 까지 이동 100000000000000
        System.out.println(i); //8
        i=2<<31;
        System.out.println(i);
        i=~0;
        System.out.println(i); //00000000 -> 11111111


    }
}
