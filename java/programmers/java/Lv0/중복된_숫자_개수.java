package programmers.java.Lv0;

public class 중복된_숫자_개수 {
    public static void main(String[] args) {
        int[] numbers = {0, 31, 24, 10, 1, 9, 1, 1, 2, 31};
        int solution = solution(numbers, 1);
        System.out.println("결과 : " + solution);
    }

    public static int solution(int[] array, int n) {
        int cnt = 0;
        for (int number : array) {
            if (number == n) {
                cnt++;
            }
        }

        return cnt;
    }
}
