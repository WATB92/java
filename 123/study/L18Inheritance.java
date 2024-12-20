package study;

public class L18Inheritance {
    public static void main(String[] args) {
        //상속이란 객체가 다른 객체를 포함하도록 정의하는 방식??
        //모든 객체는 무슨 객체를 포함하고 있다.
        String s=new String("안녕");
        int [] [] arr=new int [4][3];
        //[[],[],[]] [] Array는 무슨 객체를 포함
        Object objS=s;
        Object objArr=arr;
        //모든 객체의 타입은 부모 타입으로 Object 를 상속하고 있고
        //때문에 객체 생성시 Object 를 객체로 생성해서 참조하고 있다.
        //Object 변수가 객체를 참조할 수 있는 이유다.
        //Object 는 모든 객체의 조상 : (js,java) 언어에서 객체의 default  상태를 정의
        //js 는 Object 프로토 타입(미완성 객체)을 만들어 놓고 다른 객체를 만들 때 마다 __proto__로 참조
        //__proto__는 자바의 super 와 같다
        //function User(){} 선언하면 User.prototype 이 __proto__ 이용해
        //Object.prototype 을 참조 하면서 객체를 생성
        //const user=new User(); User 객체가 User.prototype 을
        //__proto__로 참조하면서 생성된다.
        //new User()의 부모는 User.prototype 인가요? true false
        //new User()의 부모는 function User 인가요? false
        //new User()의 조상은 function Object 인가요? object.prototype 인가요?
        //function 은 선언 해놓은 단지 문자열인 거 뿐이고 그것을 기준으로 만든 prototype 이
        //객체의 부모나 조상이 된다.
        //const user=new User();
        //user.__proto__==상속 받고 싶은 프로토 타입이나 객체 (Mem.prototype)
        //class User extends Mem{} : (js가 java 의 문법을 따라한다. 문법적 설탕)

        //자바는 프로토 타입이라는 미완성 개게를 미리 만들어 놓지 않고
        //정의된 class 를 보고 객체를 생성한다.
        Member mem=new Member();
        //new Member 부모는 class Member 인가요?
        //new Member 조상은 class Object 인가요?
        //=> 자바에서는 class가 객체의 타입인 거 뿐이지 부모가 될 수 없다.
        //new Member() 조상은 class Object 인가요? true
        //자바에서는 객체를 조상 취급하지 않는다. type class 를 조상 취급한다.
        //js는 프로토 타입이 객체기 때문에 객체가 조상이 될 수 있다.

    }
}
class Member{}
