package kz.insoft.lessonspring.service.impl;

import kz.insoft.lessonspring.service.Book;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Book2 implements Book, DisposableBean, InitializingBean {

    @Override
    public String getBookName() {
        return "Book 2";
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
