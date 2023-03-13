package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        // 배열의 순회 +배열의 길이를 이용하기(배열명.length)
        String[] coffees = new String[]{"아메리카노", "라떼", "자몽허니블랙티"};

        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 한잔, ");
        }
        System.out.println("주문할게요");

        System.out.println("-----for each :coffees배열 값을 coffee라는 변수에 담아 전부 순회-----");
        
        // enhanced for(for-each 반복문)
        for (String coffee : coffees) {
            System.out.println(coffee+ " 한잔,");
        }
        System.out.println("주문할게요");
    }
}
