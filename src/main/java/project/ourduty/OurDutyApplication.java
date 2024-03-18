package project.ourduty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //해당 어노테이션을 선언해야 BaseEntity를 인식
@SpringBootApplication
public class OurDutyApplication {

	public static void main(String[] args) {
		SpringApplication.run(OurDutyApplication.class, args);
	}

}
