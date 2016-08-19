package strategy.exemplo3.calculate;

/**
 * Created by gleidesilva on 19/08/16.
 */
public class OperationMultiply implements StrategyOperation {
    @Override
    public int doOperation(int num1, int num2) {
        return (num1 * num2);
    }
}
