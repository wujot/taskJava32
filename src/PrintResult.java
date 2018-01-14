public class PrintResult {

    // main method
    public static void main (String[] args) {

        // print result
        System.out.println("Klasa to szablon.");
        System.out.println("Obiekt to konkretny egzemplarz klasy i jest tworzony na podstawie deklaracji i " +
                "inicjalizacji");
        System.out.println("Zmienna to typ danych");
        System.out.println("Kazda zmienna musi miec okreslony typ, np. int, albo String.");
        System.out.println("W klasie moga się znajdowac metody, obiekty i zmienne.");
        System.out.println("Inicjalizacje sa wywolywane przez operator new i sluza do tworzenia nowych obiektow.");
        System.out.println("Jesli w klasie zdefiniowano chociaz jeden wlasny konstruktor to kompilator nie wygeneruje " +
                "dla nas konstruktora domyslnego.");
        System.out.println("Zakladajac, ze istnieje klasa Car, to przy zapisie:\n");
        System.out.println("Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);\n");
        System.out.println("car1 nazywamy obiektem,\n");
        System.out.println("a przy zapisie:\n");
        System.out.println("Car car1 = new Car(„BMW”, „M5”, 2007, 2.6);  Car car2 = car1;\n");
        System.out.println("car1 I car2 to dwie zmienne wskazujace na ten sam obiekt\n");
    }
}
