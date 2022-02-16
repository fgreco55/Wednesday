class Song {
    // Attributes (data members)
    String title;		// song title
    String artist;		// who performed song
    int year;			// when was song written
    double price;		// how much was it

    // Constructor
    Song(String t, String a, int y, double p) {
        title = t;
        artist = a;
        year = y;
        price = p;
    }

    // methods

    /*
     show() - display the values of all the data members
     */
    void show() {
        System.out.println(" Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("  Year: " + year);
        System.out.println(" Price: " + price);
    }

    /*
     showSong() - display the values in an instance on one line
     */
    void showSong() {
        System.out.println(title + ":" + artist + ":" + year + ":" + price);
    }

    /*
     showArtistTitle() - show the values of only artist and title
     */
    void showArtistTitle() {
        System.out.println("Artist: " + artist + "  Title: " + title);
    }

    public static void main(String[] args) {
        System.out.println("This is the main() of the Song class.");
    }
}

