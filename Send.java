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
        Apartment.Enigma enigmas;
        enigmas = new Apartment.Enigma();
        
        if (Greenfoot.mouseClicked(this)){
            if (enigmas.getEnigma1() == false && enigmas.getEnigma2() == false && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
              evaluarEnigma1();
            }
            else if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == false && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
              evaluarEnigma2();
            }
            else if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == true && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
              evaluarEnigma3();
            }
            else if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == true && enigmas.getEnigma3() == true && enigmas.getEnigma4() == false){
              evaluarEnigma4();
            }
        }
    }
    public void evaluarEnigma1(){
        Apartment.Enigma enigmas;
        enigmas = new Apartment.Enigma();
        if (Greenfoot.mouseClicked(this)){
        String enigma = Greenfoot.ask("Cual es la solución al enigma?");
            if (enigma.equals("loimportanteesnodejardehacersepreguntas")){
                getWorld().showText("Muy bien, descifraste el primer enigma, suerte con el siguiente", 500, 500);
                Greenfoot.setWorld(new PcApartment());
                enigmas.setEnigma1(true);
            }
            else{
                getWorld().showText("Mmmmm... parece que esa no es la solución. ¿Creíste que sería fácil? Sigue buscando", 500, 500);
            }
        }
    }
    public void evaluarEnigma2(){
        Apartment.Enigma enigmas;
        enigmas = new Apartment.Enigma();
        if (Greenfoot.mouseClicked(this)){
        String enigma = Greenfoot.ask("Cual es la solución al enigma?");
            if (enigma.equals("El estudio del universo es un viaje para autodescubrirnos") || enigma.equals("el estudio del universo es un viaje para autodescubrirnos")){
                getWorld().showText("Muy bien, descifraste el enigma, suerte con el siguiente", 500, 500);
                enigmas.setEnigma2(true);
            }
            else{
                getWorld().showText("Mmmmm... parece que esa no es la solución. ¿Creíste que sería fácil? Sigue buscando", 500, 500);
            }
        }
    }
    public void evaluarEnigma3(){
        Apartment.Enigma enigmas;
        enigmas = new Apartment.Enigma();
        if (Greenfoot.mouseClicked(this)){
        String enigma = Greenfoot.ask("Cual es la solución al enigma?");
            if (enigma.equals("La ciencia de hoy es la tecnología del mañana.") || enigma.equals("la ciencia de hoy es la tecnología del mañana.")){
                getWorld().showText("Muy bien, descifraste el enigma, suerte con el siguiente", 500, 500);
                enigmas.setEnigma3(true);
            }
            else{
                getWorld().showText("Mmmmm... parece que esa no es la solución. ¿Creíste que sería fácil? Sigue buscando", 500, 500);
            }
        }
    }
    public void evaluarEnigma4(){
        Apartment.Enigma enigmas;
        enigmas = new Apartment.Enigma();
        if (Greenfoot.mouseClicked(this)){
        String enigma = Greenfoot.ask("Cual es la solución al enigma?");
            if (enigma.equals("El principio de la ciencia, casi la definicion, es el siguiente, la prueba de todo conocimiento es el experimento") || enigma.equals("el principio de la ciencia, casi la definicion, es el siguiente, la prueba de todo conocimiento es el experimento")){
                getWorld().showText("WOOW! Muy bien, descifraste todos los enigmas!", 500, 500);
                Greenfoot.setWorld(new Congrats());
                enigmas.setEnigma4(true);
            }
            else{
                getWorld().showText("Mmmmm... parece que esa no es la solución. ¿Creíste que sería fácil? Sigue buscando", 500, 500);
            }
        }
    }
}
