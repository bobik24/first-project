//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Main1 {
    public static void main(String[] args) {
        HashMap<String, Double> orders = new HashMap<>();

        orders.put("Миша",4345.65);
        orders.put("Вася",75345.85);
        orders.put("Коля",1345.76);
        orders.put("Боря",1345.76);

        System.out.println(orders.values());
        System.out.println(orders.keySet());

    }
}