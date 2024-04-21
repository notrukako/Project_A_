// Main class for the streaming website management system
public class StreamingSite {
    public static void main(String[] args) {
        // Create media items
        Media movie1 = new Movie("The Matrix","Lana Wachowski","1999", 120.0, true,MediaType.MOVIE,MovieGenre.ACTION);
        Media movie2 = new Movie("Inception", "Christopher Nolan","2010", 150.0,true, MediaType.MOVIE,MovieGenre.SCI_FI);
        Media anime1 = new Anime("Naruto", genre.SHOUNEN, 1,25, "Toei", true, MediaType.ANIME, 25.0);
        Media anime2 = new Anime("Attack on Titan", genre.ACTION,1, 24, "WIT", true, MediaType.ANIME, 30.0);
        Media podcast1 = new Podcast("Mata Najwa", "Najwa", 20.0, genre.DAILY_LIFE, true, MediaType.PODCAST);
        Media podcast2 = new Podcast("Close The Door", "Deddy Corbuzier", 40.0, genre.COMMENTARY, true, MediaType.PODCAST);
        // Create a subscriber
        Subscribers subscriber = new Subscribers("Alice");

        // Subscriber watches media items
        subscriber.watchMedia("M1", movie1);
        subscriber.watchMedia("M2", movie2);
        subscriber.watchMedia("A1", anime1);
        subscriber.watchMedia("A2", anime2);
        subscriber.watchMedia("P1", podcast1);
        subscriber.watchMedia("P2", podcast2);

        // Subscriber adds media items to favorites
        subscriber.addFavorite("M1", movie1);
        subscriber.addFavorite("A1", anime1);
        subscriber.addFavorite("P1", podcast1);
        
        // Display watched media items
        subscriber.displayWatchedMedia();

        // Display favorite media items
        subscriber.displayFavoriteItems();
    }
}
