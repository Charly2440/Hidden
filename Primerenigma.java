import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Primerenigma here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Primerenigma extends World
{

    /**
     * Constructor for objects of class Primerenigma.
     * 
     */
    public Primerenigma()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Pc pc = new Pc();
        addObject(pc,455,451);
    }
}
