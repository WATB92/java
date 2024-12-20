package study;

public class L01HelloJava { //클래스 : 객체 데이터의 타입이다.
    //public class : 자바는 문서를 무조건 class 로 만드는데 public class 는 문서명과 같은 class 이면서 외부 라이브러로도 사용가능
    public static  void main(String[]args){
        //어플리케이션에 오직 1개만 존재하는 함수로 해당 어플의 실질적인 실행을 명시한다.
        //public : 공유가능, static : 메모리 영역 , void , 반환하는 것이 없는 함수, (String[]args) : 매개 변수로 어플 설정의 초기값
        System.out.println("안녕~자바야~");
    }
}
class User{//외부에서 사용할 수 없는 class 면서 해당 java 문서에 포함된 클래스이다. 하지만 class 문서로 컴파일은 된다.

}
