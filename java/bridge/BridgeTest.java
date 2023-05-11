package bridge;

public class BridgeTest {
    // dont need to create class for each brand multiply each type
    public static void main(String[] args) {
        Phone phone = new FlodedPhone(new Huawei());
        phone.operation();
        Phone phone2 = new UpRightPhone(new Huawei());
        phone2.operation();

        Phone phone3 = new FlodedPhone(new Vivo());
        phone3.operation();
    }
    
}

abstract class Phone {
    Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    public abstract void operation();

}

class FlodedPhone extends Phone{

    public FlodedPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void operation() {
        System.out.println("a " + brand.operationImp() + " floded phone");
    }
    
}

class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void operation() {
        System.out.println("a " + brand.operationImp() + " floded phone");
    }
    
}

interface Brand {
    public String operationImp();
}

class Vivo implements Brand {

    String name = "Vivo";

    @Override
    public String operationImp() {
        // System.out.println("Vivo phone");
        return name;
    }

}

class Huawei implements Brand {

    String name = "Huawei";

    @Override
    public String operationImp() {
        // System.out.println("Huawei phone");
        return name;
    }

    public String getName() {
        return name;
    }
    
}