package programmers.skillcheck.Lv0;

public class 짝수의_합 {
    public static void main(String[] args) {
        int solution = solution(10);
        System.out.println("결과 : " + solution);
    }

    public static int solution(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        return  sum;
    }
}
