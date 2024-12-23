package test;

//정수 배열 arr와 2차원 정수 배열 queries이 주어집니다. queries의 원소는 각각 하나의 query를 나타내며, 
// [i, j] 꼴입니다.

// 각 query마다 순서대로 arr[i]의 값과 arr[j]의 값을 서로 바꿉니다.

// 위 규칙에 따라 queries를 처리한 이후의 arr를 return 하는 solution 함수를 완성해 주세요.

public class Solution36 {

    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        System.out.println(queries.length);
        System.out.println(arr.length);
        System.out.println(queries[0][1]);

        for (int n = 0; n < queries.length; n++) {
            int temp = arr[queries[n][0]];
            arr[queries[n][0]] = arr[queries[n][1]];
            arr[queries[n][1]] = temp;
            answer = arr;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 1, 2, 3, 4, 5, 6 }, new int[][] { { 1, 2 }, { 3, 4 } }));
    }
}
