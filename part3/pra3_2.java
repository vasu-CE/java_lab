package part3;
import java.util.Scanner;

interface recyclable{
    // public static final String message = "Give proper input";
    default void message(){
        System.out.println("Give proper input");
    }
}
class Fabric implements recyclable{
    public String toString(){
        return "Fabric recycled...";
    }
}

class Bottle implements recyclable{
    public String toString(){
        return "Bottle recycled...";
    }
}
class Paper implements recyclable{
    public String toString(){
        return "Newspaper recycled...";
    }
}


public class pra3_2 {
    
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
    do{
        System.out.println("What do you want to recycle? ");
        System.out.println("1 - Clothes");
        System.out.println("2 - Bottles");
        System.out.println("3 - Newspapers");
        System.out.println("4 - Exit");
        System.out.print("Choose a Number : ");
        n = scanner.nextInt();
        Fabric fabric = new Fabric();
        Bottle bottle = new Bottle();
        Paper paper = new Paper();
        switch(n){
            case 1:
                System.out.println(fabric);
                break;
            case 2: 
                System.out.println(bottle);
                break;
            case 3: 
                System.out.println(paper);
                break;
            case 4:
                break;
            default:
                paper.message();
        }
    }while(n!=4);
    System.out.println("Thanks for Coming!!!");
   }
}
