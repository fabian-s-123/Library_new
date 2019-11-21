package at.library.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SCustomer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String pinCode;
    private String email;
    private String firstName;
    private String lastName;
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthDay;
    private String street;
    private String apNr;
    private int zip;
    private String city;
    private long creditCardNr;
    private int cvc;
    private int expiryDateYear;
    private int expiryDateMonth;

    public SCustomer (){
    }

    public SCustomer(String pinCode, String email, String firstName, String lastName, Date birthDay, String street, String apNr, int zip, String city, long creditCardNr, int cvc, int expiryDateYear, int expiryDateMonth) {
        this.pinCode = pinCode;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.street = street;
        this.apNr = apNr;
        this.zip = zip;
        this.city = city;
        this.creditCardNr = creditCardNr;
        this.cvc = cvc;
        this.expiryDateYear = expiryDateYear;
        this.expiryDateMonth = expiryDateMonth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApNr() {
        return apNr;
    }

    public void setApNr(String apNr) {
        this.apNr = apNr;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getCreditCardNr() {
        return creditCardNr;
    }

    public void setCreditCardNr(long creditCardNr) {
        this.creditCardNr = creditCardNr;
    }

    public int getCvc() {
        return cvc;
    }

    public void setCvc(int cvc) {
        this.cvc = cvc;
    }

    public int getExpiryDateYear() {
        return expiryDateYear;
    }

    public void setExpiryDateYear(int expiryDateYear) {
        this.expiryDateYear = expiryDateYear;
    }

    public int getExpiryDateMonth() {
        return expiryDateMonth;
    }

    public void setExpiryDateMonth(int expiryDateMonth) {
        this.expiryDateMonth = expiryDateMonth;
    }
}
