import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MarsSplash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JupiterSplash extends World
{
    /**
     * Constructor for objects of class MarsSplash.
     * 
     */
    public JupiterSplash()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
    }
    
    public void act()
    {
         nextLevel();
    }
    
    private void nextLevel()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new Level3());
        }
    }
}