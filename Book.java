package com.example.finalproject;

public class Book
{
    private String bookCode;
        private String title;
        private String author;
        private int numberOfDaysBorrowed;
        private boolean isBorrowed;

        // Constructor
        public Book(String bookCode, String title, String author) {
            this.bookCode = bookCode;
            this.title = title;
            this.author = author;
            this.isBorrowed = false;
        }



        public String getBookCode() {
            return bookCode;
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getNumberOfDaysBorrowed() {
            return numberOfDaysBorrowed;
        }

        public void setNumberOfDaysBorrowed(int numberOfDaysBorrowed) {
            this.numberOfDaysBorrowed = numberOfDaysBorrowed;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }

        // Method to calculate the borrowing cost
        public double calculateBorrowingCost() {
            double baseCost;
            if (this instanceof PremiumBook) {
                baseCost = 50.00;
                if (numberOfDaysBorrowed > 7) {
                    baseCost += (numberOfDaysBorrowed - 7) * 25.00;
                }
            } else {
                baseCost = 30.00;
            }
            return baseCost * numberOfDaysBorrowed;
        }
}

