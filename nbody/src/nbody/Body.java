package nbody;

import edu.princeton.cs.StdDraw;

/******************************************************************************
 *  Compilation:  javac Body.java
 *  Execution:    java Body
 *  Dependencies: Vector.java StdDraw.java
 *
 *  Implementation of a 2D Body with a position, velocity and mass.
 *
 *
 ******************************************************************************/

public class Body {
    private Vector r;      // position
    private Vector v;      // velocity
    private final double mass;   // mass

    public Body(Vector r, Vector v, double mass) {
        this.r = r;
        this.v = v;
        this.mass = mass;
    } // Body( Vector, Vector, double )

    public void move(Vector f, double dt) {
        Vector a = f.times(1/mass);
        v = v.plus(a.times(dt));
        setR(getR().plus(v.times(dt)));
    } // move( Vector, double )

    public Vector forceFrom(Body b) {
        Body a = this;
        double G = 4.67e-11;
        Vector delta = b.getR().minus(a.getR());
        double dist = delta.magnitude();
        double F = (G * a.mass * b.mass) / (dist * dist);
        return delta.direction().times(F);
    } // forceFrom( Body )
    
    public void draw() {
        StdDraw.setPenColor(StdDraw.GREEN);
        StdDraw.setPenRadius(0.025);
        StdDraw.point(getR().cartesian(0), getR().cartesian(1));
    } // draw()

    // this method is only needed if you want to change the size of the bodies
    public void draw(double penRadius) {
        StdDraw.setPenRadius(penRadius);
        StdDraw.point(getR().cartesian(0), getR().cartesian(1));
    } // draw( double )

    /**
     * @return the r
     */
    public Vector getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(Vector r) {
        this.r = r;
    }
} // Body
