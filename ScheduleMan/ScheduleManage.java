package ScheduleMan;

import DataClass.Task;

public class ScheduleManage{
    static public void addTask(int id, String task_name, String description, int start_year, int start_month, int start_day, int end_year, int end_month, int end_day, String state, int hierarchy){
        Task task=new Task(id, task_name, description, start_year, start_month, start_day, end_year, end_month, end_day, state, hierarchy);
        /* 타 모듈들로 객체를 전달하는 함수 */
        syncDB(task);
        broadcastTask(task);
    }

    static public void deleteTask(int id){
        /* id를 통해 firebase의 DB 내 검색해서 지우는 함수 */
    }

    static public void updateTask(int id){
        /* id를 통해 firebase의 DB 내 검색해서 가져오는 함수 */
        // syncDB();
    }

    static private Task fetchDB(int id){
        /* firebase DB에서 id로 검색하여 해당 Task를 가져오는 함수 */
        return null; // 임시값
    }

    static private void syncDB(Task task){
        /* firebase DB와 동기화하는 함수 */
    }

    static private void broadcastTask(Task task){
        /* 생성된 Task 객체를 타 모듈들로 전달해주는 함수 */
    }


}



