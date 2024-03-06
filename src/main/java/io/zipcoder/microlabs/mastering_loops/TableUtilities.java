package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {
    public static String getSmallMultiplicationTable() { // 5 rows
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int result = i * j;
                table.append(String.format("%3d |", result));
            }
            table.append("\n");
        }
        return table.toString();

    }


    public static String getLargeMultiplicationTable() { // 10 rows
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                table.append(String.format("%3d |", result));
            }
            table.append("\n");
        }
        return table.toString();
    }


    public static String getMultiplicationTable(int tableSize) { // tablesize
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                int total = i * j;
                table.append(String.format("%3d |", total));
            }
            table.append("\n");
        }
        return table.toString();
    }
}
