package chap_06;

public class _03_Return {
    // 반환값, return
    // 호텔정보를 관리하는 프로그램 >> 전화번호, 주소, 액티비티

    // 호텔 전화번호
    public static String getPhoneNumber (){
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }

    // 호텔 주소
    public static String getAddress(){
        return "서울시 어딘가";
    }

    // 호텔 액티비티
    public static String getActivities(){
        return "볼링장, 탁구장, 노래방, 바비큐";
    }

    public static void main(String[] args) {
        String contactNumber = getPhoneNumber(); // 반환값
        System.out.println("호텔 전화번호: " + contactNumber);

        String adress = getAddress();
        System.out.println("호텔 주소: " + adress);

        System.out.println("호텔 액티비티: " + getActivities());

    }
}
