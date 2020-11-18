package max.sum;

public class Main {

    public static void main(String[] args) {
	    MaxSumInputReader inputReader = new MaxSumInputReader(args[0]);
	    TwoDArray twoDArray = new TwoDArray(inputReader.getRectangle());
        System.out.println(twoDArray.findMaxSum());
    }
}
