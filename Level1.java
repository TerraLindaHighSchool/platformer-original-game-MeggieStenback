import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.667f;
    private final GreenfootSound MUSIC = new GreenfootSound("zapsplat_024.mp3");
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
        addObject(new Player(3, 5.6f, GRAVITY, 3, 3,Level2.class, MUSIC),43,760);
        addObject(new Door(),1165,50);
        addObject(new Floor(),600,800);
        addObject(new BrickWall(),1130,685);
        addObject(new BrickWall(),550,370);
        addObject(new BrickWall(),1040,100);
        addObject(new SmBrickWall(),470,575);
        addObject(new SmBrickWall(),100,505);
        addObject(new SmBrickWall(),680,235);
        addObject(new SmBrickWall(),360,510);
        addObject(new Gem(),900,760);
        addObject(new Gem(),800,760);
        addObject(new Gem(),130,460);
        addObject(new TrapDoor(GRAVITY),305,605);
        addObject(new Bomb(GRAVITY),65,460);
    }
    
    private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
        
        if(Math.random() < 0.01)
        {
            addObject(new AcidRain(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
