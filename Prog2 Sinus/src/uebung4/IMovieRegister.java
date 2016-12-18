package uebung4;

import java.util.Set;

/**
 * Filmregister-Interface
 * 
 * Created by User: 
 * Sven Böhrnsen 
 * IDE: Eclipse 
 * Neon Date: 14.12.2016
 * 
 */
public interface IMovieRegister {

	void addMovie(Filme m);

	void addAll(Filme movies);

	boolean containsMovie(Filme m);

	Filme getMovie(String key);

	void updateMovie(Filme m);

	Set<String> searchMovie(String title);

	void removeMovie(Filme m);

	void removeMovie(String title);

	void updateTitle(String oldTitle, String newTitle);

	Set<String> keySet();

	Set<Filme> movieList();

}
