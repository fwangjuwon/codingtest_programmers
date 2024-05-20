package study;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        // 1. null 이 허용된다.
        hs.add(null);
        System.out.println(hs);

        // 2. 순서가 보장되지 않는다.
        hs.add(3);
        hs.add(1);
        hs.add(5);
        System.out.println(hs);

        // 3. 중복 값을 허용하지 않는다.
        hs.add(3);
        System.out.println(hs);
    }
}
