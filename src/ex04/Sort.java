package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        // 1. sort
        List<Integer> nums =  Arrays.asList(5,3,1,4,2);

        nums.stream()
                .sorted() // 모든 알고리즘의 시작 정렬! -> quicksort
                // binary search
                .distinct() // 중복 제거 -> 정렬하고 비교하는 게 낫다!
                .forEach(integer -> System.out.print(integer));

    }
}
