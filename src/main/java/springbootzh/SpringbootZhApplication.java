package springbootzh;

//import comyz.config.DBConfig1;
//import comyz.config.DBConfig1;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ComponentScan(basePackages = {"comyz","springbootzh"})//"demo.feng",demo.shujuyuan
@MapperScan(basePackages ={"comyz.dao"}) //mybatis  //"demo.feng",
//@EntityScan("comyz.entities")
//@EnableConfigurationProperties(value = { DBConfig1.class})

@EnableCaching
@EnableScheduling
@EnableAsync
public class SpringbootZhApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootZhApplication.class, args);
    }

}
