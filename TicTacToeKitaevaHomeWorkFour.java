import java.util.Random;
import java.util.Scanner;


    /**
    *KitaevaJavaHomeWorkFour
    *
    *@author KseniaKitaeva
    *@version 15.11.2021
    */

    class TicTacToeKitaevaHomeWorkFour {

        final char SIGN_X = 'x';
        final char SIGN_O= 'O';
        final char SIGN_NOSIGN = '.';
        char[][] table;
        Scanner sc;
        Random random;

        public static void main (String[] args) {

            System.out.println("New game starts!");
            System.out.println(" ");

            new TicTacToeKitaevaHomeWorkFour().game();
    }

    TicTacToeKitaevaHomeWorkFour() {
        table = new char [3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }

    void game() {
        initTable();
        while(true) {
            humanTurn();
            if (checkWin(SIGN_X)) {
                System.out.println("Congratulations! You won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW.");
                 break;
            }
            computerTurn();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println("Computer won!");
                break;
            }
            if (isTableFull()) {
                System.out.println("Sorry, DRAW.");
                 break;
            }
        }
                System.out.println("Game over.");
                printTable();
    }

    void initTable() {
        for (int i = 0;i <3; i++) {
            for (int j = 0; j < 3; j++) {
                table[i] [j] = SIGN_NOSIGN;
            }
        }
    }

    void printTable() {
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
            System.out.print(table[x][y] + " ");
            }
            System.out.println();
        }
    }

    void humanTurn() {
        int x, y;
        do {
            System.out.print("Now it is your turn, please type two numbers: x y (from 1 to 3):   ");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table[x][y] =SIGN_X;
    }

    void computerTurn() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table[x][y] = SIGN_O;
    }

    boolean checkWin(char ch) {
        if (table[0] [0] == ch && table [1][0] == ch && table [2][0] ==ch) return true;
        if (table[0] [1] == ch && table [1][1] == ch && table [2][1] ==ch) return true;
        if (table[0] [2] == ch && table [1][2] == ch && table [2][2] ==ch) return true;

        if (table[0] [0] == ch && table [0][1] == ch && table [0][2] ==ch) return true;
        if (table[1] [0] == ch && table [1][1] == ch && table [1][2] ==ch) return true;
        if (table[2] [0] == ch && table [2][1] == ch && table [2][2] ==ch) return true;

        if (table[0] [0] == ch && table [1][1] == ch && table [2][2] ==ch) return true;
        if (table[2] [0] == ch && table [1][1] == ch && table [0][2] ==ch) return true;
        return false;
    }

    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
    }
        return table[x][y] == SIGN_NOSIGN;
        }



    boolean isTableFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if  (table[i][j] ==SIGN_NOSIGN) {
                    return false;
                }
            }
        }
        return true;
    }
}



