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

        int orgin = 315000;
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

    }
}
