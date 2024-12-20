package homework;

import java.util.Scanner;
public class H01RandomNumMatch {
    public static void main(String[] args) {
        System.out.println("랜덤한게 생성한 (1~50)수를 맞추세요! ");
        //맞출때 까지 반복 실행
        double random = Math.random(); //java.lang 패키지는 자동으로 Import (String,Integer..)
        System.out.println(random);
        int num = (int) (random * 50) + 1; //더큰수->작은수 (강제형변환) casting
        //(int)13.12345611223 : 실수 타입이 정수가 될 때는 소수점 버림이 발생
        //let num=Math.trunc(-1.4); //js 에서 버림 1
        //let num=Math.parseInt(-1.4); //js 에서 버림 2

        //fool(내림) : 1.4 -> 1 , -1.4 => -2
        //ceil(올림),round(반올림)

        System.out.println(num);
        boolean game = true;
        int attempts = 0;
        while (game) {
            Scanner scanner = new Scanner(System.in);
            String inputNumStr = scanner.nextLine();
            //enter(line 개행)를 입력할때까지의 문자열을 받는다.
            //콘솔에서 문자열을 입력하고 엔터를 누를때까지 jvm 대기
            //정답을 5번안에 맞추도록 하세요!
            //입력이 5번을 넘기면 졌습니다. 종료! **1

            //game을 무한히 반복 시키세요! 2
            try {
                int inputNum = Integer.parseInt(inputNumStr);
                //다음 코드부터는 inputNum은 무조건 존재함
                attempts++;
                if (inputNum == num) {
                    System.out.println("정답!"); //break;
                    game = false;
                } else if (inputNum > num) {
                    System.out.println("down");
                } else {
                    System.out.println("up");
                }
                if (attempts >= 5 && game) {
                    System.out.println("입력 횟수를 초과했습니다. 게임이 종료됩니다.");
                    game = false;
                }

            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력하세요.");
            }


        }

        //랜덤하게 뽑은 수가 입력한 수와 같을때까지 반복실행하는 코드를 작성하세요!


    }
}