package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Drink coffee = new ShortBlack();
        coffee = new Milk(coffee);
        coffee = new Milk(coffee);
        coffee = new Chocolate(coffee);
        System.out.println(coffee.cost());
        System.out.println(coffee.getDesc());
    }
}

abstract class Drink {
    String desc;
    Float price = 0.0f;
    public abstract Float cost();
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Float getPrice() {
        return price;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    
}

class Coffee extends Drink {

    @Override
    public Float cost() {
        return super.getPrice();
    }
    
}

class ShortBlack extends Coffee {

    public ShortBlack() {
        setDesc("ShortBlack");
        setPrice(20.00f);
    }
    
}

class Decorator extends Drink {

    Drink drink;
    

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public Float cost() {
        return drink.cost() + super.getPrice();
    }
    
    @Override
    public String getDesc() {
        return drink.getDesc() + " " + super.getDesc();
    }
}

class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setDesc("Milk");
        setPrice(5.00f);
    }

}

class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setDesc("Chocolate");
        setPrice(7.00f);
    }

}