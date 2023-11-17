package date.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InstanciarDataHora_Java8 {

	public static void main(String[] args) {
		
		// *** INSTANCIAÇÃO de data-hora a partir de 'agora' ***
		LocalDate d01 = LocalDate.now();
		System.out.println("Somente data local......: " + d01);
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data local com segundos.: " + d02);
		Instant d03 = Instant.now();
		System.out.println("Data global com segundos: " + d03);
		System.out.println();
		
		// *** INSTANCIAÇÃO data-hora a partir de um texto ISO8601 ***
		LocalDate d04 = LocalDate.parse("2022-07-20");
		System.out.println("Data convertida a partir de um texto para data local.......................: " + d04);
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:15");
		System.out.println("Data e hora convertidas a partir de um texto para data local...............: " + d05);
		Instant d06 = Instant.parse("2022-07-20T01:30:15Z");
		System.out.println("Data e hora convertidas a partir de um texto para data global..............: " + d06);
		Instant d07 = Instant.parse("2022-07-20T01:30:15-03:00");
		System.out.println("Data e hora convertidas para data global a partir de um texto..............: " + d07);
		
			//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		System.out.println("Data convertida para data local a partir de um texto fora do padrão........: " + d08);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		System.out.println("Data e hora convertidas para data local a partir de um texto fora do padrão: " + d09);
		System.out.println();
		
		// *** INSTANCIAÇÃO data-hora a partir de um texto informado: dia, mês, ano, [horário] ***
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		System.out.println("Data convertida para data local a partir de números inteiros informados........: " + d10);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);
		System.out.println("Data e hora convertidas para data local a partir de números inteiros informados: " + d11);
		System.out.println();
		
	}
}
