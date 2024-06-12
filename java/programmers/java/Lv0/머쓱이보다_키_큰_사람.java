package programmers.java.Lv0;

public class 머쓱이보다_키_큰_사람 {
    public static void main(String[] args) {
        int[] numbers = {149, 180, 192, 170};
        int solution = solution(numbers, 1);
        System.out.println("결과 : " + solution);
    }

    public static int solution(int[] array, int height) {
        int cnt = 0;
        for (int p : array) {
            if (p > height) {
                cnt++;
            }
        }
        return cnt;
    }
}
