//package Source;

import Controllers.MenuController;
import Interfaces.DBASample;
import Interfaces.DBActions;
import Interfaces.MMSample;
import Interfaces.MenuManagable;
import Views.ViewShelter;

public class App {
    public static void main(String[] args) throws Exception {

        /** Приветственное слово */
        System.out.println("Привет! Это система учета питомника животных");
        String filename = "AnimalShelter\\src\\db\\shelter.txt";
        DBActions dbActions = new DBASample(filename);
        MenuManagable menuManagable = new MMSample(dbActions);
        MenuController menuController = new MenuController(menuManagable);
        ViewShelter viewShelter = new ViewShelter(menuController);
        viewShelter.run();
    }
}
