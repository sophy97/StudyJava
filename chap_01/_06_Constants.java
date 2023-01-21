package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        // update 될 일이 거의 없는 값들 = 상수로 선언함(e.g 국가번호)
        // 변수와 같이 선언하되 final 키워드를 추가한다

        final String KR_COUNTRY_CODE = "+82"; //국가번호
        // final 붙이면 error > KR_COUNTRY_CODE = "+828282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; //원주율
        final String DATE_OF_BIRTH = "1997-07-28"; //생년월일
        System.out.println("상수로 선언한 값들입니다. 원주율은 "+PI+", 생년월일: "+DATE_OF_BIRTH);
    }
}
