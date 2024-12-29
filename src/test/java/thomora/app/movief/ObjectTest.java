package thomora.app.movief;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObjectTest {

   @Test
    public void test(){
       Number num = new Number();
       int sum = num.sum(11, 22);
       Assertions.assertEquals(33, sum);
       Assertions.assertEquals(33, num.getLastSum());
       num.sum(0, 5);
       Assertions.assertEquals(5, num.getLastSum());
    }


    class Number {
       private int lastSum;

       public int sum(int one, int two){
           lastSum = one + two ;
           return lastSum;
       }

       public int getLastSum(){
           return lastSum;
       }
    }


}
