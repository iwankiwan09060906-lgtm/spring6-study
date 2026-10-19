package study.refresh.w2;

/**
 * W2-2: 클래스 = 설계도. 이 설계도로 new 할 때마다 Student 객체가 하나씩 생긴다.
 * (접근제어자 private/public은 W2-3에서 다룸. 지금은 일부러 생략)
 */
public class Student {

    // 필드: 객체마다 따로 갖는 상태
    String name;
    int score;

    // 생성자: new 할 때 딱 한 번 실행되어 필드의 첫 값을 정한다
    Student(String name, int score) {
        this.name = name;     // this.name = 이 객체의 필드, name = 매개변수
        this.score = score;
    }

    // 생성자 오버로딩: 점수 없이 만들면 0점으로 시작
    Student(String name) {
        this(name, 0);        // 위의 생성자를 호출 (반드시 첫 줄)
    }

    // 메서드: 객체가 할 수 있는 일. 자기 자신의 필드를 쓴다
    void addBonus(int bonus) {
        score += bonus;
    }
    String grade() {
        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    String describe() {
        return name + "(" + score + "점, " +grade()+")";
    }

}
