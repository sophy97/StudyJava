package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자
        System.out.println("일반 사칙연산");
        System.out.println(4 + 2); //6
        System.out.println(10 - 6); //4
        System.out.println(2 * 8); //16
        System.out.println(8 / 2); //4
        System.out.println("컴퓨터 연산자 특수성");
        System.out.println(5 / 2); //2.5아님, 정수간 연산 결과는 소수점 버린 정수 출력
        System.out.println(2 / 4); //0.5아니고 마찬가지로 소수점 버려서 0임
        System.out.println(4 % 2); //나머지연산자! 나머지0임
        System.out.println(5 % 2); //몫:2, 나머지:1 > 1
        System.out.println("---우선순위 연산---");
        System.out.println(2+2*3); // 2+(2*3)= 8
        System.out.println((2+3)*2); // 5*2= 10
        System.out.println("--변수를 이용한 연산--");
        int a = 20;
        int b = 10;
        int c;
        c=a+b;
        System.out.println(c); //30
        c = a*b+a;
        System.out.println(c); //220

        // 증감 연산자
        int val;
        val =10;
        System.out.println(val); // 10
        System.out.println(++val); // 10+1 > 11
        System.out.println(val++); // ! 주의 (11)
        // 프린트될때까지 11유지, 프린트된 후 바로+1 > 12
        System.out.println(val); //12
        System.out.println("--빼기도 마찬가지--");
        val = 20;
        System.out.println(val); // 20
        System.out.println(--val); // 19
        val = 20;
        System.out.println(val); //20
        System.out.println(val--); // !주의 (20)
        //프린트될때까지 20유지, 프린트 후 바로 -1 > 19
        System.out.println(val); //19

        // ex 은행 대기번호표
        int waiting =0;
        System.out.println("현 대기인원: "+waiting++); //대기 인원: 0
        System.out.println("현 대기인원: "+waiting++); //대기 인원: 1
        System.out.println("현 대기인원: "+waiting++); //대기 인원: 2

        System.out.println("총 대기 인원: "+waiting); //총 3명이 찍힐 것
    }
}
