import java.util.*;

class Game {
    static String getSuduko(int size) {
        String[][] arr = new String[size][size];

        Random rad1 = new Random();
        int randomNo = rad1.nextInt(size);
        int k = randomNo + 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (k > size) {
                    k = k % size;
                }
                arr[i][j] = k + "";
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

        String s = "";
        int cellWidth = String.valueOf(size).length() + 1;

        for (int line = 1; line <= size; line++) {
            for (int horiLine = 1; horiLine <= size; horiLine++) {
                s += "-".repeat(cellWidth + 1);
            }
            s += "\n";

            for (int vLS = 1; vLS <= 2 * size + 1; vLS++) {
                if (vLS % 2 == 0) {
                    if (arr[line - 1][(vLS / 2) - 1].isEmpty()) {
                        s += " ".repeat(cellWidth);
                    } else {
                        s += String.format("%-" + cellWidth + "s", arr[line - 1][(vLS / 2) - 1]);
                    }
                } else {
                    s += "|";
                }
            }
            s += "\n";
        }
        s += "-".repeat(size * (cellWidth + 1));

        return s;
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        System.out.println(getSuduko(size));
    }
}













