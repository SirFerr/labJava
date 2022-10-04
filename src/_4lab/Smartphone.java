package _4lab ;
public class Smartphone implements Priceable {
    private int price=500;
    @Override
    public int getPrices() {
        return price;
    }
}