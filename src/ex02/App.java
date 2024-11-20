package ex02;

// 1. 람다는 인터페이스로 만든다.
// 2. 인터페이스에는 메서드가 하나만 존재해야한다.
// 3. 메서드가 인터페이스를 매개변수로 받고 있으면, 행위를 주세요!!! (interface....)
// 4. 람다표현식 (()->{})에서는 매개변수에 타입을 생략 가능하다.

public class App {
    public static void main(String[] args) {
        MyConsumer<Integer> r1 = (data -> { // 람다식
        });
        r1.accept(1);

    //    MySupplier<String> r2 = () -> {}; //람다표현식
    //    MySupplier<String> r2 = () -> {return "good"}; 람다표현식 -> 여러줄 사용시 {}사용
    //    MySupplier<String> r2 = () -> return good; {}생략 가능
        MySupplier<String> r3 = () -> "good";
        String  msg = r3.get();
        System.out.println(msg);
    }
}
