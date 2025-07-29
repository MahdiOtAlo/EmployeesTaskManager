@FunctionalInterface
public interface TaskFilter {
    boolean test(Task task);
}
