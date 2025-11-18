package shape;
/**
 * Child class of Shapes
 * @author Totu-vostro-5640
 */
public class Hexagon extends Shapes {
    private double side;
    /**
     * Constructor of HExagon
     * @param x
     * @param y
     * @param side 
     */
    public Hexagon(double x, double y, double side) {
        super(x, y);
        if (side <= 0){
            throw new IllegalArgumentException("Side length must be positive.");
        }
        else{
            this.side = side;
        }
        
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMinX(){ 
        return x - side; 
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMaxX(){ 
        return x + side; 
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMinY(){ 
        return y - (Math.sqrt(3) / 2.0) * side; 
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMaxY(){ 
        return y + (Math.sqrt(3) / 2.0) * side; 
    }
    /**
     * String method so output will look better
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + " side = " + side;
    }
}
