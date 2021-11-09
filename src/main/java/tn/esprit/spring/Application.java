package tn.esprit.spring;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import tn.esprit.spring.entity.Mp;
import tn.esprit.spring.repository.MpRepository;



@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	ApplicationRunner init(MpRepository mpRepository) {
		Mp mp1=new Mp( "nomProduit", "20", "typeProduit", 2l);
		Mp mp2=new Mp( "nomProduit2", "10", "typeProduit2", 2l);
		return args -> {
			Stream.of(mp1,mp2).forEach(mp -> {
				mpRepository.save(mp);
			});
		};
       }
}
