/**
 * File for a Song class to be used in the Playlist Project
 * @author 
 * @version 1
 */
public class Song {
    //Fields-- what information do we want each Song to store?
 
    private String title;
    private String artist;
    private String duration;
    private boolean like;



    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song(String title, String artist, String duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        like = false;
    }

    public Song(String title, String artist, String duration, boolean like){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.like = like;
    }



     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */
    public void like(){
        like = true;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public String getDuration(){
        return duration;
    }

    public boolean getLike(){
        return like;
    }

    public String toString(){
        if (like){
        return (title + " by " + artist + ". " + duration + ". This song is liked.");
        }
        else{
            return (title + " by " + artist + ". " + duration + ". This song is not liked.");
        }
    }
    
}
