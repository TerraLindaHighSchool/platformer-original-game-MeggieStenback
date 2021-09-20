import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
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
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare() 
    {
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,Door.class, HUD.class);
        Player player = new Player();
        addObject(new Player(), 43, 760);
        Floor floor = new Floor
        addObject(new Floor(), 600, 800);
        addObject(new Rock(), 439, 780); 
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,577,725);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,788,677);
        TrapDoor trapDoor = new TrapDoor();
        addObject(trapDoor,1000,630);
        BrickWall brickWall = new BrickWall();
        addObject(brickWall,387,550);
        Bomb bomb = new Bomb();
        addObject(bomb,176,496);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,124,390);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,588,284);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,1135,211);
        Door door = new Door();
        addObject(door,1167,147);
    }
}
