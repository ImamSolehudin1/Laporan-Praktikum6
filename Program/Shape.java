public abstract class Shape {
    String color;

    public String getColor() {
        return this.color;
}

    public void setColor(String color) {
        this.color = color;
}

     public abstract void draw();
    public abstract float getAreas();
}