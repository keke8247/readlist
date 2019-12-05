package com.test.readlist.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Description
 * @Author wangdk, wangdk@erongdu.com
 * @CreatTime 2019/8/8 11:48
 * @Since version 1.0.0
 */
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String reader;
    private String isbn;
    private String title;
    private String author;
    private String description;

    /**
     * Gets the value of id.
     *
     * @return the value of id.
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the id.
     * <p>
     * <p>You can use getId() to get the value of id</p>
     *
     * @param id id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Gets the value of reader.
     *
     * @return the value of reader.
     */
    public String getReader() {
        return reader;
    }

    /**
     * Sets the reader.
     * <p>
     * <p>You can use getReader() to get the value of reader</p>
     *
     * @param reader reader
     */
    public void setReader(String reader) {
        this.reader = reader;
    }

    /**
     * Gets the value of isbn.
     *
     * @return the value of isbn.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Sets the isbn.
     * <p>
     * <p>You can use getIsbn() to get the value of isbn</p>
     *
     * @param isbn isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Gets the value of title.
     *
     * @return the value of title.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title.
     * <p>
     * <p>You can use getTitle() to get the value of title</p>
     *
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the value of author.
     *
     * @return the value of author.
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author.
     * <p>
     * <p>You can use getAuthor() to get the value of author</p>
     *
     * @param author author
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the value of description.
     *
     * @return the value of description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the description.
     * <p>
     * <p>You can use getDescription() to get the value of description</p>
     *
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }
}

