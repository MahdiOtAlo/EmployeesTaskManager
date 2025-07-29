import java.sql.SQLException;

public class TaskManager {

    public static void addTask(Task task) {
        validateTask(task);
        try {
            String sql = "insert into tasks (description, employee_id, estimate_time)values(?, ?, ?)";
            DBUtil.executeLine(sql, task.getDescription(), task.getEmployeeID(), task.getEstimateHour());
            System.out.println("New Task added.");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void updateTask(String description, double estimateHour, int employeeID, int id) {
        validateTask(new Task(id, description, estimateHour));
        try {
            String sql = "update tasks set description = ?, estimate_time = ?, employee_id = ? where id = ?";
            DBUtil.executeLine(sql, description, estimateHour, employeeID, id);
            System.out.println("task updated.");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void removeTask(int id) {
        try {
            String sql = "delete from tasks where id = ?";
            DBUtil.executeLine(sql, id);
            System.out.println("task removed.");
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static void validateTask(Task task) {
        if (task == null) {
            throw new InvalidTaskException("Task cannot be null.");
        }
        if (task.getDescription() == null || task.getDescription().isEmpty()) {
            throw new InvalidTaskException("Task description cannot be empty.");
        }
        if (task.getEstimateHour() <= 0) {
            throw new InvalidTaskException("Task estimated hours must be positive.");
        }
    }
}
