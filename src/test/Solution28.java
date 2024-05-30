package test;
//두 정수 a, d와 길이가 n인 boolean 배열 included가 주어집니다. 

//첫째항이 a, 공차가 d인 등차수열에서 included[i]가 i + 1항을 의미할 때, 
//이 등차수열의 1항부터 n항까지 included가 true인 항들만 더한 값을 return 하는 solution 함수를 작성해 주세요.

public class Solution28 {
    public static int solution(int a, int d, boolean[] included) {
        int answer = 0;
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += a;
                a += d;
            } else {
                a += d;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        boolean[] a = new boolean[] { true, false, true };
        System.out.println(solution(3, 2, a));
    }
}
