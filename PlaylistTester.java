/**
 * Sample of a tester file for the Playlist class. This file should demonstrate all the capability of your
 * playlist in the main method. You don't need to follow the testing specifications of this exactly
 * if you want to write your own separate tester instead.
 * Note that there's no need for a Scanner in this project-- all of the playlist can be 'hardcoded' into main.
 * @author Eli Axel + Gabriel Chae
 * @version 1-28-2025
 */
public class PlaylistTester {
    public static void main(String[] args) {
        System.out.println("Initializing a Playlist...\n");
        
        Playlist p = new Playlist();

        System.out.println("Adding songs to the Playlist...\n");
        /**
         * Add some songs here. Note that the format for adding a Song to a Playlist p
         * is something like...
         * p.addSong(new Song(..., ..., ...))
         */
        Song s1 = new Song("Check the Rhime", "A Tribe Called Quest", "3:36");
        Song s2 = new Song("Them Bones", "Alice in Chains", "2:29");
        Song s3 = new Song("Simple Twist of Fate", "Bob Dylan", "4:17");
        Song s4 = new Song("Chan Chan", "Buena Vista Social Club", "4:18");
        Song s5 = new Song("So Much to Say", "Dave Matthews Band", "4:07");
        p.addSong(s1);
        p.addSong(s2);
        p.addSong(s3);
        p.addSong(s4);
        p.addSong(s5);
        System.out.println("Added " + s1.toString());
        System.out.println("Added " + s2.toString());
        System.out.println("Added " + s3.toString());
        System.out.println("Added " + s4.toString());
        System.out.println("Added " + s5.toString());



        System.out.println("Printing the songs...\n");
        //Print out all the songs in the playlist to verify it's working correctly

        p.getSongs();

        System.out.println("\nLiking the songs in position 0,2,3\n");
        //Once your songs are 'liked', this should be reflected in the next printout

        p.likeSong(0);
        p.likeSong(2);
        p.likeSong(3);


        System.out.println("Printing the songs...\n");

        p.getSongs();

        System.out.println("\nRemoving the song in position 0 \n");

        p.removeSongs(0);

        System.out.println("Printing the songs...\n");

        p.getSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main!

        p.getLiked();

        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds

        p.getDuration();

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call

        p.removeUnlikes();

        System.out.println("Printing all songs...\n");
        //This should now look like only the liked songs list from before

        p.getSongs();
    }
}
