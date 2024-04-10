package generic;

public class GenericPrinter<T extends Material> {         // 상위 클래스를 extends 해서 generic 을 한정시킬 수 있음.
    private T meterial;

    public T getMeterial() {
        return meterial;
    }

    public void setMeterial(T meterial) {
        this.meterial = meterial;
    }

    @Override
    public String toString() {
        meterial.doPrinting();
        return meterial.toString();
    }
}
