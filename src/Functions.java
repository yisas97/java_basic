public class Functions
{

    public static void main(String[] args)
    {
        int r = 4;
        double area = areaCirculo(r);
        System.out.println("El area del circulo con radio "+ r +" es " + area);

        int r2 = 5;
        double area2 = areaCirculo(r2);
        System.out.println("El area del circulo con radio "+ r2 +" es " + area2);

        //Converidor
        double diner = 100;
        double dolar = convertToDolar(diner,"Dolar");
        double euro = convertToDolar(diner,"Euro");
        double mexicanos = convertToDolar(diner,"MXN");

        System.out.println(dolar);
        System.out.println(euro);
        System.out.println(mexicanos);




    }

    /**
     *
     * @param r El radio del circulo
     * @return operacion
     */
    public static double areaCirculo(double r)
    {
        double operacion;
        operacion = Math.PI*(Math.pow(r,2));
        return operacion;
    }


    /**
     * Descripcion: Funcion que  especificando su moneda convierte una cantidad de dinero a dolares.
     * @param quantity Cantidad de dinero
     * @param currency Tipo de moneda: Solo acepta dolares, euros o mxn
     * @return quantity Devuelve la cantidad actualizada en soles.
     * */
    private static double convertToDolar(double quantity , String currency)
    {
        switch (currency)
        {
            case "Dolar":
                quantity = quantity*(4.09);
                break;
            case "Euro":
                quantity = quantity*(4.73);
                break;
            case "MXN":
                quantity = quantity*(5.07);
                break;
            default:
                System.out.println("Se equivoco en escribir");
        }

        return  quantity;
    }
}
