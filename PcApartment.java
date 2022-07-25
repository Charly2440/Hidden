import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PcApartment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PcApartment extends World
{

    /**
     * Constructor for objects of class PcApartment.
     * 
     */
    public PcApartment()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 689, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Email email = new Email();
        addObject(email,575,307);
        ExitPc exitPc = new ExitPc();
        addObject(exitPc,1017,49);
        Send send = new Send();
        addObject(send,1017,158);
    }
}
