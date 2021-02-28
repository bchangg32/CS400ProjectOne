package MovieMakerProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Reader;

// --== CS400 File Header Information ==--
// Author: CS400 Course Staff
// Email: heimerl@cs.wisc.edu / dahl@cs.wisc.edu
// Notes: This dummy class is part of the starter archive for Project One
//        in spring 2021. You can extend it to work on your Project One Final
//        App.
public class BackendDummy implements BackendInterface {

    /**
     * This constructor instantiates a backend with the command line arguments
     * passed to the app when started by the user. The arguments are expected
     * to contain the path to the data file that the backend will read in.
     * @param args list of command line arguments passed to front end
     */
    public BackendDummy(String[] args) {
		System.out.println("Dummy backend; ignoring file paths in argument");
	}

    /**
     * A constructor that will create a backend from data that can be read in
     * with a reader object.
     * @param r A reader that contains the data in CSV format.
     */
    public BackendDummy(Reader r) {
		System.out.println("Dummy backend; ignoring data in argument");
    }

    /**
     * Method to add a genre that the user selected. It will output but not store the
     * genres passed to it.
     */
    @Override
    public void addGenre(String genre) {
        System.out.println("Dummy backend; will ignore genre to add (" + genre + ")");
    }

    /**
     * Method to add a genre that the user selected. It will output but not store the
     * ratings passed to it. 
     */
    @Override
    public void addAvgRating(String rating) {
        System.out.println("Dummy backend; will ignore genre to add (" + rating + ")");
    }

    /**
     * Method to remove a genre that the user selected. It will output but not remove the
     * genre passed to it from the backend object. 
     */
    @Override
    public void removeGenre(String genre) {
        System.out.println("Dummy backend; will ignore genre to remove (" + genre + ")");
    }

    /**
     * Method to remove a rating that the user selected. It will output but not remove the
     * genre passed to it from the backend object. 
     */
    @Override
    public void removeAvgRating(String rating) {
        System.out.println("Dummy backend; will ignore rating to remove (" + rating + ")");
    }

    /**
     * Return the genres added to this backend object. The dummy implementation always returns
     * the same list of genres for testing.
     */
    @Override
    public List<String> getGenres() {
        return Arrays.asList(new String [] { "Western", "Comedy", "Thriller" });
    }

    /**
     * Return the ratings added to this backend object. The dummy implementation always returns
     * the same list of ratings for testing.
     */
    @Override
    public List<String> getAvgRatings() {
        return Arrays.asList(new String[] {"1","2","3","4","5","6","7","8","9","10"});
    }

    /**
     * Returns the number of movies. This is a constant for the dummy impementation.
     */
    @Override
    public int getNumberOfMovies() {
        return 3;
    }

    /**
     * Returns all genres in the dataset. Will return a list of 5 genres for the dummy implementation.
     */
    @Override
    public List<String> getAllGenres() {
        return Arrays.asList(new String [] { "Western", "Comedy", "Thriller", "History", "Action" });
    }

    /**
     * Returns the movies that match the ratings and genres. The dummy implementation will return the
     * same list of three movies.
     */
    @Override
    public List<MovieInterface> getThreeMovies(int startingIndex) {
        ArrayList<MovieInterface> movies = new ArrayList<MovieInterface>();
        movies.add(new MovieInterface() {

            @Override
            public String getTitle() {
                return "Plan 9 from Outer Spacce";
            }

            @Override
            public Integer getYear() {
                return 1959;
            }

            @Override
            public List<String> getGenres() {
                return Arrays.asList(new String[] { "Action", "Comedy" });
            }

            @Override
            public String getDirector() {
                return "Ed Wood";
            }

            @Override
            public String getDescription() {
                return "Residents of California's San Fernando Valley are under attack by flying saucers from outer space.";
            }

            @Override
            public Float getAvgVote() {
                return 5.3f;
            }

            @Override
            public int compareTo(MovieInterface otherMovie) {
                if (this.getTitle().equals(otherMovie.getTitle())) {
                    return 0;
                    // sort by rating
                } else if (this.getAvgVote() < otherMovie.getAvgVote()) {
                    return +1;
                } else {
                    return -1;
                }
            }
            
        });
        // TODO: Fixme! Add two more example movies to the list before returning it (could be
        //       ficticious ones).
        movies.add(new MovieInterface() {

          @Override
          public String getTitle() {
            return "Avengers";
          }

          @Override
          public Integer getYear() {
            return 0;
          }

          @Override
          public List<String> getGenres() {
            return Arrays.asList(new String[] { "Action", "Fiction" });
          }

          @Override
          public String getDirector() {
            return "0";
          }

          @Override
          public String getDescription() {
            return "0";
          }

          @Override
          public Float getAvgVote() {
            return 8.5f;
          }

          @Override
          public int compareTo(MovieInterface otherMovie) {
            return 0;
          }
        });
        movies.add(new MovieInterface() {

          @Override
          public String getTitle() {
            return "Parasite";
          }

          @Override
          public Integer getYear() {
            return 0;
          }

          @Override
          public List<String> getGenres() {
            return Arrays.asList(new String[] { "Mystery", "Thriller" });
          }

          @Override
          public String getDirector() {
            return "0";
          }

          @Override
          public String getDescription() {
            return "0";
          }

          @Override
          public Float getAvgVote() {
            return 9.0f;
          }

          @Override
          public int compareTo(MovieInterface otherMovie) {
            return 0;
          }
        });
        return movies;
    }
}
