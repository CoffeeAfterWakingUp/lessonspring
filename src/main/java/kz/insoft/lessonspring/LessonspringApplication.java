package kz.insoft.lessonspring;

import kz.insoft.lessonspring.service.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@Slf4j
@SpringBootApplication
public class LessonspringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(LessonspringApplication.class, args);

//		Book book1 = context.getBean("b1", Book.class);
//		log.info("Book 1's name is {}", book1.getBookName());
//
//		Book book2 = context.getBean("book2", Book.class);
//		log.info("Book 2's name is {}", book2.getBookName());

//		Book book = context.getBean(Book.class);
//		log.info("Book's name is {}", book.getBookName());


		Library library = context.getBean(Library.class);
		library.getBestBook();

	}

}
