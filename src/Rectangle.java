public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return length * width;
    }

    public double getDiagonal() {
        double x = width * width + length * length;
        return Math.sqrt(x);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean isSquare() {
        if(length == width) {
            return true;
        } else {
            return false;
        }
    }
}
