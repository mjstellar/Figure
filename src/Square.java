public class Square extends Quadrangle implements Figure{
    public Square(int a, String color) {
        super(a, a, color);
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a, 2) * 2);
    }

    @Override
    public double area() {
        return Math.pow(a, 2);
    }

    @Override
    public double perimeter() {
        return a * 4;
    }

    @Override
    public String getColor(){
        return color;
    }

    @Override
    public double getHeight() {
        return a;
    }
}
