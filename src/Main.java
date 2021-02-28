import java.util.Random;

public class Main
{

    public static void main(String[] args)
    {
        Matrix m = new Matrix();

        double[][] mas = createMas("mas1", m.line, m.column);
        double[][] mas2 = createMas("mas2", m.line, m.column);

        m.mas = mas;

        double[][] sum = m.sum(mas2);
        m.printMas(sum);
    }

    public static double[][] createMas(String masName, int line, int column) {
        double[][] mas = new double[line][column];
        Random r = new Random();

        System.out.printf("Создание массива %s", masName);
        System.out.println();
        System.out.println();

        for (int i = 0; i < mas.length; i++)
        {
            for (int j = 0; j < mas[0].length; j++)
            {
                double var = r.nextDouble();
                mas[i][j] = (r.nextInt(100) - 20) + var;

                System.out.printf("%f  ", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return mas;
    }
}
