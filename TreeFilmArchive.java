package movies;
import java.util.TreeSet;
import java.util.ArrayList;

public class TreeFilmArchive extends TreeSet<Movie> implements FilmArchive {

	public ArrayList<Movie> getSorted() {
		ArrayList<Movie> mo = new ArrayList<Movie>(this);
		return mo;
	}
	
	public static void main(String[] args) {
		TreeFilmArchive archive = new TreeFilmArchive(); for (Movie m: Movie.getTestMovies())
		archive.add(m);
		 
		for (Movie m: archive) System.out.println(m);
		}

}
