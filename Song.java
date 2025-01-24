/**
 * File for a Song class to be used in the Playlist Project
 * @author Eli Axel + Gabriel Chae
 * @version 1-24-2025
 */
public class Song {
    
    private String title;
    private String artist;
    private String duration;
    private boolean like;

    /**
     * overloaded constructor for song without a like import
     */
    public Song(String title, String artist, String duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        like = false;
    }

    /**
     * overloaded constructor for song with a like import
     */
    public Song(String title, String artist, String duration, boolean like){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.like = like;
    }

    /**
     * mutater method to like the song
     */
    public void like(){
        like = true;
    }

    /**
     * getter method for title
     * @return title of song
     */
    public String getTitle(){
        return title;
    }

    /**
     * getter method for artist
     * @return artist of song
     */
    public String getArtist(){
        return artist;
    }

    /**
     * getter method for duration
     * @return duration as String
     */
    public String getDuration(){
        return duration;
    }

    /**
     * getter method for like
     * @return like
     */
    public boolean getLike(){
        return like;
    }

    /**
     * gets the song in a full string
     * @return toString
     */
    public String toString(){
        if (like){
        return (title + " by " + artist + ". " + duration + ". This song is liked.");
        }
        else{
            return (title + " by " + artist + ". " + duration + ". This song is not liked.");
        }
    }

}
