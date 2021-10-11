public class LogicOperations
{

    public static void main(String[] args)
    {
        int a = 8;
        int b = 5;

        System.out.println("a es igual a b? ->" +(a == b));
        System.out.println("a es diferente a b? -> " + (a!=b));

        System.out.println("a es mayor a b? -> " + (a>=b));

        //if o elese o if anidado

        if (a == b)
        {
            System.out.println("Es igual");
        }else if (a!=b)
        {
            System.out.println("Es diferente");
        }


    }
}
