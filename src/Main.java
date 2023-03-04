import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] manchesterUnited = {"antony","martial","rashfor","de gea","l.martinez","bruno"};
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten cau thu");
        String name = sc.nextLine();
        boolean number = false;
        for (int i = 0; i < manchesterUnited.length; i++) {
            if(manchesterUnited[i].equals(name)){
                System.out.println("cau thu "+(name) + " mang ao so " + (i));
                number = true;
            }
        }
        if(number == false){
            System.out.println("khong co cau thu nao ten nhu vay");
        }
    }
}
