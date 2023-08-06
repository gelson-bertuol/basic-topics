package date.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ObterValoresDataHora_Java8 {

	public static void main(String[] args) {

		// *** OPERAÇÃO - Converter data-hora global para local ***
		
		// Converte o Instant para uma data local considerando o TimeZone do computador.
		Instant d01 = Instant.parse("2022-07-20T01:30:26Z");
		LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault());
		System.out.println("r1: " + r1);

		// Converte o Instant para uma data local considerando o TimeZone de Portugal.
		Instant d02 = Instant.parse("2022-07-20T01:30:26Z");
		LocalDate r2 = LocalDate.ofInstant(d02, ZoneId.of("Portugal"));
		System.out.println("r2: " + r2);
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d02, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d02, ZoneId.of("Portugal"));
		System.out.println("r3: " + r3);
		System.out.println("r4: " + r4);
		LocalDateTime r5 = LocalDateTime.ofInstant(d02, ZoneId.of("Europe/London"));
		System.out.println("r5: " + r5);
		

		// *** OPERAÇÃO - Obter dados de uma data-hora local ***
		
		// Obter data-hora local -> dia, mês, ano, horário
		LocalDate d03 = LocalDate.parse("2022-07-20");
		// Imprimir o DIA
		System.out.println("d03 - dia: " + d03.getDayOfMonth());
		// Imprimir o MES
		System.out.println("d03 - mês: " + d03.getMonthValue());
		// Imprimir o ANO
		System.out.println("d03 - ano: " + d03.getYear());

		LocalDateTime d04 = LocalDateTime.parse("2022-07-20T01:30:26");
		// Imprimir a HORA
		System.out.println("d04 - hora: " + d04.getHour());
		// Imprimir os MINUTOS
		System.out.println("d04 - minutos: " + d04.getMinute());
		// Imprimir os SEGUNDOS
		System.out.println("d04 - segundos: " + d04.getSecond());
		
	}
}
