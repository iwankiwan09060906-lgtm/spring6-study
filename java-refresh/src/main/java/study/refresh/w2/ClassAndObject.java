package study.refresh.w2;

/**
 * W2-2: 객체 만들기(new)와 사용하기
 */
public class ClassAndObject {

    public static void main(String[] args) {
        // 1) 같은 설계도로 서로 다른 객체 두 개
        Student kim = new Student("김", 85);
        Student lee = new Student("이");          // 이름만 받는 생성자
        System.out.println(kim.describe());
        System.out.println(lee.describe());

        // 2) 메서드는 호출한 그 객체의 필드만 바꾼다
        kim.addBonus(5);
        System.out.println("보너스 후: " + kim.describe() + ", " + lee.describe());

        // 3) 지난주 복습: 객체 변수에는 주소가 들어 있다
        Student same = kim;
        same.addBonus(10);
        System.out.println("same 수정 후 kim: " + kim.describe());

        // 4) 객체도 배열에 담을 수 있다
        Student[] students = {kim, lee, new Student("박", 72)};
        for (Student s : students) {
            System.out.println(" - " + s.describe());
        }
    }
}
