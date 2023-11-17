package date.java8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class OperarDataHora_Java8 {

	public static void main(String[] args) {

		// *** OPERAÇÃO - Cálculos com data-hora ***
		
		// Data-hora +/- tempo --> data-hora
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDate pastWeekLocalDate = d01.minusDays(7);
		System.out.println("pastWeekLocalDate: " + pastWeekLocalDate);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		System.out.println("nextWeekLocalDate: " + nextWeekLocalDate);
		
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		System.out.println("pastWeekLocalDateTime: " + pastWeekLocalDateTime);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
		System.out.println("nextWeekLocalDateTime: " + nextWeekLocalDateTime);
		
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		System.out.println("pastWeekInstant: " + pastWeekInstant);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		System.out.println("nextWeekInstant: " + nextWeekInstant);
		
		// Data-hora 1, Data-hora 2 --> duração
		// Não dá pra calcular duration para LocalDate, tem que transformar em LocalDateTime com o .atTime(0, 0) ou .atStartOfDay()
		//Duration t1 = Duration.between(pastWeekLocalDate.atTime(0, 0), d01.atTime(0, 0));
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		System.out.println("t1 dias: " + t1.toDays());
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
		System.out.println("t2 dias: " + t2.toDays());
		
		Duration t3 = Duration.between(pastWeekInstant, d03);
		System.out.println("t3 dias: " + t3.toDays());
		
		Duration t4 = Duration.between(d03, pastWeekInstant);
		System.out.println("t4 dias: " + t4.toDays());
		
	}
}
