package src.com.collegework.labnine;

import src.com.collegework.labnine.Task;

import java.util.*;

public class HoneyDoList {
    private Task[] tasks;
    private int numTasks;
    private int INITIAL_CAPACITY;

    public HoneyDoList() {
        numTasks = 0;
        INITIAL_CAPACITY = 0;
        tasks = new Task[INITIAL_CAPACITY];
    }

    public void addTask(Task task) {
        if (this.numTasks <= this.tasks.length) {
            this.tasks[this.numTasks] = task;
            this.numTasks += 1;
        } else {
            Task[] newArray = new Task[INITIAL_CAPACITY];
            for (int i = 0; i < this.INITIAL_CAPACITY; i++) {
                newArray[i] = this.tasks[i];
                this.tasks[i] = null;
            }
            this.numTasks = 1;
            this.tasks[1] = task;
        }
    }

    public int find(String name) {
        if (this.tasks == null) {
            return -1;
        }
        int length = this.tasks.length;
        for (int i = 0; i < this.tasks.length; i++) {
            String arrName = this.tasks[i].getName();
            if (arrName.equalsIgnoreCase(name)) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }

    public int totalTime() {
        int totalTime = 0;
        for (int i = 0; i < this.numTasks; i++) {
            totalTime += this.tasks[i].getEstMinsToComplete();
        }
        return totalTime;
    }

    public int shortestTime() {
        if (this.tasks == null) {
            return -1;
        } else {
            int index = 0;
            int Time = this.tasks[0].getEstMinsToComplete();
            for (int i = 1; i < this.numTasks; i++) {
                if (this.tasks[i].getEstMinsToComplete() < Time)
                    index = i;
                Time = this.tasks[i].getEstMinsToComplete();
            }
            return index;
        }
    }
    public void completeTask(int index){
        for(int i = index; i < this.numTasks - 1; i++){
            this.tasks[i] = this.tasks[i+1];
        }
        this.tasks[this.numTasks] = null;
    }
    public Task getIndex(int index){
        return this.tasks[index];
    }
    public String toString(){
        int taskNum = this.numTasks;
        String taskString = null;
        for(int i = 0; i < taskNum; i++){
            System.out.println(this.tasks[i].toString());
        }
        return taskString;
    }
}
