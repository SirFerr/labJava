package _4lab ;

public class PC implements Priceable{
    private int price=1000;
    @Override
    public int getPrices() {
        return price;
    }
}
