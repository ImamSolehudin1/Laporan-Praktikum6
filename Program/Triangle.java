public class Triangle extends Shape {
    private double set;
    private float a;
    private float t;


    public Triangle(double set,float a, float t) {
        this.set = set;
        this.a = a ;
        this.t = t ;

    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    public float getAreas() {
        return (float) (set * a * t);
    }
}

