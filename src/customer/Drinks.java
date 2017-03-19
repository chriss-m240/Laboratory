package customer;

public class Drinks {

    private String Name;
    private String Size;
    private double Price;

    public Drinks() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String x) {
        this.Name = x;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String x) {
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
        return "Drinks{" + "Name=" + Name + ", Size=" + Size + ", Price=" + Price + '}';
    }
    
}
