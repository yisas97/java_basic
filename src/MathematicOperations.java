public class MathematicOperations
{

    public static void main(String[] args)
    {
        double x = 2.1;
        double y = 3;

        System.out.println(Math.PI);
        System.out.println(Math.E);
        //Vuelve un numero entero hacia arriba
        System.out.println(Math.ceil(x));
        //DEvuelve un enterno hacia abajo
        System.out.println(Math.floor(x));

        //Elvado a otro
        System.out.println(Math.pow(x,y));

        //Comparar quien es el mayor
        System.out.println(Math.max(x,y));

        //Devuelve la raiz cuadrada
        System.out.println(Math.sqrt(y));

        //Area de un ciruclo
        System.out.println(Math.PI*(Math.pow(y,2)));

        //Area de una esfera
        double r = 4;
        double area = 4*(Math.PI)*Math.pow(r,2);
        System.out.println(area);

        //Volumen de una esfera
        double volumen = (4/3)*(Math.PI)*(Math.pow(r,3));
        System.out.println(volumen);

    }
}
