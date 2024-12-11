package com.tj703.study;

import java.util.ArrayList;
import java.util.Arrays;

public class L02Data {
    public static void main(String[] args) {
        System.out.println(14);//정수 (js x)
        System.out.println(14.0);//실수
        System.out.println("문자열");//문자열 (자료형)
        System.out.println('s');//문자 (js x)
        System.out.println(false); //0
        System.out.println(true); //1
        //System.out.println(null);//null : 비어 있음 (출력x, js 'null')
        System.out.println(new ArrayList());//배열자료형
        //const arr=[1,2,3];
        int [] arr={1,2,3};//리터럴하게 표기함 배열자료형
        System.out.println(arr);//[I@a09ee92 : 객체가 저명된 주소
        System.out.println(Arrays.toString(arr)); //java.util.Arrays : 리터럴하게 표기한 배열의 지원 클래스
        //const m=new Mem();
        Mem m=new Mem();//{age:33,name:"이재덕"}, 자료형 데이터
        System.out.println("맴버는 나이는 :"+m.age); //"." : 필드 접근자
        System.out.println("맴버의 이름은 :"+m.name);
        System.out.println("맴버는 :"+m); //js와 같은 객체 명세서가 없다.(com.tj703.study.Mem@3a71f4dd)

    }
}
//class User{}
//동일한 패키지에 같은 이름의 클래스가 2개 존재할 수 없다.
class Mem{
    int age=33;
    String name="이재덕";

}


