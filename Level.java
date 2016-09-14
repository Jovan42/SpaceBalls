import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends Actor
{
    GreenfootImage image = new GreenfootImage(150, 45);
    
    public Level() {
        image.setColor(java.awt.Color.white);
        Font f = new Font("Comic Sans MS", Font.PLAIN, 20);
        image.setFont(f);
        this.setImage(image);
    }
    
     public void setLevel(int score) {
        image.clear(); 
        image.drawString("Level: " + Integer.toString(score), 30, 30);
        this.setImage(image);
    }
    /**
     * Act - do whatever the Level wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
