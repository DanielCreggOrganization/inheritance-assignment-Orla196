import ie.gmit.animal.*;
import ie.gmit.twodshapes.*;

public class Main {

    // Add main method here
    public static void main(String[] args) {
        
        Triangle triangleObject1 = new Triangle(10.5f,5.0f,"scalene");
        ColouredTriangle colouredTriangleObject1 = new ColouredTriangle(12.5f,21.4f,"scalene","red");
        Circle circleObject1 = new Circle(12.3f,13.2f,13.2f);

        // triangleObject1.setWidthCm(10.5f);
        // triangleObject1.setHeightCm(32.4f);
        // colouredTriangleObject1.setHeightCm(27.8f);
        // circleObject1.setWidthCm(22.6f);

        System.out.println("\nWidth of triangle: "+triangleObject1.getWidthCm()+" cm");
        System.out.println("Height of triangle: "+triangleObject1.getHeightCm()+" cm");
        System.out.println("Height of coloured triangle: "+colouredTriangleObject1.getHeightCm()+" cm");
        System.out.println("Radius of circle: "+circleObject1.findRadiusCm()+" cm");
    }
} // End class
