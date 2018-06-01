package singleton;

public class SingleObject {

    private static final SingleObject INSTANCE = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getInstance() {
        return INSTANCE;
    }

    public void showMessage() {
        System.out.println("From Show Message In Single Object Instance");
    }

}
