package at.library.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private int authorId;
    private int categoryId;
    private long isbn;
    private int fsk;
    private String publisher;
    private String edition;
    private String firstEdition;
    private int pages;
    private String language;

    public SBook(String title, int idAuthor, int categoryId, long isbn, int fsk, String publisher, String edition, String firstEdition, int pages, String language) {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getFirstEdition() {
        return firstEdition;
    }

    public void setFirstEdition(String firstEdition) {
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