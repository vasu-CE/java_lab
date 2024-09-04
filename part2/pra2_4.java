
import java.util.Scanner;
public class pra2_4 {

    public static void change(String str1,String str2){
        str2 = "CHARUSAT";
        String result = str1 + str2;
        System.out.println(result);
    }

    public static void change(String str){
        String result = str.replace('A','Z');
        int len = result.length();
        System.out.println("Length of the String is : " + len);
        if(len>10){
            result = result.toLowerCase();
            System.out.println("Lower case : " + result);
        }else{
            System.out.println(result);
        }
            
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.print("Enter a String : ");
        str = scanner.nextLine();
        // System.out.println(str);
        String[] split = str.split(" ");
        if(split.length>1){
            change(split[0],split[1]);
        }else{
            change(str);
        }
        System.out.println("Created by 23CE054");
    }
}
