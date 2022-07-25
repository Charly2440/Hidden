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
     
     
    public void act()
    {
        // Add your action code here.
        moveAround();
        getApartment();
        firstClue();
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
            getWorld().showText("Click derecho y click en \"Inspeccionar\" ",300, 140);
            getWorld().showText("Puedes revisar el código de la página y buscar cosas escondidas",300, 180);
            
            getWorld().showText("Abre cada \"tag\" del HTML para encontrar lo que buscas", 300, 220);
        }
        else{
            getWorld().showText(null,300,140);
            getWorld().showText(null, 300,180);
            getWorld().showText(null, 300, 220);
        }
    }
    
}
