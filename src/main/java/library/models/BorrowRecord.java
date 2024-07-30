package library.models;

import java.util.Date;

public class BorrowRecord {
    // Attributes: user, book, borrow_date, return_date

    private String user;
    private String book;
    private Date borrowDate;
    private Date returnDate;

    // Methods: getters and setters for each attribute,


    public BorrowRecord(String user, String book, Date borrowDate, Date returnDate) {
        this.user = user;
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getUser() {
        return user;
    }

    public String getBook() {
        return book;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    //method to calculate overdue days,


    public long overdueDays(){
        if(returnDate == null){
            return 0;
        }
        long overdue = new Date().getTime() - returnDate.getTime();
        return overdue / (1000 * 60 * 60 * 24);
    }

    // method to check if the book is currently borrowed

    public boolean ifBorrowed(){
        return returnDate == null;
    }

}
