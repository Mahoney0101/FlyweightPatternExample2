public class Laptop implements Computer{

    final ComputerType computerType = ComputerType.Laptop;
    private String processor;
    private String RAM;
    private String laptopCase = "leatherCase";

    @Override
    public void setProcessor(String processor) {
        this.processor=processor;
    }

    @Override
    public void setRAM(String RAM) {
        this.RAM=RAM;
    }
}
