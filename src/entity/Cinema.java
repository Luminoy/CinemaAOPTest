package entity;

public class Cinema {
	public void showTheMovie() {
        System.out.println("Showing the movie");
    }

    public void showTheMovie(String movieName) {
        System.out.println(String.format("The %s is showing", movieName));
    }

    public void showTheMovie(Movie movie) {
        System.out.println(String.format("The %s of %s is showing", movie.getMovieName(), movie.getMovieType()));
    } 
    
    public String playTheMovie() {
        return "Stopping";
    }
}
