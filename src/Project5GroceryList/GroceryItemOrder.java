package Project5GroceryList;

public class GroceryItemOrder {

    //State fields
    private String name;
    private int quantity;
    private double ppu;

    //Constructors
    public GroceryItemOrder(String name, int quantity, double ppu) {
        this.name = name;
        this.quantity = quantity;
        this.ppu = ppu;
    }

    //Behaviors
    public double getCost(){
        return quantity*ppu;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    //Override
    public String toString() {
        return quantity+"\t"+name+"\t$"+ppu;
    }
}
