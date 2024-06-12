package programmers.java.Lv0;

import java.util.Arrays;

public class 최댓값_만들기_1 {
    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9};
        int solution = solution(numbers);
        System.out.println("결과 : " + solution);
    }

    public static int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
