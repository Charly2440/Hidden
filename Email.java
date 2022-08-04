import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Email here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Email extends Actor
{
    /**
     * Act - do whatever the Email wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     
    public void act()
    {
        Apartment.Enigma enigmas;
        enigmas = new Apartment.Enigma();
        
        if (Greenfoot.mouseClicked(this)){
            //System.out.println(enigmas.getEnigma1());
            if (enigmas.getEnigma1() == false && enigmas.getEnigma2() == false && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
              Greenfoot.setWorld(new Primerenigma());
            }
            else if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == false && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
              Greenfoot.setWorld(new Segundoenigma());
            }
            else if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == true && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
              Greenfoot.setWorld(new Tercerenigma());
            }
            else if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == true && enigmas.getEnigma3() == true && enigmas.getEnigma4() == false){
              Greenfoot.setWorld(new Cuartoenigma());
            }
            
        }
    }
}
