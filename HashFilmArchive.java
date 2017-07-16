package movies;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashFilmArchive extends HashSet<Movie> implements FilmArchive {

	public ArrayList<Movie> getSorted() {
		HashSet<Movie> hashy = new HashSet<Movie>(this);
		ArrayList<Movie> someMovies = new ArrayList<Movie>(hashy);
		return someMovies;
	}
	
	public static void main(String[] args) {
		HashFilmArchive archive = new HashFilmArchive(); for (Movie m: Movie.getTestMovies())
		archive.add(m);
		 
		for (Movie m: archive) System.out.println(m);
		}

}
 