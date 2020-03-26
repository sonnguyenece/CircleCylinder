public class Circle {
    private double radius;
    private String color;

    public Circle(){
    }

    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }

    public void setColor(String color){
        this.color=color;
    }

    public double getRadius(){
        return this.radius;
    }

    public String getColor(){
        return this.color;
    }

    public double getArea(){
        return (double) Math.round(this.radius*this.radius*Math.PI*100)/100;
    }

    public String toString(){
        return "A circle with radius = "
                +getRadius()
                +". Color: " + getColor()
                +". Area: " + getArea();
    }

}
