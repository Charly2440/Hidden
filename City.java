import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class City here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class City extends World
{

    /**
     * Constructor for objects of class City.
     * 
     */
    
    
    public City()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(620, 400, 1); 
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Apartment.Enigma enigmas;
        enigmas = new Apartment.Enigma();

        Character character = new Character();
        addObject(character,140,354);
        Apartmentbutton apartmentbutton = new Apartmentbutton();
        addObject(apartmentbutton,107,356);

        
        if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == false && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
            Firstnpc firstnpc2 = new Firstnpc();
            addObject(firstnpc2,252,130);
        }
        

        if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == false && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
            Secondnpc secondnpc = new Secondnpc();
            addObject(secondnpc,570,352);
        }

        if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == true && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
            Thirdpc thirdpc = new Thirdpc();
            addObject(thirdpc,531,34);
        }

        if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == true && enigmas.getEnigma3() == true && enigmas.getEnigma4() == false){
            Fourthpc fourthpc = new Fourthpc();
            addObject(fourthpc,58,113);
        }

    }
}
