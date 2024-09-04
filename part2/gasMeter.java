import java.util.Scanner;
public class gasMeter {
    float o95;
    float o98;
    float diesel;
    public void refuelled(String substance,float amount){
        switch(substance){
            case "95" : 
                o95 += amount;
                break;
            case "98":
                o98 += amount;
                break;
            case "diesel":
                this.diesel += amount;
        }
    }
    public void display(){
        float total = o95+o98+diesel;
        System.out.println("Total used fuel : " + total);
    }
    public void used95(){
        System.out.println("Total used 95 octance fuel : " + o95);
    }
    public void used98(){
        System.out.println("Total used 98 octane fuel : " + o98);
    }
    public void usedDiesel(){
        System.out.println("Total used diesel fuel : "+ diesel);
    }

    public static void main(String[] args) {
    int choise;
    gasMeter ob = new gasMeter();
    do{
        Scanner scanner = new Scanner(System.in);     
        
        System.out.println("What do you want : ");
        System.out.print("1=95, 2=98, 3=Diesel : ");
        choise =scanner.nextInt();
        float amount;

        if (choise <= 0 || choise > 3) {
            break;  // Exit the loop if the choice is invalid
        }
        System.out.println("How much do you want to refuel: ");
        amount = scanner.nextFloat();
        switch(choise){
            case 1 :
                ob.refuelled("95",amount); 
                break;
            case 2:
                ob.refuelled("98", amount);
                break;
            case 3:
                ob.refuelled("diesel", amount);
        }
    }while(choise>0 && choise<4);

    ob.display();
    ob.used95();
    ob.used98();
    ob.usedDiesel();
    System.out.println("Created by 23CE054");
    }
}
