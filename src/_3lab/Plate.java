package _3lab;


public class Plate extends Dish{

    private double depth,diametr;
    @Override
    public double getSize() {
        return Math.PI*Math.pow(diametr/2,2)*depth;
    }

    public Plate(double depth, double diametr,String color) {
        this.depth = depth;
        this.diametr = diametr;
        this.color=color;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getDiametr() {
        return diametr;
    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "depth=" + depth +
                ", diametr=" + diametr +
                ", color='" + color + '\'' +
                '}';
    }
}
