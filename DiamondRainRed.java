import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AcidRain here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiamondRainRed extends Obstacle
{
    private float yVelocity;
    private final float GRAVITY;
    
    public DiamondRainRed(float gravity)
    {
        GRAVITY = gravity;
    }
    
    public void act()
    {
        fall();
    }
    
    protected void fall()
    {
        yVelocity += GRAVITY;
        setLocation(getX(), getY() + (int) yVelocity);
        removeOutOfBounds(this);
    }
}


