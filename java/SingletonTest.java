public class SingletonTest {
    
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);

        // Singleton.teststatic(); error when compile
    }
}

class Singleton {
    private Singleton() {

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }

    public void teststatic(){
        System.out.println("can access without object");
    }

    
}