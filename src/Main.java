import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        int menu4 = 0;
        int menu5 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("hello kha khur luk kĥā ?");
        System.out.println("Rạb arị dī kha khur luk kĥā ?");
        System.out.println("1.หมาทอด 2.หมาตุ๋น \n 3.หมาปิ้ง 4.หมาย่าง \n ");
        for (int menuNumber = scanner.nextInt(); menuNumber != 5;) {
            if (menuNumber == 1) {
                menu1 = menu1 + 1;
            } else if (menuNumber == 2) {
                menu2 = menu2 + 1;
            } else if (menuNumber == 3) {
                menu3 = menu3 + 1;
            } else if (menuNumber == 4) {
                menu4 = menu4 + 1;
            }
            System.out.println("1.หมาทอด 2.หมาตุ๋น \n 3.หมาปิ้ง 4.หมาย่าง \n ");
            menuNumber = scanner.nextInt();
        }
        if (menu1 > 0) {
            System.out.println("หมาทอด จำนวน " + menu1);
        }
        if (menu2 > 0) {
            System.out.println("หมาตุ่น จำนวน " + menu2);
        }
        if (menu3 > 0) {
            System.out.println("หมาปิ้ง จำนวน " + menu3);
        }
        if (menu4 > 0) {
            System.out.println("หมาย่าง จำนวน " + menu4);
        }
    }
   }

