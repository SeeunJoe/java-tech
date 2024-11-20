package ex04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountApp {
    public static void main(String[] args) {
        // 1. count
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie","David");

        List<String> r1 = names.stream()
                //2. 중간연산자 filter -> 가공
                //filter -> 1. 삭제 2. 검색 기능이 있다.
                .filter(name -> name.length() > 3)
                //.collect(Collectors.toList()); -> toList()
                . toList(); // 3. 수집


        r1.forEach(s -> System.out.println(s));

        long r2 = names.stream()
                .filter(name-> name.length()>2)
                .count();

        System.out.println(r2);

    }
}
