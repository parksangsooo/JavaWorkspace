package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름.
        // 2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능(공백 사용 불가)
        // 3. 반드시 밑줄 또는 문자로 시작가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 문자는 제외)
        // 6. 예약어는 사용 불가(public, static, void, int, double, float, String, ...)

        // 다른 나라 입국을 위한 입국 신고서(여행)
        String nationality = "대한민국"; // 국적
        String firstName = "상수"; // 이름
        String lastName = "박";// 성
        String dateOfBirth = "1987-03-26"; // 생년월일
        String residentialAdress = "무슨호텔"; // 체류지
        String purposeOfVisit = "관광"; // 목적
        String flightNo = "KE657"; //비행기 편명
        String _flightNo = "KE657"; // 밑줄 시작
        String flight_No_2 = "KE657"; // 밑줄과 숫자 포함

        int accompany = 2;//동반 가족수
        int lengthOfStay = 5; // 체류기간

        String item1 = "시계";
        String item2= "가방";
//        String 3item = "전자제품";

        //프로그램의 흐름을 위해 사용되는 경우 등(크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        // 상수 : 절대 변하지 않는 값은 대문자로
        final String CODE = "KR";
//        CODE = "us";
    }
}
