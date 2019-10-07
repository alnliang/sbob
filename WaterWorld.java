import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Serves as a background as well as a way for all the objects to be initialized.
 * 
 * @author Alan Liang 
 * @version 10/5/19
 */
public class WaterWorld extends World
{
    /**
     * Initializes new object of the class Sbob
     */
    Sbob sbob = new Sbob();
    /**
     * Initializes new object of the class Text
     */
    Text text = new Text();
    /**
     * Constructor for objects of class WaterWorld.
     * 
     */
    public WaterWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Finds a random x-value, and puts an instance of PirateGold on that position.
     */
    public void dropGold(){
        PirateGold g = new PirateGold();
        addObject (g, Greenfoot.getRandomNumber(getWidth()), 10);
    }
    /**
     * Finds a random x-value, and puts an instance of CrabTrap on that position.
     */
    public void dropTrap(){
        CrabTrap t = new CrabTrap();
        addObject(t, 50+Greenfoot.getRandomNumber(getWidth()-100), 10);
    }
    /**
     * Act methods are called constantly. This method determines whether a Crab Trap or a piece of gold will appear. It also serves as a 
     * scoreboard, using the Text class's setText method to display Sbob's gold score. Because it is an act method, the score is constantly
     * updating.
     */
    public void act(){
        if (Greenfoot.getRandomNumber(120)==5){
            dropGold();
        }
        if (Greenfoot.getRandomNumber(720)==20){
            dropTrap();
        }
        text.setText(sbob.getGold() + "");
    }
    /**
     * Adds spongebob and text to the screen.
     */
    private void prepare()
    { 
        addObject(sbob, 328, 537);
        sbob.setLocation(399, 527);
        addObject(text, 25, 15);
    }
}
