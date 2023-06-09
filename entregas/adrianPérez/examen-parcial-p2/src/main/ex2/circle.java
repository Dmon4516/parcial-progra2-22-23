package main.ex2;

public class circle extends shape{
    protected double radius;

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
        return "Circle[Shape [color=" + color + ", filled=" + filled + "], radius=" + radius + "]";
    }
}
