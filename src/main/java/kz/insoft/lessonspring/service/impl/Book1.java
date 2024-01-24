package kz.insoft.lessonspring.service.impl;

import kz.insoft.lessonspring.service.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

@Slf4j
@Service(value = "b1")
public class Book1 implements Book {

    @Override
    public String getBookName() {
        return "Book 1";
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Book1 - Post Construct");
        File file = new File(System.getProperty("user.dir") + "");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Book1 - Pre Destroy");
    }
}
