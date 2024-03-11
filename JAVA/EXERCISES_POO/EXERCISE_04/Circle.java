public class Circle extends Figure {

    private double radio;

    public Circle(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * this.radio*this.radio;
    }
}