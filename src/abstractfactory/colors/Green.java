package abstractfactory.colors;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("From Green Fil Method");
    }
}