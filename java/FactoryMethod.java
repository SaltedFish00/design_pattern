public class FactoryMethod{
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.createProduct();
        productA.info();
    }
}

interface Factory{
    public Product createProduct(); 
}

class FactoryA implements Factory{

    @Override
    public Product createProduct() {
        return new ProductA();
    }
    
}

class FactoryB implements Factory{

    @Override
    public Product createProduct() {
        return new ProductB();
    }
    
}

interface Product{
    public void info();
}

class ProductA implements Product{

    @Override
    public void info() {
        System.out.println("product info: A");
    }

}

class ProductB implements Product{

    @Override
    public void info() {
        System.out.println("product info: B");
    }

}