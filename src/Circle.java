public class Circle {
    private  double radius=1.0;
    String color="red";

    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double setRadius(double radius) {
        return this.radius = radius;
    }
    public double getArea(double radius){
        return 3.14*this.radius*this.radius;
    }
}

