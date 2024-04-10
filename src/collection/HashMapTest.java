package collection;

import java.util.HashMap;
import java.util.TreeMap;

// 검색을 위한 알고리즘
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(100,"test");
        map.put(200,"abc");
        map.put(300,"zzz");

        String str = map.get(100);
        System.out.println(str);

        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(100,"test");
        treeMap.put(300,"abc");
        treeMap.put(200,"zzz");

        System.out.println(treeMap);
    }
}
