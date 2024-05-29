package test;

public class Solution18 {
/*     문자들이 담겨있는 배열 arr가 주어집니다.arr의 원소들을
순서대로 이어 붙인 문자열을 return 하는 solution함수를
작성해 주세요. */

//배열에있는걸 하나하나 꺼내서
//그냥 스트링에다 붙이면 안될까? + 로 
public static String solution(String[] arr) {
        String answer = "";
        for(String a : arr){
            answer += a;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a","b","c"}));
    }

}
