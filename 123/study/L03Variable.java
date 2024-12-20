package study;

public class L03Variable {
    public static void main(String[] args) {
        //소문자로 작성하는 모든 타입은 기본형
        //자바는 수로된 데이터만 기본형으로 명시
        int i=13; //int i : 변수 i는 Integer 만 참조하겠다.
        System.out.println(i*i);
        boolean t=true;
        //System.out.println(t+t); //오직 수자인 타입만 수학적 연산 가능
        char c='r';
        System.out.println(c+c); //char 는 인코딩 번호아이기 때문에


        double d=13.3;
        System.out.println(d);
        System.out.println(d*12);

        //i=13.3; //java는 컴파일시 오류가 발견되면 실행되지 않기 위해 class 문서로 컴파일하지 않는다.(컴파일이 오류를 예방)
        //변수가 선언된 타입으로 데이터를 참조할 수 있다.
        //= : 대입,참조연산자
        //int i=33.3;
        // 1.33.3을 자바가 생성하고
        // 2.타입이 int인 i가 만들어지고 3.
        // 3. 33.3을 i가 참조한다.

        //System : 콘솔과 관련된 자료형 데이터
        // . : 필드 접근자로 객체에 소속된 자료를 참조할 수 있다.
        //out : 시스템의 필드 (소속된)로 출력과 관련된 데이터
        //println() : out(PrintStream) 의 함수로 콘솔에 문자열을 출력 실행한다.
        //함수 : 실행하는 무언가!

        //데이터의 종류
        /*기본형(정수(boolean,char),실수), 자료형 (필드가 존재하는 데이터)
         * 자료형 (배열(index,length),문자열,객체(필드,메소드)
         **/
        //js 기본형 (실수(number) , 문자열(string) ,Symbol , boolean)


    }
}