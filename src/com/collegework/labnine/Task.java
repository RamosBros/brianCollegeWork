package src.com.collegework.labnine;

import java.time.LocalDateTime;

public class Task {
    private String name;
    private int priority;
    private int estMinsToComplete;

    private LocalDateTime of;
    private int whenDue;
    private LocalDateTime todaysDate = LocalDateTime.now();


    public Task(String name, int priority, int estMinsToComplete, LocalDateTime of, int whenDue) {
        this.name = name;
        this.priority = priority;
        this.estMinsToComplete = estMinsToComplete;
        this.of = of;
        this.whenDue = whenDue;
    }



    public void setName(String newName) {

        this.name = newName;
    }

    public void setEstMinsToComplete(int newEstMinsToComplete) {
        this.estMinsToComplete = newEstMinsToComplete;
    }

    public String getName() {
        return this.name;
    }

    public int getPriority() {
        return this.priority;
    }

    public int getEstMinsToComplete() {
        return this.estMinsToComplete;
    }

    public String toString() {
        return name + " " + priority + " " + estMinsToComplete + " " + of;
    }

    public int increasePriority(int amount) {
        if (amount < 0) {
            return this.priority;
        } else {
            this.priority = priority + amount;
        }
        return this.priority;
    }

    public int decreasePriority(int amount) {
        if (amount > this.priority) {
            return this.priority;
        } else {
            this.priority = priority - amount;
        }
        return this.priority;
    }

    public boolean overdue() {
        if(todaysDate.isAfter(this.of)){
            return true;
        }
        return false;
    }
}
