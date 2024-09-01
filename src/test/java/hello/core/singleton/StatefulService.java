package hello.core.singleton;

public class StatefulService {

    public int getPrice() {
        return price;
    }

    private int price;

    public void order(String name , int price) {
        System.out.println("name + = " + name + " price =" + price);
        this.price = price;
    }
}
