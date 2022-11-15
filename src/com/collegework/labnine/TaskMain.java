package src.com.collegework.labnine;

import java.time.LocalDateTime;
import src.com.collegework.labnine.HoneyDoList;

public class TaskMain extends HoneyDoList{
    public static void main(String[] args){
        Task postHW = new Task("post 1068 homework", 1, 12, LocalDateTime.of(2022,3,23,13,0), 180);
        System.out.println(postHW.toString());
        System.out.println(postHW.overdue());
        System.out.println(postHW.getPriority());
        HoneyDoList honeydo = new HoneyDoList();
        System.out.println(honeydo);
        honeydo.addTask(new Task("post 1068 homework2", 2, 45, LocalDateTime.of(2022, 3, 23,12, 0), 180));
        System.out.println(honeydo);
        System.out.println(honeydo.shortestTime());

    }
}
