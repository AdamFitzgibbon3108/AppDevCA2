package com.example.appdevca2;

public class Book {
    private String name;
    private String review;
    private String status;
    private String category;  // New field for category

    // Default constructor (required for Firebase)
    public Book() {
    }

    // Constructor with name, review, status, and category
    public Book(String name, String review, String status, String category) {
        this.name = name;
        this.review = review;
        this.status = status;
        this.category = category;  // Initialize category
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

    // Getter and Setter methods for category
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Method to check if the review is empty
    public boolean hasReview() {
        return review != null && !review.isEmpty();
    }

    @Override
    public String toString() {
        return "Book{name='" + name + "', review='" + review + "', status='" + status + "', category='" + category + "'}";
    }
}

