import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spongebob class, what the player controls
 * 
 * @author Alan Liang 
 * @version 10/5/19
 */

public class Sbob extends Actor
{
    /**
     * Represents the total number of gold collected
     */
    private int gold=0;
    /**
     * Gets the value of the integer gold
     */
    public int getGold(){
        return gold;
    }
    /**
     * Act method is called constantly. Checks if spongebob can catch an object, and depending on the object spongebob catches, an event 
     * happens. If spongebob catches gold, the variable gold increases by 1, if spongebob catches a crab trap, the game ends. Depending on the
     * arrow key pressed, spongebob will move either left or right.
     */
    public void act() 
    {
        if(canCatchGold()){
            CatchGold();
            gold=gold+1;
        }    
        if(canCrabTrap()){
            GetCrabTrap();
            Greenfoot.stop();
        }
        if (Greenfoot.isKeyDown("right")){
            setLocation(getX()+1,getY());
        }
        if (Greenfoot.isKeyDown("left")){
            setLocation(getX()-1,getY());
        }
    }    
    /**
     * Checks if spongebob can catch gold
     */
    private boolean canCatchGold(){
        Actor gold = getOneObjectAtOffset(0, 0, PirateGold.class);
        if(gold != null){
            return true;
        }
        else{
            return false;
        }            
    }    
    /**
     * Depending on what canCatchGold() returns, this method will make spongebob catch gold.
     */
    private void CatchGold(){
        Actor gold = getOneObjectAtOffset(0, 0, PirateGold.class);
        if(gold != null){
            Greenfoot.playSound("cha_ching.wav");
            getWorld().removeObject(gold);
        }    
    }
    /**
     * Determines if spongebob can be affected by a crab trap
     */
    private boolean canCrabTrap(){
        Actor trap = getOneObjectAtOffset(0, 0, CrabTrap.class);
        if(trap != null){
            return true;
        }
        else{
            return false;
        }            
    }    
    /**
     * Depending on what canCrabTrap() returns, this method will make crab traps effective against spongebob.
     */
    private void GetCrabTrap(){
        Actor trap = getOneObjectAtOffset(0, 0, CrabTrap.class);
        if(trap != null){
            Greenfoot.playSound("bonk.wav");
            getWorld().removeObject(trap);
        }    
    }
}


        