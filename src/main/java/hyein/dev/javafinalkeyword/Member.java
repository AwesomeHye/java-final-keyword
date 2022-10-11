package hyein.dev.javafinalkeyword;

import org.springframework.stereotype.Component;

@Component
public class Member {
    private final Study study;

    public Member() {
        this.study = new Study("seoul");
    }

    public final String getFinalStudy() {
        return study.getArea();
    }

    public String getStudy() {
        return study.getArea();
    }
}