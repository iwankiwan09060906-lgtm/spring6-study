package study.refresh.w2;

/**
 * W2-3: BankAccount를 바깥에서 사용하는 쪽
 */
public class EncapsulationAndStatic {

    public static void main(String[] args) {
        // static 메서드는 객체가 하나도 없어도 클래스 이름으로 부른다
        System.out.println("계좌 수(시작): " + BankAccount.getTotalAccounts());

        BankAccount kim = new BankAccount("김");
        BankAccount lee = new BankAccount("이");

        kim.deposit(10000);
        kim.deposit(-500);        // 검증에 걸려 거절
        kim.withdraw(3000);
        lee.withdraw(1000);       // 잔액 부족으로 거절

        // kim.balance = 1_000_000;   // 주석을 풀면 컴파일 오류: private 필드는 밖에서 못 건드림

        System.out.println(kim.getOwner() + " 잔액: " + kim.getBalance());
        System.out.println(lee.getOwner() + " 잔액: " + lee.getBalance());
        System.out.println("계좌 수: " + BankAccount.getTotalAccounts());

        kim.transferTo(lee, 2000);
    }
}
