package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        // ASCII(아스키 코드) : 정보교환을 위한 미국 표준 코드
        // ref : 알파벳 대문자는 65부터, 소문자는 97부터, 숫자0은 48부터 시작함
        // ㄴ 이거 외워서 어디 씀? ex. 이전 seats3배열에서 문자 꺼내는 작업 시 - L:26~
        
        char c = 'A';
        // 그냥 출력
        System.out.println(c); //그냥 A
        // int 로 변한 후 출력
        System.out.println((int)c); // 아스키코드 '65'
        
        // 대문자 B로 재확인
        c = 'B';
        System.out.println(c); // B
        System.out.println((int)c); // 아스키코드 '66'
        

        // 값 1 더해서 재확인
        c++;
        System.out.println(c); // C
        System.out.println((int)c); // 아스키코드 '67'

        // ASCII 활용해서 간단히 만들기
        // 세로10 * 가로15 크기의 좌석 선언만 하기
        String[][] seats3 = new String[10][15];
        // 선언 후 이중 반복문으로 값을 넣기 (data format "A1","A2"...)
        char ch = 'A';      // ch++ = 'B' ...됨을 활용
        for (int i = 0; i < seats3.length; i++) { //세로10
            for (int j = 0; j < seats3[i].length; j++) { //가로15
                seats3[i][j]= String.valueOf(ch) + (j+1);
            }
            ch++;
        }

        // 위 좌석표 출력해보기
        // i=바깥쪽,행(row):세로 순회
        for(int i=0; i<seats3.length; i++) {
            //j=안쪽,열(column): 가로 순회
            for(int j=0; j<seats3[i].length; j++){
                System.out.print(seats3[i][j]+" "); //A1A2A3A4...방지 공백
            }
            System.out.println();
        };
    }
}
