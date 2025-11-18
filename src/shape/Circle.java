package shape;
/**
 * Our child class
 * @author Totu-vostro-5640
 */
public class Circle extends Shapes {
    private double radius;
    /**
     * Constructor of Circle
     * @param x
     * @param y
     * @param radius 
     */
    public Circle(double x, double y, double radius) {
        super(x, y);
        if (radius <= 0){
            throw new IllegalArgumentException("Radius must be positive.");
        }
        else{
            this.radius = radius;
        }
        
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMinX(){ 
        return x - radius;
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMaxX(){ 
        return x + radius; 
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMinY(){ 
        return y - radius; 
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMaxY(){ 
        return y + radius; 
    }
    /**
     * String method so output will look better
     * @return 
     */
    @Override
    public String toString(){
        return super.toString() + " radius = " + radius;
    }
}
