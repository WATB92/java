package com.tj703.study;

public class L08BooleanOperator {
    public static void main(String[] args) {
        /*비교 연산자
            js : ==,!=,!,>,<,>=,<=, ===(형변환 없이 완전히 동등한지 비교), !==
            java (동등 비교시 자동형 변환이 없다.) : ==,!=,!,>,<,>=,<=
         */
        int i=1;
        System.out.println(i==1);
        System.out.println(i!=1);
        System.out.println(i>0);
        System.out.println(i<0);

        //System.out.println(!i);
        // js 1 ==> true ==> !true ==? false
        // !"문자열" => boolean("문자열") ==> !true
        //boolean 만! (not) 연산을 사용할 수 있다.
        System.out.println((i==1));

        boolean b=true;
        //b=(boolean)0; //java 는 정수를 boolean 으로 바꿀수 없다.
        //** 어려운 이야기 ~~ 하지만 면접 ..ㅜㅜ

        //**자바에서 자료형은 동등 비교를 할 수 없다.
        // (만약 하면 완전히 동등한 객체를 비교하지 않는 이상 무조건 false)
        Object o=new Object();
        Object o2=new Object();
        System.out.println(o==o2); //false
        System.out.println(o==o); //true
        String s="안녕"; // {'안','녕'}
        String s2="안녕";
        System.out.println(s==s2); //true (기본형)
        //리터럴하게 선언된 문자열은 기본형 데이터 처럼 똑같은 문자열이 존재하면 그것을 참조한다.
        //**자주사용하기 때문에 매번 새롭게 만들면 메모리에 부담이 가기 때문
        //******예외 ! 메모리가 너무 많거나 통신을 하는 상황에서는 똑같은 문자열을 참조하기 힘들기 때문에
        //종종 새롭게 만들어진다.
        String s3=new String("안녕"); //{'안','녕'} 통신으로 받아온 데이터를 문자열로 생성(전제)
        System.out.println(s==s3);
        //때문에 문자열을 ==가 아닌 equals 를 사용해야한다. (js는 무조건 == 로 비교하고 equals 가 없다.)
        //equals : 자료형의 필드를 비교해서 이정도면 같다고 볼 수 있지 라는 결과를 boolean 으로 반환
        //이재덩 , 이재덤 (1란성 쌍둥 유전 정보가 99.9% 같다)
        //equals 정의 유전 정보가 대충 90% 이상 같은 같은 존재야~ true
        //== : 완전히 같지 않는 이상 무조건 false

        System.out.println(s.equals(s3)); //{'안','녕'},equals ({'안','녕'}) : String.equals


        //기본형의 동등 비교는 값의 크기를 비교한다. (그것이 랩퍼 클래스 일지라도)

        System.out.println(10==10.0);
        i=10;
        double d=10.0;
        System.out.println(i==d);

        Integer objI=10;
        Integer objI2=10;
        System.out.println(objI==objI2);
        System.out.println(objI.intValue() == objI2.intValue());
        //랩퍼 클래스로 객체를 생성해도 랩퍼 클래스의 동등 비교 연사는 값으로 연산된다.

    }
}
