package homework;
import java.util.Scanner;
public class H01RandomNumMatchAnswer {
    public static void main(String[] args) {
        System.out.println("랜덤한게 생성한 (1~50)수를 맞추세요! ");

        double random=Math.random();
        System.out.println(random);
        int num=(int)(random*50)+1;

        System.out.println(num);
        boolean game=true;
        int count= 0;
        while(game){
            Scanner scanner=new Scanner(System.in);
            String inputNumStr=scanner.nextLine();

            try{
                //1+(--count) : 1을 먼저 더하고 count 를 1빼라
                //1+(count--) : count 를 1빼고 1을 더하라
                int inputNum=Integer.parseInt(inputNumStr);

                ++count;
                if(inputNum==num){
                    System.out.println(count+" 시도 : 정답!");
                    game=false;
                }else {
                    if (count==5){
                        System.out.println("졌습니다.");
                        break;


                    }else {
                        if(num<inputNum){
                            System.out.println("down");
                        }else {
                            System.out.println("up");
                        }
                    }
                }


            }catch (NumberFormatException e){
                System.out.println("숫자만 입력하세요.");
            }


        }




    }
}