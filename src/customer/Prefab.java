package customer;

public class Prefab {

    private String Name;
    private String Toppings;
    private String Base;
    private int Size;
    private double Price;

    public Prefab() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String x) {
        this.Name = x;
    }

    public String getToppings() {
        return Toppings;
    }

    public void setToppings(String x) {
        this.Toppings = x;
    }

    public String getBase() {
        return Base;
    }

    public void setBase(String x) {
        this.Base = x;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int x) {
        this.Size = x;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double x) {
        this.Price = x;
    }

    @Override
    public String toString() {
        return "Prefab{" + "Name=" + Name + ", Toppings=" + Toppings + ", Base=" + Base + ", Size=" + Size + ", Price=" + Price + '}';
    }
    
}
