package abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(ComputerGrade.TYPE_B);
        System.out.println("CPU Type : " + factory.getCPU().getName());
        System.out.println("Motherboard Type : " + factory.getMotherBoard().getName());
        System.out.println("Memory Type : " + factory.getMemory().getName());
    }

}
