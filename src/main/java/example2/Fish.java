package example2;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Fish implements Animal{
    @Value("${fish.breed}")
    private String breedOfFish;
    @Value("${fish.color")
    private String colorOfFish;

    private Man man;

    public Fish(Man man) {
    }

    @Override
    public void animalPlus() {
        System.out.println("Fish is a delicious food;");
    }

    @Override
    public void animalMinus() {
        System.out.println("No minus of Fish ");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "breedOfFish='" + breedOfFish + '\'' +
                ", colorOfFish='" + colorOfFish + '\'' +
                '}';
    }
}
