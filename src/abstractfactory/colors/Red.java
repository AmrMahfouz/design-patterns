package abstractfactory.colors;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("From Red Fill Method");
    }
}
