// Client
public class Prototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep jack = new Sheep("Jack", 0, "black", null);
        Sheep sheep1 = new Sheep("Sean", 1, "white", jack);
        Sheep sheep2 = (Sheep)sheep1.clone();
        Sheep sheep3 = (Sheep)sheep1.clone();

        System.out.println(sheep1.toString());
        System.out.println(sheep2.toString());
        System.out.println(sheep3.toString());
    }
    
}

// Sheep: ConcretePrototype Cloneable: Prototype
class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private Sheep friend;
    public Sheep(String name, int age, String color, Sheep friend) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.friend = friend;
    }
    public Sheep getFriend() {
        return friend;
    }
    public void setFriend(Sheep friend) {
        this.friend = friend;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        // check if friend is the same after clone
        return "Sheep [name=" + name + ", age=" + age + ", color=" + color + ", friend=" + friend.hashCode() + "]";
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }
}