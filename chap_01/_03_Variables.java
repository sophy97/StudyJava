package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        // 자료형 - String, int, double, boolean
         String name = "Seoa";
         int hour = 18;

        System.out.println(name+"님, 배송이 시작됩니다. "+hour+"시 방문 예정입니다");
        System.out.println(name+"님, 배송이 완료되었습니다");

        double score = 90.5;
        char grade = 'A';
        //변수의 값 재할당
        name = "Junha";
        System.out.println(name+"님의 평균 점수는 "+score+" 점 입니다.");
        System.out.println("학점은 "+grade+" 입니다");

        boolean pass = true;
        System.out.println("당해 시험 합격 여부는 "+pass);

        // double 과 float 자료형
        // (float보다 double이 더 정밀, 실수를 float 자료형으로 만드려면 f를 추가한다)
        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        // int i = 10000000000; << error
        long l = 10000000000l;
        l = 10_000_000_000l;
        System.out.println(l);

    }
}
