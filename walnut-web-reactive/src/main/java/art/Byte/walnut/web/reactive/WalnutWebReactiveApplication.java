package art.Byte.walnut.web.reactive;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableApolloConfig
@SpringBootApplication
public class WalnutWebReactiveApplication {

    static void main(String[] args) {
        SpringApplication.run(WalnutWebReactiveApplication.class, args);
    }

}
