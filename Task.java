// Task 객체를 정의하는 Class


public class Task {
    int id;
    String task_name;
    String description;
    private int start_year;
    private int start_month;
    private int start_day;
    private int end_year;
    private int end_month;
    private int end_day;
    private states state;
    private int hierarchy;

    private enum states {TODO, DOING, DONE}


    public int getStartYear() {
        return start_year;
    }

    public void setStartYear(int start_year) {      // // 이론상 모든 정수값 가능하므로 검증 불필요
        this.start_year = start_year;
    }

    public int getStartMonth() {
        return start_month;
    }

    public void setStartMonth(int start_month) {
        if(0<start_month && start_month<=12){
            this.start_month = start_month;
        }
        else{
            System.out.println("입력값 오류. 다시 한번 확인해주세요");
        }
    }

    public int getStartDay() {
        return start_day;
    }

    public void setStartDay(int start_day) {
        if(0<start_day && start_day<=12){
            this.start_day = start_day;
        }
        else{
            System.out.println("입력값 오류. 다시 한번 확인해주세요");
        }
    }

    public int getEndYear() {
        return end_year;
    }

    public void setEndYear(int end_year) {
        this.end_year = end_year;
    }

    public int getEndMonth() {
        return end_month;
    }

    public void setEndMonth(int end_month) {
        if(0<end_month && end_month<=31){
            this.end_month = end_month;
        }
        else{
            System.out.println("입력값 오류. 다시 한번 확인해주세요");
        }
    }

    public int getEndDay() {
        return end_day;
    }

    public void setEndDay(int end_day) {
        if(0<end_day && end_day<=31){
            this.end_day = end_day;
        }
        else{
            System.out.println("입력값 오류. 다시 한번 확인해주세요");
        }
    }

    public int getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(int hierarchy) {
        if(0<= hierarchy && hierarchy <=100){
            this.hierarchy = hierarchy;
        }
        else{
            System.out.println("입력값 오류. 다시 한번 확인해주세요");
        }
    }


    public boolean setState(String input) {
        states input_state;
        try {
            input_state = states.valueOf(input);
        } catch (java.lang.IllegalArgumentException e) {
            return false;      // states에 저장된 정해진 문자열을 쓰지 않을 시 Error 발생 알림.
        }

        this.state = input_state;
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



