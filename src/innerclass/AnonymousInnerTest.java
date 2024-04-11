package innerclass;

class Outer{
    public Runnable getRunnable(){
        return new Runnable() {         // 익명클래스
            @Override
            public void run() {
                System.out.println("run()");
            }
        };
    }
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("runner");
        }
    };
}

public class AnonymousInnerTest {
    public static void main(String[] args) {
        // 익명 내부클래스는 하나의 인터페이스나 abstract 클래스 생성시 사용
        // 여러개는 사용 불가. 딱 하나만 사용 가능.
        // 안드로이드 위젯에 많이 사용됨.

        Outer outer = new Outer();
        Runnable runnable = outer.getRunnable();
        runnable.run();
        outer.runner.run();
    }
}
