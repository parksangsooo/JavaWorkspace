package lambda;

        /* 함수형 프로그래밍
        1/ 순수 함수를 구현하고 호출함으로써 외부자료에 부수적인 영향을 주지 않고
           매개 변수만을 사용하도록 만든 함수.
        2/ 함수를 기반으로 구현.
        3/ 입력 받은 자료를 기반으로 수행되고, 외부에 영향을 미치지 않기 때문에
           병렬처리 등에 사용. 안정적인 확장성! (여러 함수가 불려도 외부에 영향을 미치지 않음)

           <함수형 인터페이스>
           1/ 람다식을 선언하기 위한 인터페이스
           2/ 익명 함수와 매개 변수만으로 구현되기 때문에 "단 하나의 메서드만을 가져야함"
           3/ @FunctionalInterface :
              함수형 인터페이스라는 의미, 여러개 메서드를 선언하면 에러
         */

         /* 람다식 문법!!
         1)매개변수 하나인 경우 자료형과 괄호 생략
                str -> {
                    System.out.println(str);
                }
         2) 매개변수 2개인 경우 괄호 생략 X
                x, y -> {
                    System.out.println(x+y);    == 오류
                }
         3) 중괄호 안의 구현부가 한 문장인 경우 중괄호 생략
                str -> System.out.println("str");
            단 중괄호 안의 구현부가 한 문장이라도 return 문이라면 중괄호 생략 불가
                str-> return str.length();      == 오류
        4) 중괄호 안의 구현부가 반환문이 하나 라면 return 과 중괄호 모두 생략 가능
                (x, y) -> x + y;   // 두 값을 더하여 반환
                str -> str.length();   // 문자열 길이를 반환
          */

public class MyMaxNumberTest {
    public static void main(String[] args) {
        MyMaxNum maxNum = (x, y) -> {return (x >= y) ? x : y;};     // 구현부
        int max = maxNum.getMax(10,20);       // 호출
        System.out.println(max);

        // 왜 쓰는가?
        // 클래스를 구현한 경우와 람다식을 활용한 경우 비교하기 => Class 참고

    }
}
