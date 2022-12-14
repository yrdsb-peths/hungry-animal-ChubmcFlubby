import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the file that initiates the world of the Hungry Elephant Game. This is the first comp-sci assignment.
 * @author (Matthew Chiu) 
 * @version (Version 1 - December 2022)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    Elephant elephant = new Elephant();
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //Creates the elephant object.
        addObject(elephant, 300, 300);
        
        //Creats a label to keep track of the player's score.
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();
    }
    
    /**
     * End the game when the user fails to catch an apple.
     * Displays a "Game Over" text on screen.
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
        elephant.setSpeed(0);
    }
    
    /**
     * Increases the player's score.
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level +=1;
        }
    }
    
    /**
     * Creates a new apple at a random location on the top of the screen.
     */
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
