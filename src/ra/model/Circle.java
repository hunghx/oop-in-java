package ra.model;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double chuVi, double dienTich, double radius) {
        super(chuVi, dienTich); // gọi đến constructor của lớp cha
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "chuvi : "+getChuVi()+" , diện tích : "+getDienTich()+
                ", PI=" + PI +
                '}';
    }
}
