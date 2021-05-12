public class Point3D extends Point2D {
    private float z ;
    public Point3D(){
        z = 0.0f;
    }
    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        this.setX(x);
        this.setY(y);
        this.z = z;
    }
    public float[] getXYZ(){
        return new float[] {getX(),getY(),getZ()};
    }

    @Override
    public String toString() {
        return "["+getXYZ()[0]+", "+getXYZ()[1]+", "+getXYZ()[2]+"]";
    }
}
