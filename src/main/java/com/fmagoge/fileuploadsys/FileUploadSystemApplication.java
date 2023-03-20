package com.fmagoge.fileuploadsys;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import com.fmagoge.fileuploadsys.storage.properties.StorageProperties;
import com.fmagoge.fileuploadsys.storage.service.StorageService;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class FileUploadSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileUploadSystemApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}

}
