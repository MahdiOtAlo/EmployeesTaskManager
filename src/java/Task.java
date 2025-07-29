public class Task {
    private int id;
    private String description;
    private double estimateHour;
    private int employeeID;

    public Task(int id, String description, double estimateHour) {
        this.id = id;
        this.description = description;
        this.estimateHour = estimateHour;
    }

    public Task(int id, String description, double estimateHour, int employeeID) {
        this(id, description, estimateHour);
        this.employeeID = employeeID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

//    public void setEmployeeID(int employeeID) {
//        this.employeeID = employeeID;
//    }

//    public int getId() {
//        return id;
//    }

    public String getDescription() {
        return description;
    }

    public double getEstimateHour() {
        return estimateHour;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setEstimateHour(double estimateHour) {
//        this.estimateHour = estimateHour;
//    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", estimateHour=" + estimateHour +
                ", employeeID=" + employeeID +
                '}';
    }
}


