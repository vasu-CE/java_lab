// package part3;

// import java.util.Scanner;

// interface recyclable{
//     default void message(){
//         System.out.println("Bottle returnd for recycling");
//     }
// }
// class Bottle implements recyclable{
//     private double volume;
//     Bottle(double volume){
//         this.volume = volume;
//     }
//     public double vol(){
//         return volume;
//     }
// }
// class SodaBottle extends Bottle {
//     private String name;
//     SodaBottle(String name,double volume){
//         super(volume);
//         this.name = name;
//     }
//     public String toString(){
//         return name + ", "+ vol() + " litres";
//     }
// }
// public class pra3_3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Type in the name of the soda : ");
//         String name = scanner.next();
//         System.out.print("Type in the volume of the bottle : ");
//         double volume = scanner.nextDouble();
//         SodaBottle ob = new SodaBottle(name, volume);
//         System.out.println(ob);
//         ob.message();
//     }
// }
