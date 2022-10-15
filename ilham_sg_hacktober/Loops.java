import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jarak;
        
        System.out.print("Jarak : ");
        jarak = sc.nextInt();

        for(int i=0;i<jarak;i++){
            for(int j=i;j<jarak;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
