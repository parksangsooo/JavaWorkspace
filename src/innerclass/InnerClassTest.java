package innerclass;

class OutClass{
    private InClass inClass;        // 이것에 의미는 뭔가?
    private int num = 100;
    private static int snum = 300;

    public OutClass() {// 내부클래스는 외부 클래스의 생성자에서 주로 생성된다.
        inClass = new InClass();
    }

    class InClass{      // 인스턴스 내부클래스
        int inNum = 200;

        // 내부 클래스는 외부클래스의 레퍼런스를 가짐.
        // 따라서 내부 클래스는 외부클래스의 모든 변수를 사용가능하다
        void inTest(){
            System.out.println(num);        // private 이라고 하더라도 사용 가능
            System.out.println(inNum);      // 호출되는 방법은????
            System.out.println(snum);
        }

    }
    public void usingInMethod(){
        inClass.inTest();
    }



}


public class InnerClassTest {
    public static void main(String[] args) {
        // 호출방법
        // 1. usingInMethod 를 만들어 호출

        OutClass outer = new OutClass();        // 2. OutClass 를 생성할때 InClass 도 같이 생성됨
        outer.usingInMethod();

        System.out.println("-----------------------");

        // 다른방법 (클래스 내부에서만 사용하려는 클래스 이지만 외부에서도 생성은 가능함.)
        OutClass.InClass inClass = outer.new InClass();
        inClass.inTest();

    }
}
