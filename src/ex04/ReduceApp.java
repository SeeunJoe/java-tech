package ex04;

import java.util.Arrays;
import java.util.List;

public class ReduceApp {
    public static void main(String[] args) {
/*        // 1.reduce (join하는...)
        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        int sum = nums.stream()
                .mapToInt(x -> x) //function 무조건 int로 리턴 -> 여기서는 의미없음
                .sum();

        System.out.println(sum);

//  reduce는 수집 연산자라서 (중간연산자가 아님) 마지막에 쓰면 된다.
//        int sum2 = nums.stream()
//                .reduce(5,( prev,next) -> prev + next);
        int sum2 = nums.stream()
                .reduce(5,( prev,next) -> {
                    System.out.println("prev: " + prev + ", next: " + next);
                    System.out.println("----------------------");
                    return prev + next;
                });

        System.out.println(sum2);*/

        int origin = 31500;
        List<Integer> list = Arrays.asList(27000, 32000, 40000, 10000, 40000, 20000, 28000);

        int sum = list.stream()
                .map(integer -> integer - 2000)
                .reduce(origin, (x, y) -> x + y);
        System.out.println("니가 들고 있는 돈 : "+sum);

    }
}
