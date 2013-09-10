package com.jcsm.pattern.strategy;

/**
 * Hello world!
 * v1.0
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performSwim();
        
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performSwim();
    }
}
