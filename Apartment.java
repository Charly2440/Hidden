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
    public static class Enigma{
        private static boolean engima1 = false;
        private static boolean engima2 = false;
        private static boolean engima3 = false;
        private static boolean engima4 = false;
        
        public boolean getEnigma1(){
            return engima1;
        }
        public boolean getEnigma2(){
            return engima2;
        }
        public boolean getEnigma3(){
            return engima3;
        }
        public boolean getEnigma4(){
            return engima4;
        }
        
        public void setEnigma1(boolean resolucion){
            engima1 = resolucion;
        }
        public void setEnigma2(boolean resolucion){
            engima2 = resolucion;
        }
        public void setEnigma3(boolean resolucion){
            engima3 = resolucion;
        }
        public void setEnigma4(boolean resolucion){
            engima4 = resolucion;
        }
    }
    
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
