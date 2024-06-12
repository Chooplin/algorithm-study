package programmers.java.Lv0;

public class 두_수의_나눗셈 {
    public static void main(String[] args) {
        int solution = solution(7, 3);
        System.out.println("결과 : " + solution);
    }

    public static int solution(int num1, int num2) {
        return (int) ((double) num1 / (double) num2 * 1000);
    }
}
