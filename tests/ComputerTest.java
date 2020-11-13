import org.junit.Assert;
import java.util.ArrayList;
import java.util.Random;

class ComputerTest {
    Random random = new Random();
    String [] RAMS = {"16","8","32"};
    String [] processor = {"AMD", "Intel","IBM"};
    ArrayList<Computer> sales = new ArrayList<>();


    @org.junit.jupiter.api.Test
    void getRegularCache(){
        for(int i=0;i<1000000;i++){
            sales.add(ComputerFactory.getLaptop(RAMS[random.nextInt(3)], processor[random.nextInt(3)]));
            sales.add(ComputerFactory.getPC(RAMS[random.nextInt(3)], processor[random.nextInt(3)]));
        }
        Assert.assertEquals(2000000, sales.size());
    }

    @org.junit.jupiter.api.Test
    void getFactoryCache(){
        for(int i=0;i<1000000;i++){
            ComputerFactory.getLaptop(RAMS[random.nextInt(3)], processor[random.nextInt(3)]);
            ComputerFactory.getPC(RAMS[random.nextInt(3)], processor[random.nextInt(3)]);
        }
        Assert.assertEquals(18, ComputerFactory.getCache());

    }
}