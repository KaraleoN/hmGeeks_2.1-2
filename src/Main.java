import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Создание массива для хранения объектов Printable
        Printable[] objects = new Printable[3];

        // Создание объектов с помощью метода createObject
        objects[0] = createObject("2й", 1, "Property of 2nd");
        objects[1] = createObject("3й", 2, 3.14);
        objects[2] = createObject("4й", 3, true);

        // Вызов метода print() для каждого объекта в массиве
        for (Printable obj : objects) {
            obj.print();
        }
    }

    // Метод для создания объектов классов ChildClass2, ChildClass3 и ChildClass4
    public static Printable createObject(String className, int parentId, Object property) {
        switch (className) {
            case "2й":
                return new ChildClass2(parentId, (String) property);
            case "3й":
                return new ChildClass3(parentId, (double) property);
            case "4й":
                return new ChildClass4(parentId, (boolean) property);
            default:
                throw new IllegalArgumentException("Unknown class name: " + className);
        }
    }
}