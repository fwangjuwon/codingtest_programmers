package test;
//정수 리스트 num_list가 주어질 때, 

///마지막 원소가 그전 원소보다 크면 마지막 원소에서 그전 원소를 뺀 값을 
//마지막 원소가 그전 원소보다 크지 않다면 마지막 원소를 두 배한 값을 추가하여 return하도록 solution 함수를 완성해주세요.

public class Solution32 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int last = num_list[num_list.length - 1]; // 마지막 원소
        int lastbefore = num_list[num_list.length - 2]; // 마지막 원소에서 그 전 원소

        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }

        if (last > lastbefore) {
            answer[num_list.length] = last - lastbefore;
        } else {
            answer[num_list.length] = last * 2;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[] { 2, 1, 6, 3, 5 }));

    }
}
