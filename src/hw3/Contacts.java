package hw3;

public class Contacts {

	public static void main(String ... args) {
		PhoneBook book = new PhoneBook();
		book.add("Иван", "+79101113843");
		book.add("Семён", "+9117753421");
		book.add("Ленин", "+79603224523");
		System.out.println("номер телефона Ивана:       " + book.getNumber("Иван"));
		System.out.println("номер телефона В.И. Ленина: " + book.getNumber("Ленин"));
		System.out.println("номер телефона Семёна:      " + book.getNumber("Семён"));
	}

}
