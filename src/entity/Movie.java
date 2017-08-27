package entity;

public class Movie {
    private String movieName;
    private String movieType;
    private Integer series;
    
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getMovieType() {
		return movieType;
	}
	
	public void setMovieType(String movieType) {
		this.movieType = movieType;
	}
	
	public Integer getSeries() {
		return series;
	}
	
	public void setSeries(Integer series) {
		this.series = series;
	}
    
}