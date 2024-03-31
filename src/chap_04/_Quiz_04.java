package chap_04;

public class _Quiz_04 {
    // 조건문을 활용하여 주차요금 정산 프로그램을 작성하시오
    // 조건 : 주차요금은 시간당 4000원(일일 최대 요금은 30,000원
    //       경차 또는 장애인 차량은 최종 요금에서 50% 할인
    // 주차요금 예시
    // 일반차량 5시간 주차시 20,000원 (4000 * 5)
    // 경차 5시간 주차시 10,000원 (4000 * 5 / 2)
    // 장애인 차량 10시간 주차 시 15,000원

    public static void main(String[] args) {
        int hour = 10; // 주차 시간
        boolean isSmallcar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        int fee = hour * 4000; // 주차 정산 요금(시간당 4000원)

        // 30,000원 초과 시 일일 최대 요금으로 수정
        if(fee > 30000) {
            fee = 30000; // 일일 최대 요금 적용
        }

        // 경차 또는 장애인 차량인 경우 50% 할인

        if (isSmallcar || withDisabledPerson){
            fee = fee / 2; //50% 할인 적용
            // fee = (int)(fee * 0.5f);
            // fee *= 0.5f;
        }
        // 실행결과 출력
        System.out.printf("주차 요금은 %,d 원 입니다.",fee);
    }
}
