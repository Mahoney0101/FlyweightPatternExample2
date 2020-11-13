public class PersonalComputer implements Computer{
    final ComputerType computerType = ComputerType.PC;
    private String processor;
    private String RAM;

    @Override
    public void setProcessor(String processor) {
        this.processor=processor;
    }

    @Override
    public void setRAM(String RAM) {
        this.RAM=RAM;
    }
}