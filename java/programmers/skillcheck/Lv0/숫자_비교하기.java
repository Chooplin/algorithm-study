package programmers.skillcheck.Lv0;

public class 숫자_비교하기 {
    public static void main(String[] args) {
        int solution = solution(11, 11);
        System.out.println("결과 : " + solution);
    }

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
