package test;

//정수 number와 n,m이 주어집니다.
//number가 n의 배수이면서 m의 배수이면 1 을 아니라면 0 을 return하도록 solution 함수를 완성해주세요.
public class Solution23 {

    public int solution(int number, int n, int m) {
        int answer = 0;
        if(number%n==0 && number%m ==0){
            return answer += 1;
        } else {
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution23 sol23 = new Solution23();
        System.out.println(sol23.solution(24,4,7));
    }
}
