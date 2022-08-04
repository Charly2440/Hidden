import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Actor
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)){
            getWorld().showText("Hola #$&/%$, parece que tienes un mensaje en tu correo electrónico, ingresa a tu PC (click).", 550, 100 );
            getWorld().showText("Instrucciones:, (cerrar con \"space\")", 550, 260);
            getWorld().showText("Puedes hacer click sobre los objetos que tienes en frente para cambiar de escenarios.", 550, 300);
            getWorld().showText("En la ciudad muevete libremente con \"A\" \"S\" \"W\" \"D\".", 550, 340);
            getWorld().showText("Para interactuar con los objetos de la ciudad ponte sobre ellos y apacha \"space\".", 550, 380);
            getWorld().showText("Para ver tu correo clickea la notificación, para responder clickea el icono de enviar.", 550, 420);
            getWorld().showText("Da click en la flecha negra, esquina inferior izquierda, para ir al mundo.", 550, 440);
            getWorld().showText("A lo largo de tu travesía interactúa con los personajes para ganar pistas que te servirán.", 550, 460);
        }
        
        if ("space".equals(Greenfoot.getKey())){
            getWorld().showText(null, 550, 460);
            getWorld().showText(null, 550, 440);
            getWorld().showText(null, 550, 420);
            getWorld().showText(null, 550, 380);
            getWorld().showText(null, 550, 340);
            getWorld().showText(null, 550, 300);
            getWorld().showText(null, 550, 260);
            getWorld().showText(null, 550, 100);
            
        }
    }
}
