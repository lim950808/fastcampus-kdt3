package me.java.input;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 메서드
        // 사용자가 콘솔을 통해 입력한 데이터를 저장
        Scanner sc = new Scanner(System.in);
        // 객체(object): 실제 행동하는 단위

        System.out.print("정수를 입력하세요: "); // 입력 유도 메시지
        int num = sc.nextInt(); // 콘솔에 입력된 정수 데이터를 Scanner가 긁어와서 num에 넣어줌
        System.out.println(num); // num 출력

        System.out.print("실수를 입력하세요: "); // 입력 유도 메시지
        double d = sc.nextDouble(); // 콘솔에 입력된 실수 데이터를 Scanner가 긁어와서 num에 넣어줌
        System.out.println(d); // d 출력  // 정수 입력시 .0 이 붙어서 출력됨
    }
}