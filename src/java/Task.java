import java.sql.Timestamp;

public class Task {
    private int id;
    private  String description;
    private  double estimateHour;

    public Task(int id, String description, double estimateHour) {
        this.id = id;
        this.description = description;
        this.estimateHour = estimateHour;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getEstimateHour() {
        return estimateHour;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEstimateHour(double estimateHour) {
        this.estimateHour = estimateHour;
    }
}


