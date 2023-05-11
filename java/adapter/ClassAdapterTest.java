package adapter;
// caused java.lang.NoSuchMethodError when new Voltage220V, because same class name in ObjectAdaoterTest.java

// public class ClassAdapterTest {
//     public static void main(String[] args) {
//         Phone phone = new Phone();
//         phone.charging(new VoltageAdapter());
//     }
// }

// // It should be class, but one child class only can extend one father calss,
// // so use interfsace instead
// interface Voltage5V {
//     int output5V();
// }

// class Voltage220V {
//     int output220V(){
//         int src = 220;
//         System.out.println("voltage = " + src + "V");
//         return src;
//     }
// }

// class VoltageAdapter extends Voltage220V implements Voltage5V{

//     @Override
//     public int output5V() {
//         int src = output220V();
//         int dest = src / 44;
//         return dest;
//     }

// }

// class Phone{
//     public void charging(Voltage5V vol5v) {
//         if(vol5v.output5V() == 5){
//             System.out.println("voltage is 5V, can charge");
//         } else if(vol5v.output5V() > 5) {
//             System.out.println("voltage more than 5V, cannot charge");
//         }
//     }
// }