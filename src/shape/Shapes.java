package shape;
/**
 * Our parent class
 * @author Totu-vostro-5640
 */
public abstract class Shapes {
    protected double x;
    protected double y;
    /**
     * Constructor for center of shapes
     * @param x
     * @param y 
     */
    public Shapes(double x, double y) {
        this.x = x;
        this.y = y;
    }
    /**
     * methods that will be overridden
     * @return 
     */
    public abstract double getMinX();
    /**
     * methods that will be overridden
     * @return 
     */
    public abstract double getMaxX();
    /**
     * methods that will be overridden
     * @return 
     */
    public abstract double getMinY();
    /**
     * methods that will be overridden
     * @return 
     */
    public abstract double getMaxY();

    public double getX(){
        return x; 
    }
    public double getY(){ 
        return y;
    }
    /**
     * String method so output will look better
     * @return 
     */
    @Override
    public String toString() {
        return getClass().getSimpleName() + " at (" + x + ", " + y + ")";
    }
}