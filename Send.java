import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Send here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Send extends Actor
{
    /**
     * Act - do whatever the Send wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
     
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
        String enigma = Greenfoot.ask("Cual es la solución al enigma?");
            if (enigma.equals("loimportanteesnodejardehacersepreguntas")){
                getWorld().showText("Muy bien, descifraste el primer enigma, suerte con el siguiente", 500, 500);
            }
            else{
                getWorld().showText("Mmmmm... parece que esa no es la solución. ¿Creíste que sería fácil? Sigue buscando", 500, 500);
            }
        enigma();
    }
    }
    
    public boolean enigma(){
     boolean enigma1 = false;
     boolean enigma2 = false;
     boolean enigma3 = false;
     boolean enigma4 = false;
     boolean enigma5 = false;
     boolean enigma6 = false;
     return enigma1;
    }
}
