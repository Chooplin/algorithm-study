package programmers.java.Lv0;

import java.time.LocalDate;

public class 나이_출력 {
    public static void main(String[] args) {
        int solution = solution(40);
        System.out.println("결과 : " + solution);
    }

    public static int solution(int age) {
        return LocalDate.now().getYear() - age - 1;
    }
}
