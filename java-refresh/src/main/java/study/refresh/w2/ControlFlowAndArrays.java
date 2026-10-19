package study.refresh.w2;

/**
 * W2-1: 제어문과 배열
 * 배열에 담긴 점수를 반복문(for, 향상된 for, while)으로 돌면서
 * 조건문(if, switch)으로 분기한다.
 */
public class ControlFlowAndArrays {

    public static void main(String[] args) {
        int[] scores = {92, 78, 85, 61, 47};

        // 1) for: 인덱스(i)가 필요할 때
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생: " + scores[i] + "점 -> " + grade(scores[i]));
        }

        // 2) 향상된 for: 값만 필요할 때
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        double avg = (double) sum / scores.length;   // 지난주 내용: 정수 나눗셈 피하기
        System.out.println("합계=" + sum + ", 평균=" + avg);

        // 3) while + break: 조건을 만족하는 첫 번째를 찾으면 멈춤
        int idx = 0;
        while (idx < scores.length) {
            if (scores[idx] < 60) {
                System.out.println("첫 과락: " + (idx + 1) + "번 (" + scores[idx] + "점)");
                break;
            }
            idx++;
        }

        // 4) switch 식 (Java 14+): 값에 따라 결과 하나를 고른다
        String g = grade(85);
        String msg = switch (g) {
            case "A", "B" -> "잘했어요";
            case "C" -> "보통";
            default -> "분발";
        };
        System.out.println("85점 평가: " + msg);

        int result=0;
        for(int k=1;k<scores.length;k++) {
            if (scores[result] < scores[k]) {
                result=k;
            }
        }

        System.out.println("최고점: "+(result+1) +"번"+ "("+scores[result]+"점)");

    }

    // if - else if 사슬: 위에서부터 검사해 처음 참인 곳 하나만 실행
    // (static 메서드는 목요일에 다룸. 지금은 '이름 붙은 계산 묶음' 정도로 이해)
    static String grade(int score) {
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


}
