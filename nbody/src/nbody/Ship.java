package nbody;

import edu.princeton.cs.StdDraw; 

/******************************************************************************
 *  Compilation:  javac Ship.java
 *  Execution:    java Ship
 *  Dependencies: Vector.java StdDraw.java
 *
 *  Implementation of a 2D Ship with a position, velocity, 
 *  rotation and thrust.
 *  @author Henry
 *
 ******************************************************************************/


public class Ship {
    private Vector p;      // position
    private Vector v;      // velocity
    private Vector r;     //rotation
    private Vector t;      //thrust

    private double sx;
    private double sy;
    private final double sl = .1;
    private final double sh = .5;
    
    public Ship(Vector p, Vector v, Vector r, Vector t) {
        this.sx = .1;
        this.sy = .5;
        this.p = p;
        this.v = v;
        this.r = r;
        this.t = t;
        
    } // Body( Vector, Vector)

//    public void thrust(Vector f, double dt) {
//        v = v.plus(a.times(dt));
//        r = r.plus(v.times(dt));
//    } // move( Vector, double )
     
    public void draw() {
        StdDraw.setPenColor (StdDraw.ORANGE);
        
        StdDraw.filledRectangle (sx, sy, sl, sh);
    } // draw ship()
}