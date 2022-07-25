import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apartment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apartment extends World
{

    /**
     * Constructor for objects of class Apartment.
     * 
     */
    public Apartment()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 700, 1);
        prepare();
        GreenfootSound backgroundMusic = new GreenfootSound("greenfoot.mp3");
        //backgroundMusic.playLoop();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pc pc = new Pc();
        addObject(pc,493,361);
        ExitApartment exitApartment = new ExitApartment();
        addObject(exitApartment,165,541);
        Instructions instructions = new Instructions();
        addObject(instructions,932,131);
    }
}
