import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerBook library = new ManagerBook();
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        int choice = -1;
        while (choice != 0){
            System.out.println("1.Enter new book");
            System.out.println("2.Enter edit book");
            System.out.println("3.Get expensive book");
            System.out.println("4.Get sum price of book");
            System.out.print("Enter your choice:");

            choice = sc.nextInt();
            switch (choice){
                case 1:
                    library.addNewBook();
                    break;
                case 2:
                    System.out.println("Enter index:");
                    int index = sc.nextInt();
                    library.editBookByIndex(index);
                    break;
                case 3:
                    System.out.println("Expensive Book is: " + library.getMaxPrice());
                    break;
                case 4:
                    System.out.println("Sum Price of Book is: " + library.getSumPrice());
                    break;
                default:
                    System.out.println("No choice");
            }
        }
    }
}
