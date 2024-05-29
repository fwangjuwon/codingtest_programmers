package test;

public class Solution17 {

    public static String solution(String str1, String str2) {
        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer = answer + str1.charAt(i) + str2.charAt(i);
        }

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        solution("aaaa", "bbbb");
    }
}
