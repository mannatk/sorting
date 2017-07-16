package movies;
import java.util.ArrayList;
import java.util.TreeSet;

public class ListFilmArchive extends ArrayList<Movie> implements FilmArchive{
	
	public boolean add(Movie that) {
		for(Movie m: this) {
			if(m.getYear() == that.getYear() && m.getTitle().equals(that.getTitle())) {
				return false;
			}
		}
		super.add(that);
		return true;
	}
	
	public ArrayList<Movie> getSorted() {
		TreeSet<Movie> tree = new TreeSet<Movie>(this);
		ArrayList<Movie> someMovies = new ArrayList<Movie>(tree);
		return someMovies;
		
	}
	
	public static void main(String[] args) {
		ListFilmArchive archive = new ListFilmArchive(); for (Movie m: Movie.getTestMovies())
		archive.add(m);
		 
		for (Movie m: archive) System.out.println(m);
	}
}
