package ie.gmit.twodshapes;

public class TwoDShape {
    
    // Instance Variables
    private float widthCm;
    private float heightCm;

    //Parameterized constructor
    public TwoDShape(float widthCm, float heightCm){
        this.widthCm = widthCm;
        this.heightCm = heightCm;
    }

    // getters
    public float getWidthCm(){
        return this.widthCm;
    }
    public float getHeightCm(){
        return this.heightCm;
    }

    // setters
    public void setWidthCm(float widthCm){
        this.widthCm = widthCm;
    }
    public void setHeightCm(float heightCm){
        this.heightCm = heightCm;
    }

}
