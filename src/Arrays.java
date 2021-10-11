public class Arrays
{

    public static void main(String[] args)
    {
        String[] androidVersions = new String[5];

        String days[] = new String[7];

        /*
         * +------------------------------+
         * |  Country    |  City          |
         * --------------------------------
         * | México      | CDMX           |
         * | México      | Guadalajara    |
         * | Colombia    | Bogotá         |
         * | Colombia    | Medellín       |
         * +------------------------------+
         * */

        // 1: reglon , 2: columna
        String[][] cities = new String[4][2]; // dimension de 2

        // 2 reglones 2 columnas 2 cajas
        int [][][] vector = new int[2][2][2];

        int [][][][] vectorR4 = new int[2][2][2][2];

        String[][] citiesP=new String[4][2];

        citiesP[0][0]="Colombia";
        citiesP[1][0]="Colombia";
        citiesP[2][0]="Brasil";
        citiesP[3][0]="Brasil";
        citiesP[0][1]="Pasto";
        citiesP[1][1]="Armenia";
        citiesP[2][1]="Sao Paolo";
        citiesP[3][1]="Rio de Janeiro";

        System.out.println("|"+citiesP[0][0]+"|"+citiesP[0][1]+"|\n");
        System.out.println("|"+citiesP[1][0]+"|"+citiesP[1][1]+"|\n");
        System.out.println("|"+citiesP[2][0]+"|"+citiesP[2][1]+"|\n");
        System.out.println("|"+citiesP[3][0]+"|"+citiesP[3][1]+"|\n");

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
        //System.out.println(androidVersions);


        String[][][][] animals = new String[2][3][2][2];

        animals[1][0][0][1] = "Monkey";

        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i < androidVersions.length; i++)
        {
            System.out.println(androidVersions[i]);
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < citiesP.length ; i++)
        {
            for (int j = 0; j< citiesP[i].length ; j++)
            {
                System.out.println(citiesP[i][j]);
            }

        }
        System.out.println("--------------ForEach--------------");
        for (String androidVersion:androidVersions)
        {
            System.out.println(androidVersion);
        }

        System.out.println("----------pregunta de examen-------------");
        int i = 1, j = 2 , k =3 , m = 2;
        System.out.println((j>=i) || (k == m));

        System.out.println("----------pregunta de examen-------------");
        int x = 1;
        while (x <= 10)
        {
            System.out.println(++x);
        }



    }
}
