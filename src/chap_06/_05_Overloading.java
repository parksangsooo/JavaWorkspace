package chap_06;

public class _05_Overloading {
    // 메소드 오버로딩 (이름이 같은 메소드를 여러가지 만드는 것)
    public static int getPower(int number){
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber); // 문자를 전달 받아서 정수로 바꿔주는
        return number * number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        // 3. 반환형이 다른 메소드로는 중복정의 할 수 없다.

        System.out.println(getPower(3)); // 3 * 3 = 9
        System.out.println(getPower("4")); // 4 * 4 = 16
        System.out.println(getPower(3,3)); // 3 * 3 * 3 = 27

    }
}
