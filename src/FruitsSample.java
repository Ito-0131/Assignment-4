import java.util.List;
import java.util.stream.Collectors;

public class FruitsSample {
    public static void main(String[] args) {
        List<String> fruits = List.of("lemon", "watermelon", "banana", "grapefruit");
        List<String> filteredFruits = fruits.stream().filter(name -> name.contains("e")).collect(Collectors.toList());
        filteredFruits.forEach(System.out::println);
    }
}
