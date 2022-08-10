package example2;

import lombok.*;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Pappy implements Animal{
    @Value("${pappy.breed}")
    private String breedOfPappy;
    @Value("${pappy.color}")
    private String colorOfPappy;

    private Man man;

    public Pappy(Man man) {
        this.man = man;
    }

    @Override
    public void animalPlus() {
        System.out.println("Pappy is a good animal");
    }

    @Override
    public void animalMinus() {
        System.out.println("In pappy not minus ");
    }

}
