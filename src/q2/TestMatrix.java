package q2;

import java.util.ArrayList;


public class TestMatrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.set(0, 0, "Top-left");
        matrix.set(1, 1, "Center");
        matrix.set(2, 2, "Bottom-right");

        System.out.println(matrix.get(0, 0));
        System.out.println(matrix.get(1, 1));

        ArrayList<Matrix.Cell> describedCells = matrix.getDescribedCells();
        for (Matrix.Cell cell : describedCells) {
            System.out.println(cell);
        }
    }
}
