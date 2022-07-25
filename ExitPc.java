import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitPc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitPc extends Actor
{
    /**
     * Act - do whatever the ExitPc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        
        //Salir de la PC al apachar el botón de off
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Apartment());
        }
    }
}
