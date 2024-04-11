package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowException test = new ThrowException();
        try {
            test.loadClass("a2.txt", "Test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
