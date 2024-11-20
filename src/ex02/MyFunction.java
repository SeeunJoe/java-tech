package ex02;

// 입력을 받아서(매개변수 존재) 결과를 반환(return 존재)
public interface MyFunction<T,R> {
    R apply(T t);

}
