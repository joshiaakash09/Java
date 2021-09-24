package Week_one.Assignment_Three.Inheritance;

public class Task {
    protected String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public static void main(String[] args) {
        //create a todo task and print details
        Todo t = new Todo("Read a good book");
        System.out.println(t.getDescription());
        System.out.println(t.isDone());

        //create todo fields and print again
        t.setDone(true);
        System.out.println(t.isDone());

        //create a deadline task and print details
        Deadline d = new Deadline("Read textbook", "Nov 16");
        System.out.println(d.getDescription());
        System.out.println(d.isDone());
       // System.out.println(d.getBy());

        //change deadline details and print again

        d.setDone(true);
        d.setBy("Postponed to Nov 18th");
        System.out.println(d.isDone());
      // System.out.println(d.getBy());
    }
}
