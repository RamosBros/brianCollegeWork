package src.com.collegework.labnine;

public class Task{
    private String name;
    private int priority;
    private int estMinsToComplete;

    public Task(String name, int priority, int estMinsToComplete){
        this.name = name;
        this.priority = priority;
        this.estMinsToComplete = estMinsToComplete;
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setEstMinsToComplete(int newEstMinsToComplete){
        this.estMinsToComplete = newEstMinsToComplete;
    }
    public String getName(){
        return this.name;
    }
    public int getPriority(){
        return this.priority;
    }
    public int getEstMinsToComplete(){
        return this.estMinsToComplete;
    }
    public String toString() {
        return name + " " + priority + " " + estMinsToComplete;
    }
    public int increasePriority(int amount){
        if(amount < 0){
            return this.priority;
        } else {
            this.priority = priority + amount;
        }
        return this.priority;
    }
    public int decreasePriority(int amount){
        if(amount > this.priority) {
            return this.priority;
        } else {
            this.priority = priority - amount;
        }
        return this.priority;
    }


}
