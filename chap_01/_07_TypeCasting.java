package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // ex 정수형 > 실수형 / 실수형 > 정수형
        // error > int score = 50+80.5;

        // int to float,double
        int score = 50;
        System.out.println(score); //50
        System.out.println((float)score); //50.0
        System.out.println((double)score); //50.0

        // float,double to int
        float score_f = 80.5f;
        double score_d = 90.8;
        System.out.println((int)score_f); // 소수점 버려서 80
        System.out.println((int)score_d); // 소수점 버려서 90

        // 처음 하려던 정수+실수 연산 재시도
        score = 50 +(int)80.5; //50+80
        System.out.println(score); // 130

        score_d = (double)10 + 90.8; // 10.0 + 90.8 (score_d는 double 알아서 처리)
        System.out.println(score_d); //100.8

        // 변수에 형변환 된 데이터를 할당하기
        // 1 -범위 확장은 자동으로 [int -> long -> float -> double]
        double convertedScoreDouble = score; //130 -> 130.0 자동 double 로
        System.out.println(convertedScoreDouble);
        // 2 -축소는 수동으로 형변환 필요함 [double -> float -> long -> int]
        int convertedScoreInt = (int)score_d; // 100.8 -> 100 int 자동 변환 불가
        System.out.println(convertedScoreInt);

    }
}
