/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dallas
 */
public class Date {
	public static void main(String[] args) {
		MyDate date1 = new MyDate();
		MyDate date2 = new MyDate(34355555133101L);
		System.out.println("Date1: " + date1.getMonth() + "/" + date1.getDay() + 
			"/" + date1.getYear());
		System.out.println("Date2: " + date2.getMonth() + "/" + date2.getDay() + 
			"/" + date2.getYear());
	}
}
