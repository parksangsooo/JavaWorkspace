package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number){ //numer, parameter, 매개변수, 전달값
        int result = number * number;
        System.out.println(number + " 의 2 승은 " + result);
    }

    public static void main(String[] args) {
        // 전달값, Parameter
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        //Argument, 인수
        power(4);
        power(3);
    }
}
