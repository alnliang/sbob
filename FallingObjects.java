import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Represents objects that constantly fall until they reach the bottom
 * 
 * @author Alan Liang 
 * @version 10/5/19
 */
public class FallingObjects extends Actor
{
    /**
     * Determines the rate at which falling objects fall
     */
    private int dropSpeed = 1;
    /**
     * Used to check if objects have hit the ground
     */
    private boolean onBottom=false;
    /**
     * Act method is constantly called. It is used to call another method that makes objects constantly fall.
     */
    public void act() 
    {
        fall();
    }
    /**
     * Makes objects constantly fall with the use of dropSpeed. Objects will stop falling once onBottom equals true.
     */
    public void fall()
    {
        if(! onBottom){
            setLocation(getX(),getY()+dropSpeed);
            onBottom=checkBottom();
        }
    }
    /**
     * Used to check whether objects have hit the bottom or not. 
     */
    public boolean checkBottom()
    {
        if (getY()>570){
            return true;
        }
        else{
            return false;
        }
    }
}
