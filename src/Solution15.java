import java.util.HashMap;
import java.util.Map;

//participant = 마라톤에 참여한 선수들의 리스들 1~100000  동명이인 있을 수 있음 -> 중복제거하는 hashset안됨
//중복 허용하는애 써야함  List: 순서가 있으며, 데이터(값) 중복 허용
//hashmap: HashMap은 데이터를 저장할 때 키(Key)와 밸류(Value)가 짝을 이루어 저장
//동명이인이면, VALUE는 같아도 KEY가 다르니까.. 다르게 담으면 되겠다..!!
//completion = 그 중 완주한 선수들의 이름이 담긴 배열 // participant.size() -1 
//완주하지 못한 선수 이름은 -> participant에는 있지만, completion 없는!! 
//하지만,,,동명이인일 경우 participant에도 있을 수 있고 completion 있을 수 있다,,!!


public class Solution15 {
    public static void main(String[] args) {
        String[] participant = { "a", "b", "c", "d", "e", "a" };
        String[] completion = { "a", "c", "d", "e", "b" };
        Map<String, Integer> part = new HashMap<>();

        for (String p : participant) {
            part.put(p, part.getOrDefault(p, 0) + 1);
            System.out.println(part);
            System.out.println(p);
        }
        for (String c : completion) {
            part.put(c, part.get(c) - 1);
            System.out.println(part);
        }
        for (String key : part.keySet()) {
            if (part.get(key) != 0) {
                System.out.println(key);
                break;
            }
        }
    }
}
