package test;

/* 
길이가 같은 두 문자열 str1과 str2가 주어집니다.
두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 
한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요. */

public class Solution16 {
    public static void main(String[] args) {
        String str1 = "AAAAA";
        String str2 = "BBBBB";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println(str1.charAt(i));
            System.out.println(str2.charAt(i));
        }
    }
}
