package test;

// 정수 num과 n이 매개 변수로 주어질 때,num이 n의 배수이면 1 을 return n의 배수가 아니라면 
// 0 을 return하도록 solution 함수를 완성해주세요.

public class Solution22 {
    public static int solution(int num, int n) {
        int answer = 0;
        if (num % n == 0) {
            return answer += 1;
        } else {
            return answer;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(88, 4));
    }
}
