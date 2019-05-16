package TaskLlist;
import java.util.ArrayList;
import DataClass.Task;
import DataClass.Team_Member;



public class TaskListFuncs {
    static public void TaskListFuncs(){

    }
    public static void main (String args[]){
        Team_Member []teamMem = {};
        teamMem[0].setId(1);
        teamMem[1].setId(2);
        //ArrayList temp = teamMem[0].getAssignedTask().
        //이 부분에서 getAssigendTask().후에 원하는 함수가 안뜹니다
    }


    static public void showTodoList(int member_id, Team_Member[] memberList) {

        int member_index = 0;
        for(; member_index < memberList.length; member_index ++){//먼저 맴버리스트 훓음

            if( member_id == memberList[member_index].getId()) {//찾고 있는 맴버일 경우
                for(int task_index = 0; task_index < memberList[member_index].getAssignedTask().size(); task_index ++){
                    //그 맴버의 assgined_task훓음
                    Task tempTask = (Task)(memberList[member_index].getAssignedTask().get(task_index));
                    if( tempTask.getState() == "TODO" ){//0은 todo이다
                        System.out.println(memberList[member_index].getAssignedTask()+ "\n");
                        //해당 task 출력
                    }
                }
            }
        }
    }
}
