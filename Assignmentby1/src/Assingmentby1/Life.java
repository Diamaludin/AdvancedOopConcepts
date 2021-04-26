package Assingmentby1;

import Assingmentby1.Insurance;

public class Life extends Insurance {
    public Life() {
        super("Life");
    }

    public void setCost() {

        super.cost = 36;
    }

    public void display() {

       System.out.println(super.getType() + " Insurance monthly fee of $" + super.getCost());

    }
}
