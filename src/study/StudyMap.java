package study;

import java.util.HashMap;
import java.util.Map;

public class StudyMap {
    public static void main(String[] args) {
        // i에 array의 값을 넣어준다.
        int array[] = { 1, 2, 4, 5, 7, 2, 3, 4, 7 };
        for (int i : array) {
            System.out.println("i값은? " + i);
        }

        //map에다가 key와 value를 넣어준다.
        Map<String, String> hs = new HashMap<String, String>();
        hs.put("a", "첫번째");
        hs.put("b", "두번째");
        hs.put("c", "세번째");
        hs.put("d", "네번째");

        //keyStr값에 map의 key값을 넣어줄거고,
        for (String keyStr : hs.keySet()) {
            // map의 key값에 map의 key를 가져와서 value값을 보여준다.
            System.out.println("key??? " + keyStr + "value??? " + hs.get(keyStr));
        }
        
        //map의 null 대신 기본 값을 반환하도록 할 수 있는 메소드가 getOrDefault()
        /*         getOrDefault(Object key, V defaultValue)
        ・Object key : 찾는 key 값
        ・V defaultValue : 찾는 key 의 value 값이 없거나 null 일때 반환하는 값 */

        Map<String, String> map = new HashMap<>();
        // 추가
        map.put("red", "빨강");
        map.put("blue", "파랑");
        map.put("purple", "보라");
        // getOrDefault()
        System.out.println(map.getOrDefault("red", "디폴트값"));
        System.out.println(map.getOrDefault("blue", "디폴트값"));
        System.out.println(map.getOrDefault("orange", "디폴트값"));

    }
}
