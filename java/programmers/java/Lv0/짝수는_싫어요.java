package programmers.java.Lv0;

public class 짝수는_싫어요 {
    public static void main(String[] args) {
        int[] solution = solution(11);
        System.out.println("결과 : " + solution.toString());
    }

    public static int[] solution(int n) {
        int[] result = new int[(n / 2) + (n % 2)];
        int odd = 1;

        for (int i = 0; i < result.length; i++) {
            result[i] = odd;
            odd += 2;
        }
        return result;
    }
}
