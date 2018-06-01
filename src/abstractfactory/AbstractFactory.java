package abstractfactory;

abstract class AbstractFactory {

    private static final TypeAFactory TYPE_A_FACTORY = new TypeAFactory();

    private static final TypeBFactory TYPE_B_FACTORY = new TypeBFactory();

    private static AbstractFactory factory;

    static AbstractFactory getFactory(ComputerGrade computerGrade) {
        switch (computerGrade) {
            case TYPE_A:
                factory = TYPE_A_FACTORY;
                break;
            case TYPE_B:
                factory = TYPE_B_FACTORY;
                break;
            default:
                break;
        }

        return factory;
    }

    abstract Motherboard getMotherBoard();

    abstract CPU getCPU();

    abstract Memory getMemory();

}
