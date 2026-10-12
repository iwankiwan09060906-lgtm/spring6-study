package study.refresh;

public class Hello {

    public static String greet(String name) {
        return "안녕, " + name + "! (Java " + Runtime.version().feature() + ")";
    }

    public static void main(String[] args) {
        System.out.println(greet("Spring 6"));
    }
}
