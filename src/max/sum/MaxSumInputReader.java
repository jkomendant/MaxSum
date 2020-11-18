package max.sum;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxSumInputReader {

    private int[][] rectangle;

    public MaxSumInputReader(String file){
        try {
            Scanner inputFile = new Scanner(new File(file));
            int arraySize = inputFile.nextInt();
            rectangle = new int[arraySize][arraySize];
            ArrayList<Integer> arrayList = new ArrayList<>();
            while (inputFile.hasNextInt()){
                int input = inputFile.nextInt();
                arrayList.add(input);
            }

            int k = 0;
            for (int i = 0; i < arraySize; i++) {
                for (int j = 0; j < arraySize; j++) {
                    rectangle[i][j] = arrayList.get(j+k);
                }
                k +=100;
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public int[][] getRectangle() {
        return rectangle;
    }
}
