package zx.going;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * Created by zx on 2015/11/21.
 */
@EnableAutoConfiguration
public class ApplicationMain {

    public static  void  main(String[] args){
        new SpringApplication(ApplicationMain.class).run(args);
    }

}
