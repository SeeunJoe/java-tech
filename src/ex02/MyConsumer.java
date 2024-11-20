package ex02;

// 입력만 받고 출력이 없는 연산을 수행합니다.
public interface MyConsumer<T> { // 무슨 타입 들어올지 모르니까 제네릭 사용
    void accept(T data);
}
