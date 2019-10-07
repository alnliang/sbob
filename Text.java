import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Text serves as a scoreboard.
 * 
 * @author Alan Liang 
 * @version 10/5/19
 */
public class Text extends Actor
{
    /**
     * Displays any text passed in 48 size font and in white. 
     */
    public void setText(String text){
        setImage(new GreenfootImage(text, 48, Color.WHITE, new Color(0, 0, 0, 0)));
    }
}
