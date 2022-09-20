package me.java.overview;

public class Printf {
    public static void main(String[] args) {
        int i = 10;
        float f = 12.34f;
        double d = 56.78;
        char c = 'a';
        String s = "Hello World";
        boolean b = true;

        // printf
        // month: 1-12 (최대 2글자)
        // day: 1`30 (최대 2글자)
        int month = 1;
        int day = 1;
        System.out.printf("month = %2d, day = %2d\n", month, day);
        month = 12;
        day = 20;
        System.out.printf("month = %2d, day = %2d\n", month, day);

        // int
        System.out.printf("%d\n", i); // 10
        System.out.printf("%10d\n", i); // 오른쪽으로 정렬 // 10칸의 공간을 출력하는데에 쓰겠다. ________10
        System.out.printf("%-10d\n", i); // 왼쪽으로 정렬 // 10________
        System.out.printf("%010d\n", i); // 0000000010
        System.out.printf("%o\n", i); // 12
        System.out.printf("%x\n", i); // a
        System.out.printf("%X\n", i); // A
        System.out.printf("%n"); // System.out.me.java.overview.printf(): 포맷에 맞춰 문장을 출력하는 함수
        System.out.println(); // System.out.println(): 문장 마지막에 엔터를 포함하여 출력하는 함수

        // float
        System.out.printf("%f\n", f); // 12.340000
        System.out.printf("%.2f\n", f); // 12.34
        System.out.printf("%.8f\n", f); // 부동 소수점의 오차 (**)  // 12.34000015
        System.out.printf("%5.2f\n", f); // 12.34
        System.out.printf("%-5.2f\n", f); //12.34
        System.out.printf("%e\n", f); // 1.234000e+01 //지수표기법
        System.out.printf("%E\n", f); // 1.234000E+01 //지수표기법
        System.out.printf("%30.3e\n", f);
        System.out.printf("%30.3E\n", f);
        System.out.println();

        // double
        System.out.printf("%f\n", d);
        System.out.printf("%.2f\n", d);
        System.out.printf("%.8f\n", d);
        System.out.printf("%5.2f\n", d);
        System.out.printf("%-5.2f\n", d);
        System.out.printf("%e\n", f);
        System.out.printf("%E\n", f);
        System.out.printf("%30.3e\n", f);
        System.out.printf("%30.3E\n", f);
        System.out.println();

        // char
        System.out.printf("%c\n", c);
        System.out.printf("%C\n", c);
        System.out.printf("%30c\n", c);
        System.out.printf("%30C\n", c);
        System.out.println();

        // String
        System.out.printf("%s\n", s);
        System.out.printf("%S\n", s);
        System.out.printf("%30s\n", s);
        System.out.printf("%30S\n", s);
        System.out.println();

        // boolean
        System.out.printf("%b\n", b);
        System.out.printf("%B\n", b);
        System.out.printf("%30b\n", b);
        System.out.printf("%30B\n", b);
        System.out.println();


        // 변수에 저장하지 않은 리터럴도 가능
        System.out.printf("%d\n", 12345);
        System.out.printf("%f\n", 12.34);
        System.out.printf("%c\n", 'a');
        System.out.printf("%s\n", "a");
        System.out.printf("%b\n", true);
        System.out.println();


        // 변수의 자료형과 맞지 않은 지시자 사용 - 런타임 오류 발생 (IllegalFormatConversionException)
        System.out.printf("%c", i);
        System.out.printf("%d", b);

        // 존재하지 않은 지시자 사용 - 런타임 오류 발생 (IllegalFormatConversionException)
        System.out.printf("%a", i);
        System.out.printf("%k", i);
        System.out.printf("%q", i);

    }
}
