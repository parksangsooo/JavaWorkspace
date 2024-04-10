package generic;

public class GenericPrinterTest {
    public static void main(String[] args) {

        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMeterial(new Powder());
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMeterial(new Plastic());
        System.out.println(plasticPrinter);

        GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();


    }
}
