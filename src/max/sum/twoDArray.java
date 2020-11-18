package max.sum;

public class twoDArray {
    int[][] rectangle;
    int size;
    public twoDArray(int[][] rectangle){
        this.rectangle = rectangle;
        this.size = rectangle.length;
    }

    public int findMaxSum () {
        int biggestNum = Integer.MIN_VALUE;
        for (int rowIndex = 0; rowIndex < size; rowIndex++) {
            for (int colIndex = 0; colIndex < size; colIndex++) {
                for (int rectWidth = 0; rectWidth < size; rectWidth++) {
                    for (int rectHeight = 0; rectHeight < size; rectHeight++) {
                        int sum = 0;
                        for(int i = rowIndex; i <= rectWidth; i++) {
                            for (int j = colIndex; j <= rectHeight; j++) {
                                sum += rectangle[i][j];
                            }
                        }
                        if (sum > biggestNum) {
                            biggestNum = sum;
                        }
                    }
                }
            }
        }
        return biggestNum;
    }
}
