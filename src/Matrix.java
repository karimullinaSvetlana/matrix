import java.util.Arrays;
public class Matrix {
    float[][] mat1;

    Matrix(float[][] mat1){
        this.mat1 = mat1;
    }
    public float[][] sum(float[][] mat1, float[][] mat2){
        float[][] sum = new float[mat1.length][mat1[0].length];
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            System.out.println("матрицы имеют разные размеры");
            return sum;
        }
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1[0].length; j++){
                sum[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        return sum;
    }
    public float [][] pr(float n){
        float[][] pr = new float[mat1.length][mat1[0].length];
        for (int i = 0; i<mat1.length; i++){
            for (int j = 0; j<mat1[0].length; j++){
                pr[i][j] = mat1[i][j]*n;
            }
        }
        return pr;
    }
    public void print(float[][] mat){
        for (float[] line : mat) {
            System.out.println(Arrays.toString(line));
        }
    }
     float[][] multiplication(float[][] mat1, float[][] mat2) {
        float[][] result = new float[mat1.length][mat2[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = multiplication1(mat1, mat2, i, j);
            }
        }
        return result;
    }
    float multiplication1(float[][] mat1, float[][] mat2, int i, int j) {
        float meaning = 0;
        for (int l = 0; l < mat2.length; l++) {
            meaning += mat1[i][l] * mat2[l][j];
        }
        return meaning;
    }
}
