import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class mySql_DB {
    // JDBC driver name and database URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/loginsim";

    //  Database credentials
    private static final String USER = "root";
    private static final String PASS = "root";

    private Connection conn = null;
    private Statement stmt = null;

    void connect() throws SQLException {

        // STEP 1: Register JDBC driver
            try {
                Class.forName(JDBC_DRIVER);
            } catch(ClassNotFoundException ex) {
                System.err.println("Unable to load MySQL Driver");
            }


            //STEP 2: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

    }

    void addUser(String user, String password) throws SQLException {
        stmt = conn.createStatement();
        String sql =  "INSERT INTO accounts (User, Password) Values " +
                "('" + user + "', '" + password + "');";
        stmt.executeUpdate(sql);
        stmt.close();
    }

    void close_DB() throws SQLException {
        // STEP 4: Clean-up environment
        conn.close();
    }
}
