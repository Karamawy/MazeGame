package States;

import java.awt.Graphics;


public abstract class State {
    public static State currentState=null;
    
    public static void setState(State state){
    currentState= state;
    }
    public static State getState(){
    return currentState;
    }
            
    public abstract void tick();
    
    public abstract void render (Graphics g);
            }
