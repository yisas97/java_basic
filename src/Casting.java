public class Casting
{

    public static void main(String[] args)
    {
        //En un año, ubicar a 30 perritos
        //Cauantos perritos ubique al mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        //Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        //Se trimca ña parte decimal
        System.out.println(estimatedMonthlyDogs);

        int m = 15;
        System.out.println((int)Math.sqrt(m));

        //Exactitud
        int a = 30;
        int b = 12;
        System.out.println((double)a/b);

    }
}

