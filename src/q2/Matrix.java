package q2;

import java.util.ArrayList;

class Matrix {
    private String[][] grid;
    private int numRows, numColumns;

    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        grid = new String[numRows][numColumns];
    }

    public void set(int row, int column, String description) {
        grid[row][column] = description;
    }

    public String get(int row, int column) {
        return grid[row][column];
    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> describedCells = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (grid[i][j] != null) {
                    describedCells.add(new Cell(i, j, grid[i][j]));
                }
            }
        }
        return describedCells;
    }

    public class Cell {
        private int row, column;
        private String description;

        public Cell(int row, int column, String description) {
            this.row = row;
            this.column = column;
            this.description = description;
        }

        @Override
        public String toString() {
            return "Cell [Row: " + row + ", Column: " + column + ", Description: " + description + "]";
        }
    }
}

