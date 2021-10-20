package factoryPattern;

import java.util.ArrayList;

abstract public class Car {
    String name;
    int speed;
    int baggageWeight;
    ArrayList forWhat = new ArrayList();

    public String getName() {
        return name;
    }

    public void transport() {
        System.out.println("Transport " + name);
    }

    public void assembly() {
        System.out.println("Assembling " + name);
    }

    public void painting() {
        System.out.println("Painting " + name);
    }

    public void export() {
        System.out.println("Exporting transport " + name);
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(speed + "\n");
        display.append(baggageWeight + "\n");
        for (int i = 0; i < forWhat.size(); i++) {
            display.append((String) forWhat.get(i) + "\n");
        }
        return display.toString();
    }
}
