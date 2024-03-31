package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        // 문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals("Java")); // 문자열 내용이 같으면 true
        System.out.println(s1.equals(s2)); // 다르면 false
        System.out.println(s2.equals("python")); // 대소문자 false

        // 대소문자 구분 없이 문자열 내용이 같은지 여부 체크
        System.out.println(s2.equalsIgnoreCase("python"));

        // 문자열 비교 심화 (식당 화장실 비밀번호 입력해야 하는 경우)
        s1 = "1234"; // 벽에 붙은 메모지 하나만 가지고 비밀번호 참고 (참조)
        s2 = "1234";
        System.out.println(s1.equals(s2)); // true (내용 비교)
        System.out.println(s1 == s2); // true (참조 하는지 비교)

        s1 = new String("1234"); // 이건 개인별로 메모지에 적어 손님한테 비밀번호를 전달하는 것과 같음.
        s2 = new String("1234");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1 == s2); // false


    }
}
