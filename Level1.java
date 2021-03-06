import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = .1f;
    private final GreenfootSound MUSIC = new GreenfootSound("moon-song.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = MarsSplash.class;
        /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    public void act()
    {
        spawn();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() 
    {
        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY,MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);
        addObject(player,40,745);
        addObject(new Door(),1165,50);
        addObject(new MoonFloor(),600,800);
        addObject(new MoonWall(),1130,685);
        addObject(new MoonWall(),600,370);
        addObject(new MoonWall(),1040,100);
        addObject(new SmMoonWall(),470,575);
        addObject(new SmMoonWall(),100,505);
        addObject(new SmMoonWall(),680,235);
        addObject(new SmMoonWall(),360,510);
        addObject(new SmMoonWall(),715,630);
        addObject(new TrapDoor(GRAVITY),305,605);
        addObject(new Bomb(GRAVITY),65,460);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
