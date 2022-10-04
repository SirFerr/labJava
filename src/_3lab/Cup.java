package _3lab;

public class Cup extends Dish{
    private double height,area;
    @Override
    public double getSize() {
        return height*area;
    }

    public Cup(double height, double area,String color) {
        this.height = height;
        this.area = area;
        this.color=color;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Cup{" +
                "height=" + height +
                ", area=" + area +
                ", color='" + color + '\'' +
                '}';
    }
}
