package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height;
        int limit = 120;

        height = 115;
        String result = (height >= limit) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);
        height = 121;
        result = (height >= limit) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " + result);

    }
}
