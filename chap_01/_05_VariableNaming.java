package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
       /* 변수 이름 짓는 규칙
        1. 저장하려는 값에 어울리는 이름
        2. 언더바,문자,숫자 사용가능 but 공백 불가
        3. 언더바 또는 문자로 시작해야(숫자시작불가)
        4. 하나 또는 둘 이상 단어의 조합으로
        5. 소문자로 시작, CamelCase 사용
        6. 예약어(public,int,static,void 등)은 변수명으로 사용 불가
        */

        // ex> 여행용 입국 신고서
        String nationality = "Korea"; //국적
        String firstName = "Seoa"; //이름
        String lastName = "Park"; //성
        String dateOfBirth = "1997-07-28"; //생년월일
        String residentialAddress = "Crown Hover Hotel"; //체류지
        String purposeOfVisit = "travel"; //입국목적
        String flightNo = "KL990"; //항공편명
        String flight_no_2 = "KA009"; //항공편명2
        // error > String -flight_no = "KA009";
        int accompany = 3; //동반 가족수
        int lengthOfStay = 7; //체류기간
        String item = "watch"; //세관신고 물품1
        String item2 = "bag"; //세관신고 물품2
        // error > String 3item = "gold";

        // 프로그램의 흐름을 위해 사용하는 변수(이름이 별 의미 없는 경우)
        int i = 0; //ex.반복문 실행을 위한 i의 선언
        String s = "";

        // 참고! 상수(재정의 불가)는 대문자로 선언한다
        final String CODE = "KR";
    }
}
