public class Rhombuses extends Quadrangle implements Figure{
    double alpha;
    double beta;

    public Rhombuses(int a, double alpha, double beta, String color) {
        super(a, a, color);
        this.alpha = alpha;
        this.beta = beta;
    }

    @Override
    public double getLargeDiagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public double area() {
        double d1 = Math.sqrt(2 - 2 * Math.cos(Math.toRadians(alpha)));
        double d2 = Math.sqrt(2 - 2 * Math.cos(Math.toRadians(beta)));
        return d1 * d2 / 2;
    }

    @Override
    public double perimeter() {
        return a * 2 + b * 2;
    }

    @Override
    public String getColor(){
        return color;
    }

    @Override
    public double getHeight() {
        return area()/a;
    }
}

