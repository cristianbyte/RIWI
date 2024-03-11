public class Main {
    public static void main(String[] args) {
        /*      Figuras Geométricas: Crea una clase abstracta Figura con un método
        abstracto calcularArea(). Luego, extiende esta clase con algunas figuras
        específicas como Circulo, Rectangulo, y Cuadrado, implementando el
        cálculo del área en cada una. Utiliza el concepto de herencia y polimorfismo.*/


        //TEST 1: Calcular el área de un circulo
        Circle objCirculo = new Circle(10);

        System.out.println("El área del circulo es: "+ objCirculo.calcularArea());

        //TEST 2: Calcular el área de un rectangulo
        Rectangle objRectangulo =new Rectangle(20,40);

        System.out.println("El área del rectangulo es: "+ objRectangulo.calcularArea());


        //Test 3: Calcular área de un cuadrado
        Square objCuadrado = new Square(40);
        System.out.println("El área del cuadrado es: "+ objCuadrado.calcularArea());
    }
}