package test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Cinema;
import entity.Movie;

public class AOPTest {
	public static AbstractApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
	
	public static void testCinemaAOP() {
		Cinema cinema = context.getBean("cinema", Cinema.class);
		cinema.showTheMovie();
	}
	
	public static void testCinemaAOP2() {
		Cinema cinema = context.getBean("cinema", Cinema.class);
		cinema.showTheMovie("LaLaLand");
	}
	
	public static void testCinemaAOP3() {
		Cinema cinema = context.getBean("cinema", Cinema.class);
		Movie movie = context.getBean("movie1", Movie.class);
		cinema.showTheMovie(movie);
	}
	
	public static void main(String[] args) {
		testCinemaAOP2();
	}
}
