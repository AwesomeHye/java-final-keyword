package hyein.dev.javafinalkeyword;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class JavaFinalKeywordApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(JavaFinalKeywordApplication.class, args);
    }

    private final Member member;

    @Override
    public void run(String... args) throws Exception {

        log.info("{}", member.getFinalStudy());
        log.info("{}", member.getStudy());

    }
}
