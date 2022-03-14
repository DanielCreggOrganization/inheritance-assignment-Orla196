package ie.gmit.twodshapes;

public class ColouredTriangle extends Triangle{
    
    //instance variable
    private String colour;

    public ColouredTriangle(float widthCm, float heightCm, String sideType, String colour) {
        super(widthCm, heightCm, sideType);
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
