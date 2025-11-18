package shape;
/**
 * Child class of Shapes
 * @author Totu-vostro-5640
 */
public class Square extends Shapes {
    private double side;
    /**
     * Constructor of Square
     * @param x
     * @param y
     * @param side 
     */
    public Square(double x, double y, double side) {
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
        return x - side / 2.0; 
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMaxX(){ 
        return x + side / 2.0; 
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMinY(){ 
        return y - side / 2.0; 
    }
    /**
     * Finding border of Shape
     * @return 
     */
    @Override
    public double getMaxY(){ 
        return y + side / 2.0; 
    }
    /**
     * String method so output will look better
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() + " side=" + side;
    }
}
