package at.library.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
public class SLoaned {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer idCustomer;
    private Integer idBook;
    @Temporal(TemporalType.TIMESTAMP)
    private Date loanedOn;
    @Temporal(TemporalType.TIMESTAMP)
    private Date returnedOn;
    private boolean extraTime;

    public SLoaned () {
    }

    public SLoaned(Integer idCustomer, Integer idBook, Timestamp loanedOn, Timestamp returnedOn, boolean extraTime) {
        this.idCustomer = idCustomer;
        this.idBook = idBook;
        this.loanedOn = loanedOn;
        this.returnedOn = returnedOn;
        this.extraTime = extraTime;
    }

    public Integer getId() {
        return id;
    }

    public Integer getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(Integer idCustomer) {
        this.idCustomer = idCustomer;
    }

    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    public Date getLoanedOn() {
        return loanedOn;
    }

    public void setLoanedOn(Date loanedOn) {
        this.loanedOn = loanedOn;
    }

    public Date getReturnedOn() {
        return returnedOn;
    }

    public void setReturnedOn(Date returnedOn) {
        this.returnedOn = returnedOn;
    }

    public boolean isExtraTime() {
        return extraTime;
    }

    public void setExtraTime(boolean extraTime) {
        this.extraTime = extraTime;
    }
}
