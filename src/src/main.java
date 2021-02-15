import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Uhrzeit ein im Format 0-24");
        int zeit= scanner.nextInt();

        if(zeit==12){
            System.out.println("Mittagspause");
        }else if (zeit<=7){
            System.out.println("Freizeit");
        }else if ((zeit<=11)  || (zeit<=16)){
            System.out.println("Arbeitszeit");
        }else{
            System.out.println("Freizeit");
        }
    }
}
