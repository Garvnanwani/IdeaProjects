package classes;

interface Car {
    String name = "name";
    String modal = "modal";
    int mileage = 50;

    void move();
}

public class Interfaces implements Car{

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

}
