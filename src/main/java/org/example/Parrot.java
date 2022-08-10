package org.example;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component

public class Parrot implements Animal{
    @Value("${parrot.breed}")
    private String breedOfParrot;
    @Value("${parrot.color}")
    private String colorOfParrot;

    @Override
    public void animalPlus() {
        System.out.println("Parrot is a good ");
        System.out.println(getBreedOfParrot());
        System.out.println(getColorOfParrot());
    }

    @Override
    public void animalMinus() {
        System.out.println("I don't know what a minus is a parrot");
    }
}
