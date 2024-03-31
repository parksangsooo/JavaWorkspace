package chap_06;

import java.io.FilterOutputStream;

public class _07_VariableScope {
    // 지역변수는 {} 안에서만 사용 가능. {} 벗어나면 지역변수 사용 불가.
    // {} 내에 선언한 변수를 "지역변수"라 한다.
    public static void methodA(){
       // System.out.println(num);
    }

    public static void methodB(){
        int result = 1; // 지역 변수
    }
    public static void main(String[] args) {
        int num = 3;

//       System.out.println(result);

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // System.out.println(i);
        {
            int j = 0;
            System.out.println(j);
        }
        // System.out.println(j);

    }
}
