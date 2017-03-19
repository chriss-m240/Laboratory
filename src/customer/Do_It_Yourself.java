package customer;

public class Do_It_Yourself {

    private String Sauce;
    private int Size;
    private Toppings[] Topping;

    public Do_It_Yourself() {
        this.Sauce = "Tomato Sauce";
        this.Topping = new Toppings[10];
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int x) {
        this.Size = x;
    }

    public void addToppings(Toppings x, int y) {
        this.Topping[y] = x;
    }

    @Override
    public String toString() {
        return "Do_It_Yourself{" + "Sauce=" + Sauce + ", Size=" + Size + ", Topping=" + Topping + '}';
    }
    
}
