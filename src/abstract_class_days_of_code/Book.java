package abstract_class_days_of_code;

abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	abstract void display();
}