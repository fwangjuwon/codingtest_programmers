package test;

import java.util.Arrays;
import java.util.HashMap;

public class Solution14 {
    public static void main(String[] args) {
        // participant = 마라톤에 참여한 선수들의 리스들 1~100000 동명이인 있을 수 있음 -> 중복제거하는 hashset안됨
        // 중복 허용하는애 써야함 List: 순서가 있으며, 데이터(값) 중복 허용
        // hashmap: HashMap은 데이터를 저장할 때 키(Key)와 밸류(Value)가 짝을 이루어 저장
        // 동명이인이면, VALUE는 같아도 KEY가 다르니까.. 다르게 담으면 되겠다..!!

        // completion = 그 중 완주한 선수들의 이름이 담긴 배열 // participant.size() -1
        // 완주하지 못한 선수 이름은 -> participant에는 있지만, completion 없는!!
        // 하지만,,,동명이인일 경우 participant에도 있을 수 있고 completion 있을 수 있다,,!!
        // if(participant의 value값이 2개이상이고, completion에 값이 하나 있으면){return participant}
        // else{return participant}
        // 완주하지못한사람을 출력!
        String[] participant = { "a", "b", "c", "d", "e", "a" };
        String[] completion = { "a", "c", "d", "e", "b" };
        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < participant.length; i++) {
            if (participant[i].equals(participant[i + 1])) {
                String loser = participant[i];
                System.out.println(loser);
            } else {
                continue;
            }
        }

        /*
         * for (int i = 0; i < completion.length; i++) {
         * if (participant[i].equals(completion[i])) {
         * continue;
         * } else {
         * System.out.println(participant[i]);
         * }
         * }
         * 
         * System.out.println(participant[participant.length - 1]);
         */
        // array를 사용하면,,, 동명이인의 경우를 return하는게 힘듦!!
    }
}
