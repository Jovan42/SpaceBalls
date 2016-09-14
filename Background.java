import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pozadina here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private int points = 0;
    private int health = 3;
    Hearth[] hearths = {new Hearth(), new Hearth(), new Hearth()};
    Score score = new Score();
    int speet = 3;
    Level level = new Level();
    /**
     * Constructor for objects of class Pozadina.
     * 
     */
    public int getPoints() {
        return this.points;
    }

    public int getHealth() {
        return this.health;
    }

    public void incrementPoints() {
        this.points++;
        score.setScore(points);
        level.setLevel(1 + points/20);
    }

    public void decrementHealth() {
        switch(health) {
            case 1:
            {
                this.removeObject(hearths[0]);
                Greenfoot.stop();
                GameOver gameOver = new GameOver();
                this.addObject(gameOver, this.getWidth()/2,  this.getHeight()/2);
                score.setLocation(300, 275);
                Greenfoot.stop();
            }
            break;
            case 2:
            this.removeObject(hearths[1]);
            break;
            case 3:
            this.removeObject(hearths[2]);
            break;
        }
        this.health--;
    }

    public Background()
    {       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        this.setPaintOrder(Score.class, GameOver.class, Level.class, Hearth.class, 
            Rocket.class, Ball.class);
        Rocket r = new Rocket(getRocketsSpeedFromPoints()   );
        Ball firstBall = new Ball(this, r, 2, getBallsSpeedFromPoints());

        for(int i = 0; i<3; i++) {
            addObject(hearths[i], 25+ i*50, 25);
        }
        addObject(r,50,200);
        score.setScore(0);
        addObject(score, 520, 25);
        level.setLevel(1);
        addObject(level, 300, 25);
    }

    public int getBallsSpeedFromPoints() {
       return points/20 + 3;
    }
    
    public int getRocketsSpeedFromPoints() {
        return points/20 + 10;
    }
}
