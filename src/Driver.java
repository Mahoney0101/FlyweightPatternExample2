import java.util.ArrayList;
import java.util.Random;

public class Driver
{
    public static void main(String[] args)
    {
        Random random = new Random();
        String [] RAMS = {"16","8","32"};
        String [] processor = {"AMD", "Intel","IBM"};
        ArrayList<Computer> sales = new ArrayList<>();

        for(int i=0;i<1000000;i++){
            sales.add(ComputerFactory.getLaptop(RAMS[random.nextInt(3)], processor[random.nextInt(3)]));
            sales.add(ComputerFactory.getPC(RAMS[random.nextInt(3)], processor[random.nextInt(3)]));
        }
        System.out.println(sales.size());
        System.out.println(ComputerFactory.getCache());

    }
}