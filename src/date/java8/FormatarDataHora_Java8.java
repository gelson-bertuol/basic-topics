package date.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatarDataHora_Java8 {

	public static void main(String[] args) {
		
		// *** FORMATAÇÃO data-hora para texto ISO 8601 ***
		LocalDate d12 = LocalDate.parse("2022-07-20");
			//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter ftm3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Formatação data para texto ISO8601 original....................................: " + d12);
		System.out.println("Formatação data para texto no formato 'dd/MM/yyyy'.............................: " + d12.format(ftm3));
		System.out.println("Formatação data para texto no formato 'dd/MM/yyyy'.............................: " + ftm3.format(d12));
		
		// *** FORMATAÇÃO data-hora para texto em um formato customizado ***
		LocalDateTime d13 = LocalDateTime.parse("2022-07-20T01:30:26");
		DateTimeFormatter ftm4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter ftm5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		System.out.println("Formatação data-hora para texto ISO8601 original...............................: " + d13);
		System.out.println("Formatação data-hora para texto no formato 'dd/MM/yyyy HH:mm:ss'...............: " + d13.format(ftm5));
		System.out.println("Formatação data-hora para texto no formato 'dd/MM/yyyy HH:mm'..................: " + d13.format(ftm4));
		System.out.println("Formatação data-hora para texto no formato 'dd/MM/yyyy'........................: " + d13.format(ftm3));
		
		// *** FORMATAÇÃO data-hora timezone (Instant) para texto em um formato customizado ***
		Instant d14 = Instant.parse("2022-07-20T01:30:26Z");
		DateTimeFormatter ftm6 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		System.out.println("Formatação data-hora TIME_ZONE LOCAL (Instant) para texto no 'dd/MM/yyyy HH:mm.: " + ftm6.format(d14));
		DateTimeFormatter ftm7 = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("Formatação LocalDateTime para texto usando padrão ISO_DATE_TIME................: " + ftm7.format(d13));
		DateTimeFormatter ftm8 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("Formatação Instant TIME_ZONE para texto usando padrão ISO_INSTANT..............: " + ftm8.format(d14));
		
	}
}
