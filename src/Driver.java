import java.util.ArrayList;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Computer> computers = new ArrayList();
        Random random = new Random();
        String [] RAM = {"8GB", "16GB" , "32GB"};
        String [] processor = {"Intel", "AMD", "IBM"};
        for(int i=0;i<100000;i++){
            Computer laptop = new Laptop();
            laptop.setRAM(RAM[random.nextInt(3)]);
            laptop.setProcessor(processor[random.nextInt(3)]);
            Computer PC = new PersonalComputer();
            PC.setRAM(RAM[random.nextInt(3)]);
            PC.setProcessor(processor[random.nextInt(3)]);
            computers.add(laptop);
            computers.add(PC);
        }
        System.out.println(computers.size());
    }
}
