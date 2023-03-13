package chap_05;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원)
        // ex. 좌석 a1~a5, b1~b5, c1~c5
        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // "3*5크기"의 2차원 배열을 선언
        String [][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        //위의 2차원 배열에 index로 접근(index 값 늘 0부터)
        // B2에 접근?
        System.out.println(seats[1][1]);
        // C5에 접근?
        System.out.println(seats[2][4]);


        // 새로운 배열 (첫줄:3, 둘째줄:4, 셋째줄:5)짜리
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // 위의 A3에 접근하기
        System.out.println(seats2[0][2]);


        // 3차원(잘 안씀)도 있다
        String[][][] m_arr = new String[][][] {
                {},{},{},
                {},{},{},
                {},{},{},
        };
        // 접근방법
        //System.out.println(m_arr[1][1][1]);
    }
}
