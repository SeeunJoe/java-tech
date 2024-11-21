package ex02;

// 입력을 받아 논리값의 반환<T> - 결과값을 리턴한다.
public interface MyPredicate<T> {
    boolean apply(T t);
}
