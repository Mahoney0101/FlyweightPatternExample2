import java.util.HashMap;

public class ComputerFactory
{
    private static final HashMap<String, Computer> compMap = new HashMap<>();

    public static Computer getLaptop(String RAM, String processor)
    {
        String key = RAM +"-"+ processor + "-Laptop";

        Computer comp = compMap.get(key);

        if(comp != null) {
            return comp;
        } else {
            comp = new Laptop();
            comp.setRAM(RAM);
            comp.setProcessor(processor);
            compMap.put(key, comp);
        }

        return comp;
    }

    public static Computer getPC(String RAM, String processor)
    {
        String key = RAM  +"-"+ processor+ "-PC";

        Computer comp = compMap.get(key);

        if(comp != null) {
            return comp;
        } else {
            comp = new Laptop();
            comp.setRAM(RAM);
            comp.setProcessor(processor);
            compMap.put(key, comp);
        }

        return comp;
    }
    public static int getCache(){
        return compMap.size();
    }
}
