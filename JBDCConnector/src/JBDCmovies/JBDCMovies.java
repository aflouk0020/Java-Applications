package JBDCmovies;
import java.sql.*;

public class JBDCMovies {
    
    // Database connection details
    private String url = "jdbc:mysql://localhost:3306/DB4_2024_Movies";
    private String userName = "root";
    private String password = "";
    
    private Connection con = null;
    
    // Constructor to establish the database connection
    public JBDCMovies() {
        try {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            con = DriverManager.getConnection(url, userName, password);
            System.out.println("Database connection established.");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database.");
            e.printStackTrace();
        }
    }
    
    // Method to insert a new movie into the table
    public void insertMovie(String moviename, String producer, String releasedate) {
        PreparedStatement pstmt = null;

        try {
            // SQL insert statement with placeholders
            String insertSQL = "INSERT INTO movies (moviename, producer, releasedate) VALUES (?, ?, ?)";

            // Use PreparedStatement to set the values
            pstmt = con.prepareStatement(insertSQL);
            pstmt.setString(1, moviename);
            pstmt.setString(2, producer);
            pstmt.setString(3, releasedate);

            // Execute the query
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Inserted " + rowsAffected + " row(s) into the 'movies' table.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null) pstmt.close(); // Close PreparedStatement
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to show all movies from the 'movies' table
    public void showAllMovies() {
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Create statement and execute SQL query
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT moviename, producer, releasedate FROM movies");

            // Display all movies
            while (rs.next()) {
                System.out.println("Movie: " + rs.getString("moviename") + 
                    ", Producer: " + rs.getString("producer") + 
                    ", Release Date: " + rs.getString("releasedate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    // Method to close the connection
    public void closeConnection() {
        try {
            if (con != null) {
                con.close();
                System.out.println("Database connection closed.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

//    // Empty main method
//    public static void main(String[] args) {
//        // Main method is empty, you can interact with the class methods from here if needed
//    }
}
