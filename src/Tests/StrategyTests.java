package Tests;
import Patterns.StrategyPattern.Duck;
import Patterns.StrategyPattern.MallardDuck;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StrategyTests {

    @Test
    void mallartNormalFly(){
        Duck mallard=new MallardDuck();
        assertEquals("Normal fly",mallard.performFly());

    }
}
