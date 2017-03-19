package customer;

public class Main {

    public static void main(String[] args) {
        Customer cliente = new Customer();
        cliente.setName("Jonathan");
        Prefab uno = new Prefab();
        uno.setName("Champiñones");
        uno.setToppings("Pollo");
        uno.setToppings("Champiñones");
        uno.setToppings("Queso");
        uno.setBase("Crispy");
        uno.setSize(12);
        uno.setPrice(15.99);
        cliente.addPrefab(uno, 0);
        Drinks b = new Drinks();
        b.setName("Coca Cola");
        b.setSize("Small");
        b.setPrice(2.95);
        cliente.addDrinks(b, 0);
        Do_It_Yourself c = new Do_It_Yourself();
        Toppings Queso = new Toppings();
        Queso.setName("Piña");
        Queso.setPrice(4.12);
        Toppings Piña = new Toppings();
        Piña.setName("Piña");
        Piña.setPrice(7.24);
        Toppings Peperoni = new Toppings();
        Peperoni.setName("Peperoni");
        Peperoni.setPrice(3.10);
        c.addToppings(Queso, 0);
        c.addToppings(Piña, 1);
        c.addToppings(Peperoni, 2);
        c.setSize(9);
        System.out.println(cliente.getName());
        System.out.println(uno);
        System.out.println(b);
        System.out.println(c);
        System.out.println(Piña.getName());
        System.out.println(Queso.getName());
        System.out.println(Peperoni.getName());
    }
}
