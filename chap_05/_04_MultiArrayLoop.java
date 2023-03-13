package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String [][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // 기본
        // for 문 두번 겹쳐서 이중 for문- 다차원 배열 출력
        // i=바깥쪽,행(row):세로 순회
        for(int i=0; i<3; i++) {
            //j=안쪽,열(column): 가로 순회
            for(int j=0; j<5; j++){
                System.out.print(seats[i][j]+" "); //A1A2A3A4...방지
            }
            System.out.println();
        };

        System.out.println("------------------");

        // 새로운 배열 (첫줄:3, 둘째줄:4, 셋째줄:5)의 for문 순회는 어떻게?
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // ★ 활용: seats[0].length 을 이용
        // i=바깥쪽,행(row):세로 순회
        for(int i=0; i<seats2.length; i++) {
            //j=안쪽,열(column): 가로 순회
            for(int j=0; j<seats2[i].length; j++){
                System.out.print(seats[i][j]+" "); //A1A2A3A4...방지
            }
            System.out.println();
        };
    }
}
