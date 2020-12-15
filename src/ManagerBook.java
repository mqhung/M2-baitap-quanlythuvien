import java.util.Scanner;

public class ManagerBook {
    Scanner sc = new Scanner(System.in);
    Book book[] = new Book[3];

    public void addNewBook() {
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter author:");
        String author = sc.nextLine();
        System.out.println("Enter price:");
        int price = sc.nextInt();
        System.out.println("Enter amount:");
        int amount = sc.nextInt();
        System.out.println("Enter weight:");
        int weight = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book[i] = new Book(name, author, price, amount, weight);
            } else {
                System.out.println("Full!!Cant add anymore.");
            }
        }
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].name + "\t"+ book[i].author + "\t"+ book[i].price + "\t"
                    + book[i].amount + "\t"+ book[i].weight + "\t");
            break;
        }

    }

    public void editBookByIndex(int index) {
        for (int i = 0; i < book.length; i++) {
            if (i == index) {
                System.out.println("Enter edit name:");
                String newName = sc.nextLine();
                book[i].name = newName;
                System.out.println("Enter edit author:");
                String newAuthor = sc.nextLine();
                book[i].author = newAuthor;
                System.out.println("Enter edit price:");
                int newPrice = sc.nextInt();
                book[i].price = newPrice;
                System.out.println("Enter edit amount:");
                int newAmount = sc.nextInt();
                book[i].amount = newAmount;
                System.out.println("Enter edit weight:");
                int newWeight = sc.nextInt();
                book[i].weight = newWeight;
            }
        }
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].name + "\t"+ book[i].author + "\t"+ book[i].price + "\t"
                    + book[i].amount + "\t"+ book[i].weight + "\t");
            break;
        }
    }

    public int getMaxPrice() {
        int max = book[0].getPrice();
        for (int i = 0; i < book.length; i++) {
            if (max < book[i].getPrice()) {
                max = book[i].getPrice();
            }
        }
        return max;
    }

    public int getSumPrice() {
        int sum = 0;
        for (int i = 0; i < book.length; i++) {
            sum += book[i].getPrice();
        }
        return sum;
    }
}
