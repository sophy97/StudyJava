package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        // 대입 연산자 -> 복합대입연산자
        // num 변수를 계속 업데이트하는 형태 (간단한 표현식)
        int num = 10;
        num +=2; // num = num+2
        System.out.println(num); //num = 10+2 -> 12

        num -=10; // num = num-10
        System.out.println(num); //num = 12-10 -> 2

        num *=20; // num = num*20
        System.out.println(num); // num = 2*20 -> 40

        num /=4; // num = num/4 의 몫
        System.out.println(num); // num = 40/4 -> 10

        num %=2; // num = num%2 의 나머지
        System.out.println(num); // num = 10%2 ->나머지0
    }
}
