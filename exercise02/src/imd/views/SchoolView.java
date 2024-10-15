package imd.views;

import imd.models.Event;
import imd.models.School;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SchoolView {
	public static void main(String args []) throws ParseException{
		School school = new School();
		readInput(school);	
		showEvents(school);
	}

	private static void readInput(School school) throws ParseException{
		Scanner sc = new Scanner(System.in);

		Event event = new Event();
		String desc, date;
		Date formattedDate;

		System.out.print("Insert event's description: ");
		desc = sc.nextLine();
		System.out.print("Insert event's date: ");
		date = sc.nextLine();

		formattedDate = new SimpleDateFormat("dd-MM-yyyy").parse(date);
		event.setDate(formattedDate);
		event.setDescription(desc);

		school.addEvent(event);
	}

	private static void showEvents(School school){
		System.out.println("------- EVENTS -------");
		for (Event e : school.getEvents()){
			System.out.println("DATE: " + e.getDate());
			System.out.println("DESCRIPTION: " + e.getDescription());
		}
	}
}


