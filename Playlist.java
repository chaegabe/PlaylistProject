import java.util.ArrayList;

/**
 * The Playlist class, which will keep track of a playlist of Song objects
 * and mutate them accordingly
 * Methods--
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs (careful with this one!)
 * @author Eli Axel + Gabriel Chae
 * @version 1-28-2025
 */
public class Playlist {
    
   private ArrayList<Song> playlist;

   /**
   * Constructor for playlist
   */
   public Playlist()
   {
      playlist = new ArrayList<Song>();
   }
   
   /**
    * adds a song to the playlist
    * @param song to add
    */
   public void addSong(Song title)
   {
      playlist.add(title);
   }

   /**
    * likes a song in position x
    * @param int position x
    */
   public void likeSong(int x)
   {
      playlist.get(x).like();
   }

   /**
    * removes a song in position
    * @param int position x
    */
   public void removeSongs(int x)
   {
      playlist.remove(x);
   }

   /**
    * prints all songs in the playlist using .toString method
    */
   public void getSongs()
   {
      for (Song song: playlist) 
      System.out.println(song.toString());
   }

   /**
    * prints only the liked songs in the playlist
    */
   public void getLiked()
   {
      for (Song song: playlist){
         if (song.getLike()){
            System.out.println(song.toString());
         }
      }
   }

   /**
    * gets the total duration of all the songs and prints it
    */
   public void getDuration()
   {
      int totalMinutes = 0;
      int totalSeconds = 0;

      for (Song song: playlist) 
      {
         int minutes = Integer.parseInt(song.getDuration().substring(0,1));
         totalMinutes = totalMinutes + minutes;

         int seconds = Integer.parseInt(song.getDuration().substring(2,4));
         totalSeconds = totalSeconds + seconds;

      }
      System.out.println((totalMinutes + (totalSeconds / 60)) + " Minutes " + (totalSeconds - ((totalSeconds / 60) * 60)) + " Seconds"); //NEED TO FIX SECONDS
   }

   /**
    * removes all unliked songs in the playlist
    */
   public void removeUnlikes() //W.I.P
   {
      ArrayList<Song> l = new ArrayList<Song>();
      for (Song i: playlist){
         if (i.getLike()){
            l.add(i);
         }
      }
      playlist.clear();
      for (Song x: l){
         playlist.add(x);
      }
            
   }
}
