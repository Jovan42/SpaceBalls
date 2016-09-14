import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Loptica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ball extends Actor
{
    private Rocket rocket;
    private Background world;
    int next;
    boolean madeNext;
    int speed;

    /**
     * Act - do whatever the Loptica wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Ball(Background world, Rocket rocket, int row, int speed) {
        madeNext = false;
        this.rocket = rocket;
        this.world = world;
        world.addObject(this, 600, row * 100);
        next = 450;
        this.speed = speed;
    }

    public void act() 
    {
        this.move(-speed );
        if(this.getX() < next && !madeNext) {
            madeNext = true;

            int ro = Greenfoot.getRandomNumber(3) + 1;
            if(ro !=0 ) {
                Ball ball = new Ball(world, rocket, ro, world.getBallsSpeedFromPoints());
            }
        }
        if(this.isTouching(Rocket.class)) {
            world.incrementPoints();
            world.removeObject(this);
        }
        try {
            if(this.getX() <80) {
                world.removeObject(this);
                world.decrementHealth();
            }
        } catch (Exception e){}
        // Add your action code here.
    }    
}
