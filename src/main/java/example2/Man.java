package example2;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Setter
@Getter
@NoArgsConstructor
@ToString


public class Man {
    @Value("${man.name}")
    private String name;
    @Value("${man.age}")
    private String age;

}
