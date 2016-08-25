package behavioral_patterns.strategy.exemplo3.context;

import behavioral_patterns.strategy.exemplo3.calculate.StrategyOperation;

/**
 * Created by gleidesilva on 19/08/16.
 */
public class Context {
    //Criar uma propriedade que tem comportamento das operações
    private StrategyOperation strategy;

    public Context(StrategyOperation strategy) {
        this.strategy = strategy;
    }

    public int execStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
