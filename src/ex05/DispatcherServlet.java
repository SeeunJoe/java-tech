package ex05;

public class DispatcherServlet {

    private final Controller con;
    private  final ControllerAdvice controllerAdvice;

    public DispatcherServlet(Controller con, ControllerAdvice controllerAdvice) {
        this.con = con;
        this.controllerAdvice = controllerAdvice;
    }

    public void route(String path){
        try {
            if (path.equals("/")) {
                con.list();
            } else if (path.equals("/board")) {
                con.detail();
            } else {
                System.out.println("404 Not Found");
            }
        }catch (RuntimeException e) {
            // 1. 컴포넌트 스캔 @ControllerAdvice
            // 2. invoke(호출) RuntimeException 매개변수를 가진
            controllerAdvice.process(e);
        }


    }
}
