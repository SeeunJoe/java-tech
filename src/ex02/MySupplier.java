package ex02;

// 입력 없이 값을 반환(리턴)
@FunctionalInterface
public interface MySupplier<T> {
    T get(); // 람다로 사용할 인터페이스는 하나의 메소드만 사용가능하다 -> @FunctionalInterface를 사용하여 두개의 메소드가 있으면 오류가 나게 한다.
}
