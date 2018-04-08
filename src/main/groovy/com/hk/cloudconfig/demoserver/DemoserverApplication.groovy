package com.hk.cloudconfig.demoserver

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.config.server.EnableConfigServer
@EnableConfigServer
@SpringBootApplication

class DemoserverApplication {

	static void main(String[] args) {
		SpringApplication.run DemoserverApplication, args
	}
}
