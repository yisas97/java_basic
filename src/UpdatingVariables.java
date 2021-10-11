public class UpdatingVariables
{

    public static void main(String[] args)
    {
        int salary = 1000;
        //PEro recibio un bono de 200
        System.out.println("Su salario inicial es : " + salary);
        salary += 200;
        System.out.println("Su salario total es : " + salary);

        //Pension => descuento de 50 de su pension
        salary -= 50;
        System.out.println("Su salario despues de pagar su pension es : " + salary);

        // 2 horas extras $30 c/u
        // Comida : &45
        salary += (30*2) - 45;
        System.out.println("Su salario despues de pagar su comida y la horas extras es : " +  salary);


        //Actualizadno cadenas de texto
        String empleyeeName = "Jesus Campos";
        empleyeeName += " Vargas";
        System.out.println(empleyeeName);



    }
}
