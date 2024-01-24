package kz.insoft.lessonspring;

import kz.insoft.lessonspring.service.Book;
import kz.insoft.lessonspring.service.impl.Book1;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Library {

    // Field Injection
    @Autowired
   // @Qualifier("b1")
    private Book b1;

    // Constructor
//    private Book book;
//
//    @Autowired
//    public Library(Book b1) {
//        this.book = b1;
//    }


//    private Book book;
//
//    @Autowired
//    public void setBook(Book book2) {
//        this.book = book2;
//    }

    public void getBestBook() {
        log.info("The best book is {}", b1.getBookName());
    }

}
