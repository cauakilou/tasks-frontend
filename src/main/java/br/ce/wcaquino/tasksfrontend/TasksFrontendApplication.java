package br.ce.wcaquino.tasksfrontend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// Importe a classe de configuração a ser excluída
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

// Adicione o "exclude" na anotação @SpringBootApplication
@SpringBootApplication(exclude = ErrorMvcAutoConfiguration.class)
public class TasksFrontendApplication {

    public static void main(String[] args) {
        SpringApplication.run(TasksFrontendApplication.class, args);
    }
}