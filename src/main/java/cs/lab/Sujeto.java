package cs.lab;

import java.util.Observable;
import java.util.Observer;

public class Sujeto implements Observer {
    String attribute;
    public Sujeto(){}

    @Override
    public void update(Observable o, Object value) {
        attribute=(String) value;
    }
}
