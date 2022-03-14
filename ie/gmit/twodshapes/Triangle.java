package ie.gmit.twodshapes;
public class Triangle extends TwoDShape{
    
    // Instance Varibales
    private String sideType;

    public Triangle(float widthCm, float heightCm, String sideType){
        super(widthCm, heightCm);
        this.sideType = sideType;
    }

    //getter
    public String getSideType(){
        return this.sideType;
    }
    //setter
    public void setSideType(String sideType) {
        this.sideType = sideType;
    }
    
}
