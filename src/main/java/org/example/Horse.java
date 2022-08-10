package org.example;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Horse implements Animal{
    @Value("${breed.of.horse}")
    private String breedOfHorse;
    @Value("${color.of.horse}")
    private String colorOfHorse;

    @Override
    public void animalPlus() {
        System.out.println("Horse is a best animal ");
        this.colorOfHorse = colorOfHorse;
        System.out.println(getBreedOfHorse());
        System.out.println(getColorOfHorse());

    }

    @Override
    public void animalMinus() {
        System.out.println("I think , horse don't minus ");
    }
}
