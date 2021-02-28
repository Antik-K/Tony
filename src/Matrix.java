public class Matrix {

    int line = 5;
    int column = 5;
    double[][] mas = new double[line][column];

    public double[][] sum(double[][] new_mas) {
        double[][] mas_sum = new double[line][column];
        System.out.println("Сумма двух массивов");
        for (int i = 0; i < mas_sum.length; i++) {
            for (int j = 0; j < new_mas[0].length; j++) {
                mas_sum[i][j] = mas[i][j] + new_mas[i][j];
            }
        }
        System.out.println();
        return mas_sum;
    }

    public void printMas(double[][] mas) {

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[0].length; j++) {
                System.out.printf("%f  ", mas[i][j]);
            }
            System.out.println();
        }
    }
}