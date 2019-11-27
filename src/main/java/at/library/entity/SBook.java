package at.library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class SBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
/*    @NotNull*/
    /*@Size(max = 50)*/
    private String title;
/*    @Size(max = 2)*/
    private int authorId;
/*    @Size(max = 2)*/
    private int categoryId;
/*    @Size(max = 13)*/
    private long isbn;
/*    @Size(max = 3)*/
    private int fsk;
/*    @Size(max = 50)*/
    private String publisher;
/*    @Size(max = 4)*/
    private int edition;
/*    @Size(max = 4)*/
    private int firstEdition;
/*    @Size(max = 4)*/
    private int pages;
/*    @Size(max = 20)*/
    private String language;

    public SBook(){
    }

    public SBook(String title, int idAuthor, int categoryId, long isbn, int fsk, String publisher, int edition, int firstEdition, int pages, String language) {
        this.title = title;
        this.authorId = idAuthor;
        this.categoryId = categoryId;
        this.isbn = isbn;
        this.fsk = fsk;
        this.publisher = publisher;
        this.edition = edition;
        this.firstEdition = firstEdition;
        this.pages = pages;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getFsk() {
        return fsk;
    }

    public void setFsk(int fsk) {
        this.fsk = fsk;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public int getFirstEdition() {
        return firstEdition;
    }

    public void setFirstEdition(int firstEdition) {
        this.firstEdition = firstEdition;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}