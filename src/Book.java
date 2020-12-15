public class Book {
    String name;
    String author;
    int price;
    int amount;
    double weight;

    public Book(String name, String author, int price, int amount, double weight) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.amount = amount;
        this.weight = weight;
    }

    public double getTotalPrice(int amount, int price) {
        return amount * price;
    }

    public double getTotalWeight(int amount, int weight) {
        return amount * weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

