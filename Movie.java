package movies;

public class Movie implements Comparable<Movie>{

	private String 	title;
	private int 	year;
	
	public Movie(String title, int year) {
		this.title = title;
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getYear() {
		return year;
	}
	
	public boolean equals(Object x) {
		Movie that = (Movie)x;
		return this.compareTo(that) == 0;
	}
	
	public int compareTo(Movie that) {
		int titleCmp = this.title.compareTo(that.title);
		if (titleCmp != 0) {
			return titleCmp;
		}
		if (this.year < that.year) {
			return -1;
		}
		else if (this.year == that.year) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	public String toString() {
		return "Movie " + title + " (" + year + ")";
	}
	
	public static Movie[] getTestMovies() {
		Movie[] allMovies = new Movie[10];
		allMovies[0] = new Movie("Aladdin", 1968);
		allMovies[1] = new Movie("Aladdin", 1956);
		allMovies[2] = new Movie("Mr.Penguin", 1977);
		allMovies[3] = new Movie("Fremont", 1977);
		allMovies[4] = new Movie("The Parent Trap", 1998);
		allMovies[5] = new Movie("The Parent Trap", 1998);
		allMovies[6] = new Movie("The Intern", 2015);
		allMovies[7] = new Movie("Tangled", 2013);
		allMovies[8] = new Movie("Up", 2008);
		allMovies[9] = new Movie("Pride & Prejudice", 2003);
		return allMovies; 
	}
	
	public int hashCode() {
		return title.hashCode() + year;
	}
}
