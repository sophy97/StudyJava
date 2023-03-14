package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        // quiz. 배열 활용하여 쇼핑몰에서 구매할 신발 사이즈 옵션 출력하는 프로그램 작성
        // 조건: 사이즈 250~295까지 5단위 증가, 사이즈 수 10개

        System.out.println("--구매 가능한 신발 사이즈--");

        // 길이가 10인(사이즈10개 조건) 1차원 배열 선언
        int [] sizes = new int[10];
        // for 반복, 5씩 증가하면서 출력하기
        int first = 250;
        for (int i = 0; i < sizes.length; i++) {
            System.out.println("사이즈 "+first+" (재고 있음) ");
            first += 5;
        };

        // 해설 코드
        // first 변수+5하는 대신, sizes 배열 자체로부터 값에 접근, index i와 5단 이용해 출력
        for (int i = 0; i < sizes.length; i++) {
            sizes[i] = 250 + ( 5 * i );
        };
        
        //출력은 따로 - for each
        for (int size :
                sizes) {
            System.out.println("사이즈 "+size+" (재고ㅇ) ");
        }


    }
}
