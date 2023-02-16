public class Main {
    public static void main(String[] args) {
        float[][] mat1;
        Matrix mat = new Matrix(mat1 = new float[][]{{1,5},{2,3}});
        float[][] mat2 = new float[][]{{1,5,4},{2,2,5}};
        System.out.println("сумма:");
        float[][] sum = mat.sum(mat1, mat2);
        mat.print(sum);
        System.out.println("умножение на число:");
        float[][] pr = mat.pr(4);
        mat.print(pr);
        System.out.println("произведение двух матриц:");
        float[][] multiplication = mat.multiplication(mat1, mat2);
        mat.print(multiplication);
    }
}
