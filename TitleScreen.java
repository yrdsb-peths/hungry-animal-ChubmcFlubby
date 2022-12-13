import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for our game.
 * 
 * @author (Matthew Chiu) 
 * @version (Version 1 - December 2022)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Hungry Animal!", 50);

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, 200, 100);
        prepare();
    }

    /**
     * /The title screen's act loop.
     */
    public void act()
    {
        //Starts the game if user presses the space bar.
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,460,98);
        elephant.setLocation(460,80);
        Label label = new Label("Use \u2190 or \u2192 to move", 50);
        addObject(label,228,183);
        label.setLocation(310,207);
        Label label2 = new Label("Press Spacebar to Start", 40);
        addObject(label2,321,310);
        label2.setLocation(310,304);
    }
}
