package org.yup.NeighborhoodLibrary;

public class Book {

    private int id;

    private String isbn;

    private String title;

    private Boolean isCheckedOut = false;

    private String checkedOutTo = "";

    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
    }

    public void checkOut(String name){
        this.setCheckedOutTo(name);
        this.setCheckedOut(true);
    }

    public void checkIn(){
        this.setCheckedOutTo(" ");
            this.setCheckedOut(false);

    }
//Getters and Setters
    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Boolean getCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(Boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
