import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.14f;
    private final GreenfootSound MUSIC = new GreenfootSound("mars-song.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 5.8f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = JupiterSplash.class;
        /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        addObject(new Door(),1165,130);
        addObject(new MarsFloor(),600,800);
        addObject(new MarsWall(),1130,720);
        addObject(new MarsWall(),800,490);
        addObject(new MarsWall(),1040,180);
        addObject(new SmMarsWall(),500,650);
        addObject(new SmMarsWall(),100,555);
        addObject(new SmMarsWall(),775,285);
        addObject(new SmMarsWall(),875,385);
        addObject(new SmMarsWall(),360,560);
        addObject(new SmMarsWall(),715,680);
        addObject(new MarsTrapDoor(GRAVITY),305,655);
        addObject(new Bomb(GRAVITY),65,510);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new MarsRock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        
        if(Math.random() < 0.01)
        {
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
