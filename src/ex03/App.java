package ex03;

import java.util.Optional;

// 옵셔널 : null 처리
public class App {
    public static void main(String[] args) {
        String data1 = null;
        Optional<String> op1 = Optional.ofNullable(data1);
        if (op1.isPresent()) {// ofNUllable해서 자동완성
            String r1 = op1.get();//get 꺼내는거
            System.out.println("r1 : " +r1);
        }
        String data2 = null;
//        Optional<String> op2 = Optional.ofNullable(data2);
//        String r2 = Optional.ofNullable(data2).get(); ->nullpointException뜸
        String r2 = Optional.ofNullable(data2).orElseGet(() -> "없다.");
        System.out.println("r2 : " +r2);

        String data3 = null;
        String r3 = Optional.ofNullable(data3).orElseThrow(() -> new RuntimeException("값이 없는데? 조심해 너!"));
        System.out.println("r3 : " +r3);

    }
}
