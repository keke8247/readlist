package com.test.readlist.repository;

import com.test.readlist.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description
 * @Author wangdk, wangdk@erongdu.com
 * @CreatTime 2019/8/8 11:55
 * @Since version 1.0.0
 */
public interface ReadingListRepository extends JpaRepository<Book,Long>{
    List<Book> findByReader(String reader);
}
