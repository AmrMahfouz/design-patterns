package abstractfactory;

class TypeAFactory extends AbstractFactory {

    @Override
    public Motherboard getMotherBoard() {
        return new TypeAMotherboard();
    }

    @Override
    public CPU getCPU() {
        return new TypeACPU();
    }

    @Override
    public Memory getMemory() {
        return new TypeAMemory();
    }
}
