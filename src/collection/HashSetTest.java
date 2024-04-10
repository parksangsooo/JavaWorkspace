package collection;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {

        /*HashSet<Student> set = new HashSet<>();
        set.add(new Student("Kim",1001));
        set.add(new Student("Lee",1002));
        set.add(new Student("Park",1003));
        set.add(new Student("Park",1003));
        // HashSet 에서는 add 할 때 클래스의 equals() 와 hashCode() 를 체크함
        // 따라서 HashSet 을 쓸 때는 equals() 와 hashCode() 를 재정의 해야 함.
        // 안하게 되면 중복건에 대해서 정리가 되지 않는다.

        System.out.println(set);*/

        TreeSet<Student> set = new TreeSet<Student>();      // Tree가 들어간 클래스의 특징은 "정렬이 되는 기준을 주어야함."
        set.add(new Student("Kim",1001));
        set.add(new Student("Lee",1002));
        set.add(new Student("Park",1003));
        set.add(new Student("Park",1003));

        System.out.println(set);

        TreeSet<String> strSet = new TreeSet<>();
        strSet.add("test");
        strSet.add("abc");
        strSet.add("bbb");

        System.out.println(strSet);

    }
}
