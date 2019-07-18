package gradle.spring.boot.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    public TransferService transferService(){
//        return new TransferServiceImpl();
//    }

    @Bean("dummy1")
    public Dummy dummy1(){
        return new Dummy("the first dummy");
    }

    @Bean("dummy2")
    public Dummy dummy2(){
        return new Dummy("the second dummy");
    }

//    @Bean("object1")
//    public SomeObject someObject1(){
//        return new SomeObject(dummy1());
//    }
//
//    @Bean("object2")
//    public SomeObject someObject2(){
//        return new SomeObject(dummy2());
//    }
}
