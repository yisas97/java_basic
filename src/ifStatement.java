public class ifStatement
{

    public static void main(String[] args)
    {
        boolean isBkuetiithEbabled = true;
        int fileSended = 3;
        if (isBkuetiithEbabled){
            System.out.println("Es verdadera");
            fileSended++;
        }else{
            System.out.println("Es falsa");
        }
        int i = 1;
        int j = 2;
        int numeroMayor = 0;
        numeroMayor = i > j ? i : j;
        System.out.println(numeroMayor);
    }

}
