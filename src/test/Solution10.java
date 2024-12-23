package test;

import java.util.Scanner;

class Solution10 {
    // 문자열 my_string, overwrite_string과 정수 s가 주어집니다. 문자열 my_string의 인덱스 s부터
    // overwrite_string의 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를
    // 작성해 주세요.

    public static String solution10(String my_string, String overwrite_string, int s) {

        String answer = "";
        answer = my_string.substring(0, s);
        answer += overwrite_string;
        answer += my_string.substring(s + overwrite_string.length(), my_string.length());
        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String my_string = sc.next();
        String overwrite_string = sc.next();
        int s = sc.nextInt();

        String s10 = solution10(my_string, overwrite_string, s);
        System.out.println(s10);
    }
}
