import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for our game.
 * 
 * @author (Matthew Chiu) 
 * @version (Version 1 - December 2022)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 50);

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
        elephant.setLocation(394,80);
        Label label = new Label("Use \u2190 or > to move", 50);
        addObject(label,228,183);
        label.setLocation(327,207);
        label.setLocation(416,211);
        label.setLocation(323,249);
        label.setLocation(334,263);
        label.setLocation(321,233);
        Label label2 = new Label("Press Spcaebar to Start", 40);
        addObject(label2,277,309);
        label.setLocation(287,214);
        label2.setLocation(333,303);
    }
}
