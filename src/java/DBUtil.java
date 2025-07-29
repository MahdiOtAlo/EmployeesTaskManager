import java.sql.*;

public class DBUtil {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/employee_task_manager";
        String username = "postgres";
        String password = "5349";

        return DriverManager.getConnection(url, username, password);
    }

    public static void executeLine(String sql, Object... params) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            statement.setObject(i + 1, params[i]);
        }
        statement.execute();
    }
}