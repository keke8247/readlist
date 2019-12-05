package com.test.readlist.controller;

import com.test.readlist.entity.Book;
import com.test.readlist.properties.AmazonProperties;
import com.test.readlist.repository.ReadingListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @Description
 * @Author wangdk, wangdk@erongdu.com
 * @CreatTime 2019/8/8 11:57
 * @Since version 1.0.0
 */
@Controller
@RequestMapping("/readerController")
@ConfigurationProperties(prefix = "amazon")
public class ReadingListController {
    private ReadingListRepository readingListRepository;
    private AmazonProperties amazonProperties;

    @Autowired
    public ReadingListController(ReadingListRepository readingListRepository,
                                 AmazonProperties amazonProperties){
        this.readingListRepository=readingListRepository;
        this.amazonProperties=amazonProperties;
    }

    @RequestMapping(value = "/{reader}",method = RequestMethod.GET)
    public String readersBooks(@PathVariable("reader") String reader,
                               Model model){
        List<Book> readingList = readingListRepository.findByReader(reader);

        if(!readingList.isEmpty()){
            model.addAttribute("books",readingList);
            model.addAttribute("reader",reader);
            model.addAttribute("amazonID",amazonProperties.getAssociateId());
        }

        return "readingList";
    }

    @RequestMapping(value = "/{reader}",method = RequestMethod.POST)
    public String addToReadingList(@PathVariable("reader") String reader,Book book){
        book.setReader(reader);
        readingListRepository.save(book);
        return "redirect:/readerController/{reader}";
    }
}
