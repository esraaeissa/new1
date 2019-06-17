/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_partC;

/**
 * The user profile for the OnlineMovie system. The user has a userID
 * and a favourite genre that must be one of the choices in the
 * genres array. This code is to be used for SYST 17796.
 * @author 
 */
public class UserProfile 
{
    
    private String userID;
    private String genre;
    private String[] genres = {"Comedy", "Drama", "Action", "Mystery"};
    
    public UserProfile(String givenID, String givenGenre)
    {
        userID = givenID;
        genre= givenGenre;
    }

    /**
     * @return the userID
     */
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }
//System.out.println("c"); 
    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    
    
    
    
}
