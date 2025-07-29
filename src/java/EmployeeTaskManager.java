//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class EmployeeTaskManager {
//    private Map<Integer, List<Task>> employeeTasks = new HashMap<>();
//
//    public void addTaskToEmployee(int employeeID, Task task) {
//        if (!employeeTasks.containsKey(employeeID)) {
//            employeeTasks.put(employeeID, new ArrayList<>());
//        }
//        employeeTasks.get(employeeID).add(task);
//    }
//
//    public List<Task> getTasksOfEmployee(int employeeID) {
//        if (employeeTasks.containsKey(employeeID)) {
//            return employeeTasks.get(employeeID);
//        } else {
//            return new ArrayList<>();
//        }
//    }
//
//    public void printAllTasks(int employeeID) {
//        List<Task> tasks = getTasksOfEmployee(employeeID);
//        for (Task task : tasks) {
//            System.out.println(task);
//        }
//    }
//
//    public void printTasksWithMinimumTime(int employeeID, double minHours) {
//        List<Task> tasks = getTasksOfEmployee(employeeID);
//        for (Task task : tasks) {
//            if (task.getEstimateHour() >= minHours) {
//                System.out.println(task);
//            }
//        }
//    }
//
//
//
//}
