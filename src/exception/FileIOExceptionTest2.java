package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
AutoCloseable 구현 시에는 finally 구문이 필요가 없음.
try() 안에다가 리소스를 작성.
*/
public class FileIOExceptionTest2 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("a.txt")){
            fis.read();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
