public class Square extends Rectangle{
    public  Square(double side){
        super(side,side);
    }
    //No es necesario sobrescrbir calcularArea(); porque al implementar
    //de Rectangulo ya estamos obteniendo la funcionalidad
}
