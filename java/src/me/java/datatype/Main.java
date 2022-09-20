package me.java.datatype;

public class Main {
    public static void main(String[] args) {
        // 리터럴(literal): 데이터 수
        int a = 3; // int(자료형) a(변수) = 3(리터럴);

        // 자료형 (datatype)
        // 메모리 관리를 위하여 데이터마다 자료형을 정의해 줘야 함.

        // 원시 자료형 (Primitive type): Stack 공간
        // int(4byte = 32bit): -2^31 ~ 2^31-1
        // float(4byte = 32bit)
        // double(8byte = 64bit)
        // char(2byte = 16bit)
        // 1byte = 8bit (________)

        // 참조형 (Reference type): Heap 공간
        // String(class)

        // 작은 발은 큰 신발에 들어갈 수 있음
        // 작은 리터럴은 큰 변수 공간에는 들어갈 수 있음
        byte b  = 10; // 1byte 범위를 벗어나면 오류남.
        byte bb = (byte) 1000; //하지만 앞에 (byte)를 넣어서 강제 형변환하게 되면 데이터 손실이 나지만 오류는 안 남. 명시적 형변(type casting)
        short s = 10;
        short ss = (short) 100000; //앞에 (short)를 넣어서 강제 형변환하게 되면 데이터 손실이 나지만 오류는 안 남. 명시적 형변(type casting)
        int i = 10; // 정수의 기본 단위
        long l = 10; // 8byte = 4byte ==> 작은 것은 큰 것에 들어갈 수 있다. 자동 형변환(promotion)
        float f = 3.14f; // float 일 때는 실수 뒤에 f를 입력해 줘야 함.
        double d = 3.14; // 실수의 기본 단위



        // 쓰레기 값
        // 저장할 수 있는 값의 범위를 초과해서 값을 저장할 경우 표현 범위 내에서 저장을 위해 엉터리값 저장
        byte var1 = 125; // -128 ~ 127
        int var2 = 125;

        for (int j = 0; j < 5; j ++) {
            var1++; // var1 = var1 + 1
            var2++; // var2 = var2 + 1
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);

            //결과값 ==>
            //var1: 126	    var2: 126
            //var1: 127	    var2: 127
            //var1: -128	var2: 128    ==> 127에다가 1을 더하면 다시 -128로 돌아가기 때문에 쓰레기 값이 된다.
            //var1: -127	var2: 129
            //var1: -126	var2: 130

            // 문자열 + 문자열 = 문자열의 결합 "a" + "b" = "ab"
            // 문자열 + 정수 = 문자열의 결합 "a" + 130" = "a130"
            //서로 다른 타입의 피연산자가 있을 경우 두 피연산자 중 크기가 큰 타입으로 자동 변환된 후 연산 수행
        }

    }
}
