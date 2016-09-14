import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    int speed;
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Rocket(int speed) {
        this.speed = speed;
    }

    public void act() 
    {
        
        if( Greenfoot.isKeyDown("up")==true && getY() >=100)
        {
           setLocation(getX(), getY() - speed );
 
        }
        if( Greenfoot.isKeyDown("down")==true && getY() <= 300){ 
            setLocation(getX(), getY() + speed);
        }
        

    }
}
