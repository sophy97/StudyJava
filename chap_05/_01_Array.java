package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        //배열: "같은 자료형"의 값 여러개를 저장하는 연속된 공간
        String coffeeAriana = "아메리카노";
        String coffeeDavid = "라떼";
        String coffeeAmy = "자몽허니블랙티";
        System.out.println(coffeeAriana+" 한 잔");
        System.out.println(coffeeDavid+" 세 잔");
        System.out.println(coffeeAmy+" 한 잔");
        System.out.println(" 부탁드립니다");
        System.out.println("====이 난리치지 않으려면 배열 사용===");

        // 배열 선언방법 - 1
        // new를 통해, 길이가 2인 coffeeOrders 배열을 선언
        String[] coffeeOrders = new String[2];
        //배열 선언방법 - 2
        //String coffeeOrders[] = new String[2];
        System.out.println("인덱스값은 늘 0부터. 위치 지정!");
//        coffeeOrders[0] = "아메리카노";
//        coffeeOrders[1] = "바닐라라떼";
//        coffeeOrders[2] = "자몽허니블랙티";

        // 방법3 > 배열 선언과 동시에 초기화 가능
        String[] coffees = new String[] {"아메리카노", "라떼", "자몽허니블랙티"};
        System.out.println(coffees[1]);

        // 방법4 > 위와 같은데 더 간편한 형태
        String[] coffees2 = {"아메리카노", "바닐라라떼", "자몽허니블랙티"};
        System.out.println("----커피 주문 예제----");
        System.out.println(coffees2[0]+"한 잔, "+coffees2[1]+"두 잔, ");
        System.out.println(coffees2[2]+" 한 잔 주문할게요");

        // 다른 자료형도 마찬가지
        // 응용 함 해보자
        int[] arrs = new int[4];
        arrs[0] =1;
        arrs[1] =2;
        arrs[2] =3;
        arrs[3] =4;
        int result=0;
        for(int i=0; i<arrs.length; i++) {
            result += arrs[i]; //1+2+3+4 = 10
        }
        System.out.println(result);

    }
}
