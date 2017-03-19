package customer;

public class Customer {

    private String Name;
    private Prefab[] Prefa;
    private Do_It_Yourself[] DoIt;
    private Drinks[] Drink;

    public Customer() {
        this.Prefa = new Prefab[10];
        this.DoIt = new Do_It_Yourself[10];
        this.Drink = new Drinks[10];
    }

    public String getName() {
        return Name;
    }

    public void setName(String x) {
        this.Name = x;
    }

    public void addPrefab(Prefab x, int y) {
        this.Prefa[y] = x;
    }

    public void addDo_It_Yourself(Do_It_Yourself x, int y) {
        this.DoIt[y] = x;
    }

    public void addDrinks(Drinks x, int y) {
        this.Drink[y] = x;
    }

    @Override
    public String toString() {
        return "Customer{" + "Name=" + Name + ", Prefa=" + Prefa + ", DoIt=" + DoIt + ", Drink=" + Drink + '}';
    }
    
}
