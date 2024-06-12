package programmers.skillcheck.Lv0;

public class 배열의_평균값 {
    public static void main(String[] args) {
        int[] numbers = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double solution = solution(numbers);
        System.out.println("결과 : " + solution);
    }

    public static double solution(int[] numbers) {
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum / numbers.length;
    }
}
