package programmers.java.Lv0;

import java.util.Arrays;

public class 중앙값_구하기 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 7, 8, 3, 6, 11};
        int solution = solution(numbers);
        System.out.println("결과 : " + solution);
    }

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }
}
