package menuArea;

public class Product extends Menu{
    double price;
    Product(String name,String description,double price) {
        super(name, description);
        this.price = price;
    }
    @Override
    public String toString(){
        return  "\"" + getName() + " | W "+ price+" | "+ getDescription();
    }
}
