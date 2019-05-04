package ScheduleMan;

import DataClass.Task;

public class ScheduleManage{
    static public void addTask(int id, String task_name, String description, int start_year, int start_month, int start_day, int end_year, int end_month, int end_day, String state, int hierarchy){
        Task task=new Task(id, task_name, description, start_year, start_month, start_day, end_year, end_month, end_day, state, hierarchy);
    }

    private void syncDB(Task[] tasks){
        /* firebase DB와 동기화하는 함수 내용 */
    }


}



