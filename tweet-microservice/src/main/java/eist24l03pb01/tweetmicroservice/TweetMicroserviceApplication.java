package eist24l03pb01.tweetmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@SpringBootApplication
public class TweetMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TweetMicroserviceApplication.class, args);
    }
}
