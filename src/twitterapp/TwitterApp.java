/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package twitterapp;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 *
 * @author scastillocortez
 */
public class TwitterApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException {
        // TODO code application logic here
        Twitter twitter = TwitterFactory.getSingleton();
        String latestStatus = "latest Status";
        twitter.updateStatus(latestStatus);
        System.out.println("Successfully updated");
    }
    
}
