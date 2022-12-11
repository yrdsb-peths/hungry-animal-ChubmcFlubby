import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the fruit that will fall from the sky for our elephant to eat.
 * 
 * @author (Matthew Chiu) 
 * @version (Version 1 - Decemeber 2022)
 */
public class Apple extends Actor
{   
    int speed = 1;
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x = getX();
        int y = getY() + speed;
        setLocation(x, y);
        
        //Removes apple once it reaches the bottom and displays a "Game Over" Text.
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}