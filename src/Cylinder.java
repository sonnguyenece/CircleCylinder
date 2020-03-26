public class Cylinder extends Circle {
    private double height;

    public Cylinder() {

    }

    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getV() {
        return super.getArea() * this.height;
    }

    @Override
    public String toString() {
        return "A cylinder is a subclass of circle with: "
                +"Height= " + height
                +" V " + getV()+" "
                +super.toString();
    }
}
