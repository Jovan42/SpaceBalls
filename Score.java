import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    GreenfootImage image = new GreenfootImage(150, 45);
    public Score(){
        image.setColor(java.awt.Color.white);
        Font f = new Font("Comic Sans MS", Font.PLAIN, 20);
        image.setFont(f);
        this.setImage(image);
    }
    public void setScore(int score) {
        image.clear(); 
        image.drawString("Score: " + Integer.toString(score), 30, 30);
        this.setImage(image);
    }
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
