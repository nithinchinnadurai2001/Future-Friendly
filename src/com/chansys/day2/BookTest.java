package com.chansys.day2;

public class BookTest {

	public static void main(String[] args) {
		Book book1 = new Book();
		book1.bookName = "Java";
		book1.bookId = 2534;
		book1.author = "John";
		book1.pageCount = 6352;
		book1.price = 120;
		System.out.println("Book Name : " + (book1.bookName));
		System.out.println("Book Id : " + (book1.bookId) + "\n" + "Book Author : " + (book1.author) + "\n" + "Page Count : " + (book1.pageCount) + "\n" + "Price : " + (book1.price));

	}

}
