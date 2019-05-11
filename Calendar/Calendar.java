package Calendar;

import java.util.ArrayList;
import java.util.Calendar;

public class Calendar {
	
	private Calendar calendar;
	private ArrayList<Task> task_list;
	//Constructor Of Calendar class
	//Take task_list and make calendar
	Calendar(){
		
	}
	
	
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


