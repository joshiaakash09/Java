package Week_one.Assignment_Three.Inheritance;

public class Todo extends Task {
    public boolean isDone;

    public Todo(String description) {
        super(description);
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
