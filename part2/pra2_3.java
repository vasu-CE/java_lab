
import java.util.Scanner;

public class pra2_3 {
    private int x;
    private int y;
    pra2_3(int x,int y){
        this.x = x;
        this.y = y;
    }

    public void move(int xd , int yd){
        x = x+xd;
        y = y+yd;
        if(x>100){
            this.x = 100;
        }else if(x<0){
            this.x = 0;
        }else{
            this.x = x;
        }

        if(y>100){
            this.y = 100;
        }else if(y<0){
            this.y = 0;
        }else{
            this.y = y;
        }
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int X,Y,dX,dY;
        System.out.print("Enter x cordinate : ");
        X = scanner.nextInt();
        System.out.print("Enter y cordinate : ");
        Y = scanner.nextInt();
        pra2_3 ob = new pra2_3(X,Y);

        System.out.print("Enter difference of x cordinate : ");
        dX = scanner.nextInt();
        System.out.print("Enter difference of y cordinate : ");
        dY = scanner.nextInt();
        ob.move(dX,dY);
        System.out.println(ob);
        System.out.println("Created by 23CE054");
    }
}
