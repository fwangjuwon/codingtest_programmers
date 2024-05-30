package test;

//정수가 담긴 리스트 num_list가 주어질 때,
//모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1 을 
//크면 0 을 return하도록 solution 함수를 완성해주세요.
public class Solution30 {
    public static int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int cross = 1;
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            cross = cross * num_list[i];
        }
        if (cross < sum * sum) {
            answer = 1;
        } else {
            answer = 0;
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,5}));
    }
}
