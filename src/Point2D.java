public class Point2D {
    private float x;
    private float y;
    public Point2D(){
        float x = 0.0f;
        float y = 0.0f;
    }
    public Point2D(float x,float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[]{getX(),getY()};
    }

    @Override
    public String toString() {
        return "["+getXY()[0]+", "+getXY()[1]+"]";
    }
}
