import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinSplash extends World
{
    private final GreenfootSound MUSIC = new GreenfootSound("moon-song.mp3");
    public WinSplash()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
    }
    
    public void act()
    {
        playMusic();  
    }
    
    private void playMusic()
    {
        if(!MUSIC.isPlaying())
        {
            MUSIC.playLoop();
        }
    }
}
