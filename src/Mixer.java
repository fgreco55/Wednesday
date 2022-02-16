/*
 Mixer - main application
 */
public class Mixer {
    public static void main(String[] args) {
        Song mySong = new Song("Slide", "H.E.R.", 2019, 1.50);
        Song anotherSong = new Song("So What", "Miles Davis", 1959, .99);

        mySong.show();
        anotherSong.show();

        mySong.showArtistTitle();
        anotherSong.showSong();
    }
}
