package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {
        // 논리 연산자
        boolean 김치찌개 = true; // 식당에 김치찌개라는 메뉴가 있다
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // or 하나라도 true 이면 true(3중에 1개메뉴 있으면 괜찮은 식당)
        System.out.println(김치찌개 && 계란말이 && 제육볶음); // and  모두 true 이면 true(3개 메뉴 모두 있어야 최고의 식당)

        //And 연산
        System.out.println((5 > 3) && (3 > 1)); // true 5는 3보다 크고, 3은 1보다 크다.
        System.out.println((5 > 3) && (3 < 1)); // false 5는 3보다 크고, 3은 1보다 작다.

        //or 연산
        System.out.println((5 > 3) || (3 > 1)); // 5는 3보다 크거나, 3은 1 보다 크다. (true)
        System.out.println((5 > 3) || (3 < 1)); // 5는 3보다 크거나, 3은 1 보다 작다. (true)
        System.out.println((5 < 3) || (3 < 1)); // 5는 3보다 작거나, 3은 1 보다 작다. (false)

        // 논리 부정 연산자
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // false
        System.out.println(!(5 == 3)); // true
    }
}
