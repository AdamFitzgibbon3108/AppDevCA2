package com.example.appdevca2;

public class Book {
    private String name;
    private String review;
    private String status;

    // Default constructor (required for Firebase)
    public Book() {
    }

    public Book(String name, String review, String status) {
        this.name = name;
        this.review = review;
        this.status = status;
    }

    // Getter and Setter methods for book name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for review
    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    // Getter and Setter methods for book status
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Method to check if the review is empty
    public boolean hasReview() {
        return review != null && !review.isEmpty();
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', review='" + review + "', status='" + status + "'}";
    }
}


