package hyein.dev.javafinalkeyword;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter @Setter
public class Study {
    private String area;

    public Study(String area) {
        this.area = area;
    }

}
