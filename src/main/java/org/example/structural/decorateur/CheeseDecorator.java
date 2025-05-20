package org.example.structural.decorateur;


// decorateur pour mes pizzas (ajoute du fromage) basé sur mon de corateur pizza abstrait
public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" ,au Fromage";
    }

    @Override
    public double getCost() {
        return super.getCost()+ 1.50;
    }
}
