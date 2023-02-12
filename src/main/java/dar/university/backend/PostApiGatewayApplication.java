package dar.university.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PostApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostApiGatewayApplication.class, args);
	}

}
