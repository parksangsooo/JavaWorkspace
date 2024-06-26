package chap_06;

public class _Quiz_06 {
    // 개인 정보를 비공개로 전환하는 메소드 작성
    // 하나의 메소드에서 모든 동작 처리
    // 각 정보는 아래 위치부터 비공개 적용.
    // 이름 : 2번째 글자
    // 주민번호 : 9번째 글자
    // 전화번호 : 10번째 글자

    // 힌트
    // substring()
    // length()

    public static String getHiddenData(String data, int index){
        String hiddenData = data.substring(0, index); // 전지현 -> 전**
        // for (int i = 0; i < data.length() - index; i++) {
        for (int i = index; i < data.length(); i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "전지현"; // 이름
        String id = "871231-2345678"; // 주민번호
        String phone = "010-1234-5678";// 전화번호

        System.out.println("이름: " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));
    }
}
