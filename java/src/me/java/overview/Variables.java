package me.java.overview;

public class Variables {
    public static void main(String[] args) {
        int a = 10;
        // a vs 'a' vs "a"의 차이
        // => 변수 vs 리터럴 vs 리터럴
        System.out.println(a); // 10 => int (정수 데이커를 담고 있는 변수)
        System.out.println('a'); // a => 문자 (문자 하나만)
        System.out.println("a"); // a => 문자열 (문자들의 나열: 문자 여러개 가능)
    }
}
