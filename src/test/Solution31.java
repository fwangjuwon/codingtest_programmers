package test;
//정수가 담긴 리스트 num_list가 주어집니다. num_list의 홀수만 순서대로 이어 붙인 수와 짝수만 순서대로 이어 붙인 수의 합을 return하도록 solution 함수를 완성해주세요.

public class Solution31 {
    public static int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        int intEven = 0;
        int intOdd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even = even + Integer.toString(num_list[i]);
            } else {
                odd = odd + Integer.toString(num_list[i]);
            }
        }
        intEven = Integer.parseInt(even);
        intOdd = Integer.parseInt(odd);
        answer = intEven + intOdd;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4,5}));
    }
}
