// Task 객체를 정의하는 Class
// TODO : 연, 월, 일, hieranchy 에 대해 get/set 메소드 만들기 (입력값을 검증해야 하기 때문)
// 솔직히 시간 별로 없고 주의만 한다면 안만들어도 될수도?? 그냥 싹다 public으로 해도 될듯.

public class Task {
    int id;
    String task_name;
    String description;
    int start_year;
    int start_month;
    int start_day;
    int end_year;
    int end_month;
    int end_day;
    private states state;
    private int hierachy;

    private enum states {Todo, Doing, Done}

    public boolean setState(String input) {
        states inputState;
        try {
            inputState = states.valueOf(input);
        } catch (java.lang.IllegalArgumentException e) {
            return false;      // states에 저장된 정해진 문자열을 쓰지 않을 시 Error 발생 알림.
        }

        this.state = inputState;
        return true; // 정상 작동 알림
    }

    public states getState(){
        return this.state;
    }



// 디버깅용 main 코드
    public static void main(String args[]) {
        Task a = new Task();
        a.task_name = "hello world!";
        System.out.println(a.task_name);

        if(a.setState("sds")){           // 이 곳에 값을 넣어서 확인해 봅시다.
            System.out.println(a.getState());
        }
        else{
            System.out.println("입력 오류");
        }
    }
}



