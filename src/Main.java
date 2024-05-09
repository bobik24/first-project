//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> femaleNames = new ArrayList<>();
        femaleNames.add("Екатерина");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add(1,"Наталья");
        if (femaleNames.contains("Екатерина")) {
            System.out.println("Есть");
        }
        femaleNames.clear();
        if (femaleNames.contains("Екатерина")) {
            System.out.println("Есть");
        } else {
            System.out.println("Нет");
        }
    }
}