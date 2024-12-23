package test;

public class Solution11 {
    // 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터
    // overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를
    // 작성해 주세요.

    public static String solution11(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());
        return answer;
    }

    public static void main(String[] args) {
        String my_string = "He11oWor1d";
        String overwrite_string = "lloWorl";
        int s = 2;

        String s2 = solution11(my_string, overwrite_string, s);
        System.out.println(s2);
    }
}
