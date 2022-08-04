import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //public static boolean Enigma(){
        boolean enigma1 = false;
        boolean enigma2 = false;
        
        
    //}
     
    public void act()
    {
        // Add your action code here.
        Apartment.Enigma enigmas;
        enigmas = new Apartment.Enigma();
        moveAround();
        getApartment();
        if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == false && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
            firstClue();
        }
        

        if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == false && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
            secondClue();
        }

        if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == true && enigmas.getEnigma3() == false && enigmas.getEnigma4() == false){
            thirdClue();
        }

        if (enigmas.getEnigma1() == true && enigmas.getEnigma2() == true && enigmas.getEnigma3() == true && enigmas.getEnigma4() == false){
            fourthClue();
        }
        
        
        
        
        //secondClue();
    }
    
    public void moveAround(){
        if (Greenfoot.isKeyDown("W")){
            move(2);
        }
        
        if (Greenfoot.isKeyDown("S")){
            move(-2);
        }
        
        if (Greenfoot.isKeyDown("A")){
            turn(-2);
        }
        
        if (Greenfoot.isKeyDown("D")){
            turn(2);
        }
    }
    
    public void getApartment(){
        Actor mapApartmentObject;
        mapApartmentObject = getOneObjectAtOffset(0, 0, Apartmentbutton.class);
        
        if (mapApartmentObject != null  & Greenfoot.isKeyDown("space") == true){
            Greenfoot.setWorld(new Apartment());
        }
    }
    
    public void firstClue(){
        Actor firstnpc;
        firstnpc = getOneObjectAtOffset(0, 0, Firstnpc.class);
        
        if (firstnpc != null  & Greenfoot.isKeyDown("space") == true){
            getWorld().showText("El código morse se representa con puntos y barras.",300, 140);
            getWorld().showText("Cada letra es una combinación especial de estas dos cosas.",300, 180);
            getWorld().showText("En el código morse las letras se suelen separar con un asterísco", 300, 220);
            getWorld().showText("Tip: herramientas en línea pueden ayudar a descifrar código morse", 310, 260);
        }
        else{
            getWorld().showText(null,300,140);
            getWorld().showText(null, 300,180);
            getWorld().showText(null, 300, 220);
            getWorld().showText(null, 310, 260);
        }
    }
    
    public void secondClue(){
        Actor secondnpc;
        secondnpc = getOneObjectAtOffset(0, 0, Secondnpc.class);
        
        if (secondnpc != null  & Greenfoot.isKeyDown("space") == true){
            getWorld().showText("Hace años Julio César propuso un método de encriptación",300, 140);
            getWorld().showText("Investiga un poco de este método",300, 180);
            getWorld().showText("Tip: ¿qué letra se repite más en el español?", 300, 220);
            getWorld().showText("Tip: corrimiento de letras", 310, 260);
        }
        else{
            getWorld().showText(null,300,140);
            getWorld().showText(null, 300,180);
            getWorld().showText(null, 300, 220);
            getWorld().showText(null, 310, 260);
        }
    }
    public void thirdClue(){
        Actor thirdpc;
        thirdpc = getOneObjectAtOffset(0, 0, Thirdpc.class);
        
        if (thirdpc != null  & Greenfoot.isKeyDown("space") == true){
            getWorld().showText("Cada caracter tiene asignado un código alfanumérico",300, 140);
            getWorld().showText("Hay distintos tipos de códigos para representar caracteres",300, 180);
            getWorld().showText("Intenta descifrando el código hexagecimal de cada caracter", 300, 220);
            getWorld().showText("Cuidado con espacios comas o puntos, también tienen un código", 310, 260);
        }
        else{
            getWorld().showText(null,300,140);
            getWorld().showText(null, 300,180);
            getWorld().showText(null, 300, 220);
            getWorld().showText(null, 310, 260);
        }
    }
    public void fourthClue(){
        Actor fourth;
        fourth = getOneObjectAtOffset(0, 0, Fourthpc.class);
        
        if (fourth != null  & Greenfoot.isKeyDown("space") == true){
            getWorld().showText("Muy bien has logrado llegar al último enigma",300, 140);
            getWorld().showText("Ahora es momento de poner en práctica todo lo aprendido",300, 180);
            getWorld().showText("Intenta usar lo aprendido para el último enigma", 300, 220);
            getWorld().showText("No es sencillo, tiene multiples encriptaciones", 310, 260);
        }
        else{
            getWorld().showText(null,300,140);
            getWorld().showText(null, 300,180);
            getWorld().showText(null, 300, 220);
            getWorld().showText(null, 310, 260);
        }
    }
    
}
