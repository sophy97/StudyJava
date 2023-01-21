package chap_01;

public class _04_Comments {
    public static void main(String[] args) {
        System.out.println("(10분 전)잠시 후 결혼식 시작 예정이니 착석 부탁드립니다.");
//        System.out.println("(5분 전)잠시 후 결혼식 시작 예정이니 착석 부탁드립니다.");
        // 주석은 코드로 보지 않는다 ctrl+slash :한줄주석
        System.out.println("지금부터 결혼식을 시작합니다.");

        int size = 120;
        size += 10; //문장 뒤에도 부연 설명을 위한 주석을 추가할 수 있다
        System.out.println("사이즈는 "+size+"입니다");

        // 여러줄 주석
        /* ctrl+shift+slash */
        /*int a = 10; int b = 20;
        System.out.println(a+b);*/
    }
}
