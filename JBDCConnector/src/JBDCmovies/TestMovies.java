package JBDCmovies;

public class TestMovies {
    public static void main(String[] args) {
        // Create an instance of JBDCMovies (which connects to the database)
        JBDCMovies movieDB = new JBDCMovies();
        
        // Insert new movies into the database
        movieDB.insertMovie("Movie 5", "Producer X", "2025-02-20");
        movieDB.insertMovie("Movie 6", "Producer Y", "2025-03-15");

        // Display all movies
        movieDB.showAllMovies();

        // Close the database connection
        movieDB.closeConnection();
    }
}
