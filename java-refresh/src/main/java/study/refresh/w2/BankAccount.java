package study.refresh.w2;

/**
 * W2-3: 캡슐화 + static
 * - 필드는 private으로 숨기고, 바꾸는 길은 검증이 들어간 public 메서드로만 연다.
 * - static 필드는 객체마다가 아니라 클래스에 딱 하나 있다(모든 계좌가 공유).
 */
public class BankAccount {

    // static: 클래스 전체가 공유하는 값
    private static int totalAccounts = 0;

    // 인스턴스 필드: 계좌(객체)마다 따로
    private final String owner;   // final: 생성자에서 한 번 정하면 못 바꿈
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        totalAccounts++;           // 계좌가 만들어질 때마다 공유 카운터 +1
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("  [거절] 입금액은 0보다 커야 합니다: " + amount);
            return;
        }
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            System.out.println("  [거절] 잔액 부족: 잔액 " + balance + ", 요청 " + amount);
            return false;
        }
        balance -= amount;
        return true;
    }

    public boolean transferTo(BankAccount other, int amount){
        withdraw(amount);
        if(balance>=amount) {
            other.deposit(amount);
            System.out.println(owner + " 잔액" + balance);
            System.out.println(other.owner + " 의 잔액" + other.balance);
            return true;
        }
        return false;
    }

    // getter: 읽기만 허용 (setter는 일부러 만들지 않음)
    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    // static 메서드: 객체 없이 클래스 이름으로 호출. static 필드만 쓸 수 있다
    public static int getTotalAccounts() {
        return totalAccounts;
    }
}
