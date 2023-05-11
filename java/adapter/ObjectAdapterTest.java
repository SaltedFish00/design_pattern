package adapter;
public class ObjectAdapterTest {
    public static void main(String[] args) {
        // Voltage220V vol220 = new Voltage220V();
        // VoltageAdapter adapter = new VoltageAdapter(vol220);
        Phone phone = new Phone();
        // phone.charging(adapter);
        phone.charging(new VoltageAdapter(new Voltage220V()));
    }
}

interface Voltage5V {
    public int output5V();
}

class Voltage220V {
    public int output220V(){
        int src = 220;
        System.out.println("voltage = " + src + "V");
        return src;
    }
}

class VoltageAdapter implements Voltage5V{
    Voltage220V vol220V;
    public VoltageAdapter(Voltage220V vol220v) {
        vol220V = vol220v;
    }
    @Override
    public int output5V() {
        int src = vol220V.output220V();
        System.err.println("using obiect adapter to adapt");
        int dest = src / 44;
        return dest;
    }

}

class Phone{
    public void charging(Voltage5V vol5v) {
        if(vol5v.output5V() == 5){
            System.out.println("voltage is 5V, can charge");
        } else if(vol5v.output5V() > 5) {
            System.out.println("voltage more than 5V, cannot charge");
        }
    }
}