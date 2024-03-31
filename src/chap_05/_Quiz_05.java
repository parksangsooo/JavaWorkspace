package chap_05;

public class _Quiz_05 {
    // 신발 사이즈는 250부터 295까지 5 단위로 증가
    // 신발 사이즈 수는 총 10가지

    // 출력결과
    // 사이즈 250 (재고있음)
    // 사이즈 255 (재고있음)
    // ...

    public static void main(String[] args) {
    // int[] sizeArray = {250, 255, 260, ...}
        int[] sizeArray = new int[10];

        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + (5 * i); // 5 단위로 점점 커지는 공식
            }

        for (int size : sizeArray) {
            System.out.printf("사이즈 %d (재고있음)\n", size);
        }
        }

    }
