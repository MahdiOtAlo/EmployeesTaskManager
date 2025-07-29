import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Anthony", "Stark");       // Iron Man
        Employee employee2 = new Employee(2, "Natasha", "Romanoff"); // Black Widow
        Employee employee3 = new Employee(3, "Steve", "Rogers");     // Captain America

        EmployeeManager.addEmployee(employee1);
        EmployeeManager.addEmployee(employee2);
        EmployeeManager.addEmployee(employee3);

        EmployeeManager.updateEmployee(employee1.getId(), "tony", "Stark");

        EmployeeManager.removeEmployee(employee2.getId());

        List<Task> allTasks = new ArrayList<>();

        Task task1Employee1 = new Task(1, "Design new armor", 7.0, employee1.getId());
        Task task2Employee1 = new Task(2, "Upgrade AI system", 8.5, employee1.getId());
        Task task3Employee1 = new Task(3, "Review tech specs", 3.0, employee1.getId());
        Task task4Employee1 = new Task(4, "Test flight systems", 4.5, employee1.getId());
        Task task5Employee1 = new Task(5, "Prepare Avengers presentation", 2.0, employee1.getId());



        Task task1Employee3 = new Task(5, "Lead team meeting", 3.5, employee3.getId());
        Task task2Employee3 = new Task(6, "Train squad", 7.5, employee3.getId());
        Task task3Employee3 = new Task(7, "Plan defense strategy", 6.0, employee3.getId());
        Task task4Employee3 = new Task(8, "Inspect equipment", 2.5, employee3.getId());
        System.out.println(task4Employee3);



        TaskManager.removeTask(5);

        TaskManager.addTask(task1Employee1);
        TaskManager.addTask(task2Employee1);
        TaskManager.addTask(task3Employee1);
        TaskManager.addTask(task4Employee1);


        TaskManager.addTask(task1Employee3);
        TaskManager.addTask(task2Employee3);
        TaskManager.addTask(task3Employee3);
        TaskManager.addTask(task4Employee3);

        TaskManager.updateTask("Motivate team", 1.5, 3, 8);



        allTasks.add(task1Employee1);
        allTasks.add(task2Employee1);
        allTasks.add(task3Employee1);
        allTasks.add(task4Employee1);


        allTasks.add(task1Employee3);
        allTasks.add(task2Employee3);
        allTasks.add(task3Employee3);
        allTasks.add(task4Employee3);


        System.out.println("All tasks:");
        TaskFilterer.printTasks(allTasks, task -> true);

        System.out.println("\nTasks with estimated hours >= 5:");
        TaskFilterer.printTasks(allTasks, task -> task.getEstimateHour() >= 5);
    }
}