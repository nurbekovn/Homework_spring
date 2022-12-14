package org.example;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Setter
@Getter
@NoArgsConstructor
@ToString

@Component
@Scope("singleton")

public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private Animal animal;
    private Animal animal2;


    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
    }

    @Autowired
    public Person(@Qualifier("horse") Animal animal, @Qualifier("parrot")Animal animal2) {
        this.animal = animal;
        this.animal2 = animal2;
    }

    @PostConstruct
    private void init() {
        System.out.println("Man class : init method ");
    }

    @PreDestroy
    protected void destroy() {
        System.out.println("Man class : destroy method ");
    }
    public void callYourFavoriteAnimal(){
        animal.animalPlus();
        animal2.animalPlus();
        System.out.println(getName());
        System.out.println(getAge());
    }
}