package lambda;

public class StringTest {
    public static void main(String[] args) {

        StringConcatImpl impl = new StringConcatImpl();
        impl.stringConcat("Hello", "java");
        System.out.println("-------------");

        // 람다식 구현하기
        StringConcat lambdaImpl = ((s1, s2) -> System.out.println(s1 + " " + s2));
        lambdaImpl.stringConcat("hello","java");
        System.out.println("-------------");

        // 익명내부클래스
        StringConcat innerImpl = new StringConcat() {
            @Override
            public void stringConcat(String s1, String s2) {
                System.out.println(s1 + " " + s2);
            }
        };

        innerImpl.stringConcat("hello","java");
    }
}
