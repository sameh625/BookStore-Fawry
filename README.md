# Book Store

A Java application for `Fawry challenge` simulating an online book store. The system supports different types of books including paper books, eBooks , and demo books , with support for inventory management, book purchasing, and custom exception handling.

---

## Features

- Add books to inventory (PaperBook, EBook, DemoBook)
- Remove outdated books by publication year
- Buy books using ISBN and quantity
- Send eBooks via email
- Ship paper books to address
- Prevent buying demo books
- ustom exception classes for clean error handling
- Full test class to demonstrate functionality

---

## Project Structure
```
Books/
├── Book.java
├── PaperBook.java
├── EBook.java
├── DemoBook.java
Exceptions/
├── BookNotFoundException.java
├── OutOfStockException.java
├── BuyingDemoException.java
Services/
├── Inventory.java
├── MailService.java
├── ShippingService.java
Tests/
├── BooksTesting.java
```

## Sample Test

Run `BooksTesting` to simulate adding, removing, and buying books with different scenarios.
![image](https://github.com/user-attachments/assets/118bb69a-d517-40fb-8c70-9097794a01a5)
