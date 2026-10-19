package study.refresh.w1;

/**
 * W1-1: 기본형(primitive) vs 참조형(reference)
 * 기본형 변수에는 "값"이, 참조형 변수에는 "객체의 주소"가 들어 있다.
 */
public class PrimitiveVsReference {

    public static void main(String[] args) {
        // 1) 기본형: 계산 규칙
        int a = 7 / 2;        // 정수 / 정수 = 정수 (소수점 버림)
        double b = 7 / 2;     // 오른쪽이 먼저 정수로 계산됨 -> 3 -> 3.0
        double c = 7.0 / 2;   // 한쪽이라도 실수면 실수 나눗셈
        int d = (int) 3.99;   // 강제 형변환: 반올림이 아니라 버림
        System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d);

        // 2) 기본형: 대입하면 값이 복사된다
        int x = 10;
        int y = x;
        y = 20;
        System.out.println("x=" + x + ", y=" + y);

        // 3) 참조형: 대입하면 주소가 복사된다 -> 같은 객체를 가리킴
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1.clone();
        arr2[0] = 99;
        System.out.println("arr1[0]=" + arr1[0]);

        // 4) 참조형 비교: == 는 같은 객체인가, equals 는 내용이 같은가
        String s1 = new String("hi");
        String s2 = new String("hi");
        String s3 = s1;
        System.out.println("s1 == s2      : " + (s1 == s2)); //다른 객체
        System.out.println("s1.equals(s2) : " + s1.equals(s2)); //같은 값
        System.out.println("s1 == s3      : " + (s1 == s3)); //같은 객체

    }
}
