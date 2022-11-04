package com.example.hibernatefinal;

import com.example.hibernatefinal.entities.Address;
import com.example.hibernatefinal.entities.Author;
import com.example.hibernatefinal.entities.Book;
import com.example.hibernatefinal.entities.Subject;
import com.example.hibernatefinal.repository.AuthorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;

@SpringBootTest
class HibernatefinalApplicationTests {

	@Autowired
	AuthorRepository repository;


	@Test
	public void testCreateAuthor()
	{
		Author author=new Author();
		author.setFirstName("Chetan");
		author.setLastName("Bhagat");
		HashSet<Book> books=new HashSet<>();
		Book book1=new Book();
		book1.setBookName("Two states");
		books.add(book1);
		author.setBookSet(books);

		Address address=new Address();
		address.setStreetNumber(111);
		address.setLocation("Delhi Street");
		address.setState("Delhi");
		author.setAddress(address);
		repository.save(author);

	}
	@Test
	public void testPersist()
	{

		Author author=new Author();

		author.setFirstName("Chetan");
		author.setLastName("Bhagat");

		Subject subject=new Subject();

		subject.setAuthor(author);
		subject.setName("Comedy");

		Subject subject1=new Subject();

		subject1.setAuthor(author);
		subject1.setName("Drama");

		Subject subject2=new Subject();

		subject2.setAuthor(author);
		subject2.setName("Love");

		HashSet<Subject> subjects=new HashSet<>();
		subjects.add(subject);
		subjects.add(subject1);
		subjects.add(subject2);
		author.setSubjects(subjects);

		Address address=new Address();
		address.setStreetNumber(111);
		address.setLocation("Delhi Street");
		address.setState("Delhi");
		author.setAddress(address);

		repository.save(author);


	}
}
