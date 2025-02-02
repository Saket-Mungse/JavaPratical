class Pratical7{

static void displayPatternName(int size) {
    size = size + 4;
    for (int line = 0; line < size; line++) {
        for (int character = 0; character < size; character++) {
        if (line == 0) {
         System.out.print("*");
        } else if (line == size / 2) {
         System.out.print("*");
        } else if (line == size - 1) {
         System.out.print("*");
        } else if (line < size / 2) {
        if (character == 0) {
         System.out.print("*");
        } else {
         System.out.print(" ");
        }
        } else {
        if (character == size - 1) {
         System.out.print("*");
        } else {
         System.out.print(" ");
        }
        }
    }
    System.out.print("\t");
    int mid = size / 2;
       for (int character = 0; character < size; character++) {
        if (line == 0 || line == mid) {
         System.out.print("*");
        } else if (character == 0 || character == size - 1) {
         System.out.print("*");
        } else {
         System.out.print(" ");
        }
    }
    System.out.print("\t");
    System.out.print("*");
    if (line < mid) {
    for (int character = 0; character < size; character++) {
    if (character == mid - line - 1) {
     System.out.print("*");
    } else {
    System.out.print(" ");
    }
    }
    } else {
    for (int character = 0; character < size; character++) {
    if (character == line - mid) {
     System.out.print("*");
    } else {
     System.out.print(" ");
    }
    }
}


        for (int character = 0; character < size; character++) {
    if (line == 0) {
     System.out.print("*");
    } else if (line == size / 2) {
     System.out.print("*");
    } else if (line == size - 1) {
     System.out.print("*");
    } else if (character == 0) {
     System.out.print("*");
    } else {
     System.out.print(" ");
    }       
}
System.out.print("\t");
for (int character = 0; character < size; character++) {
    if (line == 0 || character == size / 2) {
     System.out.print("*");
    } else {
     System.out.print(" ");
    }
}
    System.out.println();

    }
}

    public static void main(String[] args) {
        int size = Integer.parseInt(args[0]);
        displayPatternName(size);
    }
}