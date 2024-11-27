import java.util.*;

public class TestCalcChain {
    public static void main(String[] args) {
        Chain chainCalc1 = new AddNumbers();
        Chain chainCalc2 = new SubtractNumbers();
        Chain chainCalc3 = new MultNumbers();
        Chain chainCalc4 = new DivideNumbers();

        chainCalc1.setNextChain(chainCalc2);
        chainCalc2.setNextChain(chainCalc3);
        chainCalc3.setNextChain(chainCalc4);

        ArrayList<Numbers> numbersList = new ArrayList<>();
        Numbers numbers1 = new Numbers(12, 8, "sub");
        numbersList.add(numbers1);
        Numbers numbers2 = new Numbers(3, 4, "mult");
        numbersList.add(numbers2);
        Numbers numbers3 = new Numbers(8, 3, "add");
        numbersList.add(numbers3);
        Numbers numbers4 = new Numbers(2, 2, "pow");
        numbersList.add(numbers4);
        Numbers numbers5 = new Numbers(6, 2, "sub");
        numbersList.add(numbers5);
        
        for (Numbers numbers : numbersList)
            chainCalc1.calculate(numbers);
    }
}
