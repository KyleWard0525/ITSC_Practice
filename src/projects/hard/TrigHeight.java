package projects.hard;
import java.lang.Math;
import java.text.DecimalFormat;
/**
 * 
 * A man was standing at a point 250m away
 * from a building. He observes from that point
 * that the angle of elevation to the top of the 
 * building is 24 degrees. He then walks forward
 * 50m and observes that the angle of elevation to
 * the top of the building is now 46 degrees.
 * 
 * Complete the function to find the height of the building
 * 
 * @author kward60
 */
public class TrigHeight {
    
    private final int distance1 = 250;
    private final int theta1 = 24;
    private final int distance2 = 200;
    private final int theta2 = 46;
    private static DecimalFormat df = new DecimalFormat("##.######");
    
    /**
     * Compute height of the building
     * 
     * Hint:
     * 1) Notice the java.lang.Math import
     * 2) If the man is looking UP at the building,
     * what kind of shape is being formed? And after
     * he moves?
     * 
     * @return 
     */
    public static double computeHeight()
    {
        double height = 0;
        
        //Your solution here
        
        return height;
    }
    
    public static void main(String[] args) {
        System.out.println("Height = " + computeHeight() + "m");
        System.out.println("Solved = " + solved(computeHeight()));
    }
    
    public static boolean solved(double height)
    {
        String form_height = df.format(height);
        String form_ans = df.format(4613.10292);
        System.out.println(form_height);
        System.out.println(form_ans);
        return form_height.equals(form_ans);
    }
    
}
