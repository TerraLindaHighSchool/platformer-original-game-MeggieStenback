import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.146f;
    private final GreenfootSound MUSIC = new GreenfootSound("jupiter-song.mp3");
    private final int SPEED = 3;
    private final float JUMP_FORCE = 6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
        /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
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
        addObject(new Door(),112,151);
        addObject(new MarsFloor(),600,800);
        addObject(new JupiterWall(),1130,735);
        addObject(new JupiterWall(),809,504);
        addObject(new JupiterWall(),189,205);
        addObject(new SmJupiterWall(),495,663);
        addObject(new SmJupiterWall(),1140,575);
        addObject(new SmJupiterWall(),545,305);
        addObject(new SmJupiterWall(),755,390);
        addObject(new SmJupiterWall(),355,568);
        addObject(new SmJupiterWall(),670,679);
        addObject(new JupiterTrapDoor(GRAVITY),253,405);
        addObject(new Bomb(GRAVITY),1128,549);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        
        if(Math.random() < 0.002)
        {
            addObject(new DiamondRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        if(Math.random() < 0.002)
        {
            addObject(new DiamondRainBlue(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        if(Math.random() < 0.002)
        {
            addObject(new DiamondRainGreen(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        if(Math.random() < 0.002)
        {
            addObject(new DiamondRainYellow(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        if(Math.random() < 0.002)
        {
            addObject(new DiamondRainRed(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
