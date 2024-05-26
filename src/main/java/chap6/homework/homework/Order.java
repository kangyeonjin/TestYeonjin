package chap6.homework.homework;

//매장에서 먹을지 나가먹을지
//메뉴를 불러옴

import java.util.Scanner;

public class Order {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String in = "매장";
        String out = "포장";

        System.out.println("매장을 선택하세요(1.매장,2.포장) : ");
        int input = sc.nextInt();
        System.out.println();

        if(input == 1){
            System.out.println(in+" 에서 먹겠습니다");
        }else if(input == 2){
            System.out.println(out+" 해서 먹겠습니다.");
        }else{
            System.out.println("다시 선택하세요");
        }

        Menu menu = new Menu();
//        menu.;

        System.out.println("메뉴를 선택하세요 : ");
        System.out.println(menu);


    }

}
