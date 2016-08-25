package behavioral_patterns.strategy.exemplo3;

import behavioral_patterns.strategy.exemplo3.calculate.OperationAdd;
import behavioral_patterns.strategy.exemplo3.calculate.OperationDivision;
import behavioral_patterns.strategy.exemplo3.calculate.OperationMultiply;
import behavioral_patterns.strategy.exemplo3.calculate.OperationSubstrat;
import behavioral_patterns.strategy.exemplo3.context.Context;

/**
 * Created by gleidesilva on 19/08/16.
 * fonte: http://www.tutorialspoint.com/design_pattern/strategy_pattern.htm
 */
public class StrategyPattern {

    public static void main (String []args){
        Context add = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + add.execStrategy(10, 5));

        Context sub = new Context(new OperationSubstrat());
        System.out.println("10 - 5 = " + sub.execStrategy(10, 5));

        Context mult = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + mult.execStrategy(10, 5));

        Context div = new Context(new OperationDivision());
        System.out.println("10 / 5 = " + div.execStrategy(10, 5));

    }
}
