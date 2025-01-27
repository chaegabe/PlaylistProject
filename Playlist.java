import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * Refer to the project description to make sure you have access to all available methods
 */
public class Playlist {
    /**
     * Fields-- This will likely just need to be the ArrayList of Songs. Reference our previous problems
     * (CarDealership, Zoo) for structure on how this will look
     */

     private ArrayList<Song> playlist;

     /**
      * Constructor-- this doesn't need any parameters. You should just initialize the ArrayList and
      * then use additional methods to add Songs in one-by-one
      */

      public Playlist()
      {
          // initialize instance variables
        playlist = new ArrayList<Song>();
      }
  
      /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
       */

       public void addSong(Song title)
       {
          playlist.add(title);
       }

       public void likeSong(int x)
       {
         playlist.get(x).like();
       }

       public void removeSongs(int x)
       {
          playlist.remove(x);
       }

       public void getSongs()
       {
          for (Song song: playlist) 
          System.out.println(song.toString());
       }

       public void getLiked()
      {
         for (Song song: playlist){
            if (song.getLike()){
               System.out.println(song.toString());
            }
         }
      }

       public void getDuration()
       {
        for (Song song: playlist) 
        System.out.println(song.getDuration());
       }

      public int getPosition(Song x){
         int pos = 0;
         int fpos = 0;
         for (Song song : playlist){
            if (x.getTitle().equals(song.getTitle())){
               fpos = pos;
            }
            else{
               pos++;
            }
         }
         return fpos;
      }


       public void removeUnlikes() //W.I.P
      {
         for (Song song: playlist){
            if (!(song.getLike())){
               int pos = getPosition(song);
               playlist.remove(pos);
            }
         }
      }
}
