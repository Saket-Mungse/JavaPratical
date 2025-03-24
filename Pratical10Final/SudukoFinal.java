import java.util.*;

class SudukoFinal {

    static String[][] originalSudoku;

    static String[][] getSudoku(int size) {
        String[][] arr = new String[size][size];
        originalSudoku = new String[size][size];
        Random rad1 = new Random();
        int randomNo = rad1.nextInt(size);
        int k = randomNo + 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (k > size) {
                    k = k % size;
                }
                arr[i][j] = k + "";
                originalSudoku[i][j] = k + ""; 
                k++;
            }
            k++;
        }

        int count = (size * size) / 3;
        while (count > 0) {
            for (int i = 0; i < size && count > 0; i++) {
                for (int j = 0; j < size && count > 0; j++) {
                    k = rad1.nextInt(size);
                if (k == 0 && !arr[i][j].equals(" ")) {
                    arr[i][j] = " "; 
                    count--;
                }
            }
        }
    }

        return arr; 
}

    static void printSudoku(String[][] sudoku) {
        int size = sudoku.length;
        int cellWidth = String.valueOf(size).length() + 1;

        for (int line = 1; line <= size; line++) {
            for (int horiLine = 1; horiLine <= size; horiLine++) {
                System.out.print("-".repeat(cellWidth + 1));
            }
            System.out.println();
            for (int vLS = 1; vLS <= 2 * size + 1; vLS++) {
                if (vLS % 2 == 0) {
                    if (sudoku[line - 1][(vLS / 2) - 1].equals(" ")) {
                        System.out.print(" ".repeat(cellWidth));
                    } else {
                        System.out.printf("%-" + cellWidth + "s", sudoku[line - 1][(vLS / 2) - 1]);
                    }
                } else {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        System.out.println("-".repeat(size * (cellWidth + 1)));
    }

    static void solveSudoku(String[][] sudoku) {
        Scanner scanner = new Scanner(System.in);
        boolean isCorrect = true;

        System.out.println("Enter numbers for the empty spaces:");
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
            if (sudoku[i][j].equals(" ")) {
                System.out.println("Enter the number for row " + (i + 1) + " and column " + (j + 1) + ":");
                int userInput = scanner.nextInt();

            if (userInput == Integer.parseInt(originalSudoku[i][j])) {
                sudoku[i][j] = Integer.toString(userInput);
            } else {
                isCorrect = false;
            }
            System.out.println("\nUpdated Sudoku:");
            printSudoku(sudoku);
            }
        }
    }scanner.close();

        if (isCorrect) {
            System.out.println("Great Work! Your Suduko Is Correct");
        } else {
            System.out.println("Wrong Answer!");
        }
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        String[][] sudoku = getSudoku(size);
        printSudoku(sudoku);
        solveSudoku(sudoku);
    }
}
