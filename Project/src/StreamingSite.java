// Main class for the streaming website management system
public class StreamingSite {
    public static void main(String[] args) {


    
        System.out.println("-----------------------------------");
        System.out.println("Streaming Site");
        System.out.println("-----------------------------------");
        System.out.println("Select an option:");
        System.out.println("  1. One Piece");
        System.out.println("  2. Attack On Titan");
        System.out.println("  3. The Matrix");
        System.out.println("  4. Inception");
        System.out.println("  5. Mata Najwa");
        System.out.println("  6. Close The Door");
        System.out.println("  7. Create an Account?");
        System.out.println("  8. Exit");

        int choice = In.nextInt();
        if (choice >= 1 && choice <= 6) {
            // Create media items
            Media movie1 = new Movie("The Matrix","Lana Wachowski","1999", 120.0, true,MediaType.MOVIE,MovieGenre.ACTION);
            Media movie2 = new Movie("Inception", "Christopher Nolan","2010", 150.0,true, MediaType.MOVIE,MovieGenre.SCI_FI);
            Media anime1 = new Anime("One Piece", genre.SHOUNEN, 1,10, "Toei", true, MediaType.ANIME, 25.0);
            Media anime2 = new Anime("Attack on Titan", genre.ACTION,1, 24, "WIT", true, MediaType.ANIME, 30.0);
            Media podcast1 = new Podcast("Mata Najwa", "Najwa", 20.0, genre.DAILY_LIFE, true, MediaType.PODCAST);
            Media podcast2 = new Podcast("Close The Door", "Deddy Corbuzier", 40.0, genre.COMMENTARY, true, MediaType.PODCAST);
        } else if (choice == 7) {
            String addSubscriber = In.nextLine();
            Subscribers subscriber = new Subscribers(addSubscriber);
        } else if (choice == 8) {
            break;
        } else {
            System.out.println("Pick an option 1 - 7");
        }
    }
}



        subscriber = addSubscriber;

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
