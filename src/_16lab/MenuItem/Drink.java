package _16lab.MenuItem;

public final class Drink extends MenuItem implements Alcoholable{
    private final double alcoholVol;
    private final DrinkTypeEnum type;

    Drink(int cost, String name, String description, double alco, DrinkTypeEnum type) {
        super(cost, name, description);
        this.alcoholVol = alco;
        this.type = type;
    }
    @Override
    public void isAlcoholicDrink() {
        if(alcoholVol > 0.5) {
            System.out.println("Это алкогольный напиток");
        }
    }
    @Override
    public double getAlcoholVol() {
        return alcoholVol;
    }
}