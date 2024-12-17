package com.tj703.study;

import java.util.Date; //현재 패키지에 클래스가 없다면 import
import java.util.Scanner; //입력을 받는 class


public class L13Switch {
    public static void main(String[] args) {
        int month=3;
        String monthStr=null;
        if(month==1){
            monthStr="jan";
        } else if (month==2) {
            monthStr="feb";
        } else if (month==3) {
            monthStr="mar";
        }//.....
        System.out.println(monthStr);
        //switch : 동등 비교 연산*으로 else if 의 조건을 작성할 때 더 빠르게 동작하고 가독성이 좋다.
        //**switch 무조건 입력잉 1개 존재 해야한다.
        switch (month){
            case 1 :
                monthStr="jan";
                break; //해당 조건이 맞으면 switch를 벗어 나겠다.
            case 2 :
                monthStr="feb";
                break;
            case 3 :
                monthStr="mar";
                break;

        }
        System.out.println(monthStr);

        //자료형을 입력으로 사용

        monthStr=new String("sep"); //month가 9가 되면 equals 로 비교연산 한다는 뜻
        month=0;
        //입력한 데이터가 자료형이면 동등 비교 연산 (==) 대신 equals 를 사용합니다.(**)
        switch (monthStr){
            case "jan" : month=1; break;
            case "feb" : month=2; break;
            case "mar" : month=3; break;
            case "apr" : month=4; break;
            case "may" : month=5; break;
            case "jun" : month=6; break;
            case "jul" : month=7; break;
            case "aug" : month=8; break;
            case "sep" : month=9; break;
            case "oct" : month=10; break;
            case "nov" : month=11; break;
            case "dec" : month=12; break;
            default:month=-1; break;
        }
        System.out.println("입력한 달은"+month+"월 입니다.");
        //**switch 가 인기가 없는 이유
        //1. 크기 비교를 할 수 없다.
        //2. &&|| 을 이용해 복잡한 비교 연산을 작성 할 수 없다.(==,equals로 비교 연산)
        //3. 순서가 있는 데이터는 배열이 대신 할 수 있고 자바 스크립트에서 Object의 key를 switch의 case 대신 사용
        month=3;
        String [] monthStrArr={"잘못입력","jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};

        String str=monthStrArr[month];
        System.out.println(str);


        Date now=new Date(); //현재 날짜 객체
        System.out.println(now.getMonth()); //jave 1월이 0부터 시작
        int nowMonth=now.getMonth();
        System.out.println(monthStrArr[nowMonth]);
        Scanner scanner=new Scanner(System.in);
        //Scanner 입력을 받는 객체, System.in
        System.out.println("알고 싶은 달의 이름은 (숫자입력)? :");
        String inMonthStr=scanner.nextLine(); //콘솔에서 입력하고 엔터를 누르면 엔터를 누르기 전까지를 입력 받는다.
        int inMonth=Integer.parseInt(inMonthStr);
        System.out.println(monthStrArr[inMonth-1]);

    }
}
