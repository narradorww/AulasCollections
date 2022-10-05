import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};

        System.out.println(carrosPopulares);

        System.out.println("Substitua o consumo do gol por 15.2");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no mapa: " + carrosPopulares.containsKey("tucson"));

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: " + carrosPopulares.keySet());

        System.out.println("Exiba os consumos dos carros: " + carrosPopulares.values());

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");
                Double consumoMaisEficiente = Collections.min(carrosPopulares.values());
                Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
                String modeloMaisEficiente = "";

                for (Map.Entry<String, Double> entry : entries) {
                    if (entry.getValue().equals(consumoMaisEficiente)) {
                        modeloMaisEficiente = entry.getKey();
                        System.out.println("Modelo: " + modeloMaisEficiente + " - Consumo: " + consumoMaisEficiente);
                    }
                }
        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
                Double consumoMenosEficiente = Collections.max(carrosPopulares.values());
                String modeloMenosEficiente = "";

                for (Map.Entry<String, Double> entry : entries) {
                    if (entry.getValue().equals(consumoMenosEficiente)) {
                        modeloMenosEficiente = entry.getKey();
                        System.out.println("Modelo: " + modeloMenosEficiente + " - Consumo: " + consumoMenosEficiente);
                    }
                }



    }
}
