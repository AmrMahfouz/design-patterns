package abstractfactory;

class TypeBFactory extends AbstractFactory {
    @Override
    public Motherboard getMotherBoard() {
        return new TypeBMotherBoard();
    }

    @Override
    public CPU getCPU() {
        return new TypeBCPU();
    }

    @Override
    public Memory getMemory() {
        return new TypeBMemory();
    }
}
