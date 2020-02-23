package com.company;

/**
 * Игровое поле.
 */
public class FieldBattle {
    private String[][] field;
    private int sizeField = 10;
    char[] arrChar = {'a','b','c','d','e','f','g','h','i','j'};
    String numberCount = "  1 2 3 4 5 6 7 8 9 10";

    public FieldBattle() {
        field = new String[sizeField][sizeField];
        setWawe();
    }


    /**
     * Заполнение поля 'волнами'.
     */
    private void setWawe() {
        field[0][0] = " ";
        for (int x = 0; x < sizeField; x++) {
            for (int y = 0; y < sizeField; y++) {
                field[x][y] = "~";
            }
        }
    }


    /**
     * Вывод поля в консоль.
     */
    public void printField() {

        for (int x = 0; x < sizeField; x++) {
            if (x == 0 ) {
                System.out.println(numberCount);
            }
            System.out.print(arrChar[x]);
            for (int y = 0; y < sizeField; y++) {
                System.out.print(" " + field[x][y]);
            }
            System.out.println("");
        }
    }
}
