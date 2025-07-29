import java.util.List;

public class TaskFilterer {
    public static void printTasks(List<Task> tasks, TaskFilter filter) {
        for (Task task : tasks) {
            if (filter.test(task)) {
                System.out.println(task);
            }
        }
    }

}
