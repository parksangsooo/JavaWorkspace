package lambda;

@FunctionalInterface
public interface MyMaxNum {
    int getMax(int x, int y);
    //int add(int x, int y);  // 매서드 2개면 오류
}
