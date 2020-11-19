package max.sum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaxSumInputReader {

    private int[][] rectangle;

    public MaxSumInputReader(String file) {
        try {
            Scanner inputFile = new Scanner(new File(file));
            int arraySize = inputFile.nextInt();
            rectangle = new int[arraySize][arraySize];
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    int input = inputFile.nextInt();
                    rectangle[i][j] = input;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public int[][] getRectangle() {
        return rectangle;
    }
}
