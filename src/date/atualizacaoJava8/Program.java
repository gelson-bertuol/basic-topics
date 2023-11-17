package date.atualizacaoJava8;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		
		// Instanciação
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2023-11-26");
		LocalDateTime d05 = LocalDateTime.parse("2023-11-26T00:12:36");
		Instant d06 = Instant.parse("2023-11-26T00:12:36Z");
		Instant d07 = Instant.parse("2023-11-26T00:12:36-03:00");
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		LocalDateTime d11 = LocalDateTime.of(2022, 7, 20, 1, 30);

		
		System.out.println("----------------------------------------");
		System.out.println("------------- INSTANCIAÇÃO -------------");
		System.out.println("----------------------------------------");
		System.out.println("LocalDate ------------------------------> " + d01.toString());
		System.out.println("LocalDateTime --------------------------> " + d02.toString());
		System.out.println("Instant --------------------------------> " + d03.toString());
		System.out.println("LocalDate Parse ISO 8601 ---------------> " + d04.toString());
		System.out.println("LocalDateTime Parse ISO 8601 -----------> " + d05.toString());
		System.out.println("Instant Timezone GMT -------------------> " + d06.toString());
		System.out.println("Instant Timezone local -----------------> " + d07.toString());
		System.out.println("LocalDate Parse dd/mm/yyyy -------------> " + d08.toString());
		System.out.println("LocalDateTime Parse dd/mm/yyyy HH:mm ---> " + d09.toString());
		System.out.println("LocalDate of ---------------------------> " + d10.toString());
		System.out.println("LocalDateTime of -----------------------> " + d11.toString());
		
		
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("----------------------------------------");
		System.out.println("-------------- FORMATAÇÃO --------------");
		System.out.println("----------------------------------------");
		System.out.println("Formatação como 'dd/MM/yyyy' -----------> " + d04.format(fmt3));
		System.out.println("Formatação como 'dd/MM/yyyy' -----------> " + fmt3.format(d04));
		System.out.println("Formatação como 'dd/MM/yyyy HH:mm' -----> " + d05.format(fmt3));
		System.out.println("Formatação como 'dd/MM/yyyy HH:mm' -----> " + d05.format(fmt4));
		System.out.println("Formatação como 'dd/MM/yyyy HH:mm' -----> " + fmt5.format(d06));
		System.out.println("Formatação como 'dd/MM/yyyy HH:mm' -----> " + fmt6.format(d05));
		System.out.println("Formatação como 'dd/MM/yyyy HH:mm' -----> " + fmt7.format(d06));
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("----------------------------------------");
		System.out.println("-------------- CONVERSÃO ---------------");
		System.out.println("----------------------------------------");
		System.out.println("Convertendo GMT para data local --------> " + r1);
		System.out.println("Convertendo GMT para Portugal ----------> " + r2);
		System.out.println("Convertendo GMT para data local --------> " + r3);
		System.out.println("Convertendo GMT para Portugal ----------> " + r4);
		System.out.println("Extraindo o dia do mês de uma data -----> " + d04.getDayOfMonth());
		System.out.println("Extraindo o mês de uma data ------------> " + d04.getMonthValue());
		System.out.println("Extraindo o ano de uma data ------------> " + d04.getYear());
		System.out.println("Extraindo a hora de um DateTime --------> " + d05.getHour());
		System.out.println("Extraindo os minutos de um DateTime ----> " + d05.getMinute());
		
		LocalDate pastWeekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
		Duration t4 = Duration.between(d06, pastWeekInstant);
		
		System.out.println("----------------------------------------");
		System.out.println("------- CÁLCULOS COM DATA/HORA ---------");
		System.out.println("----------------------------------------");
		System.out.println("Diminuindo 7 dias de uma data ----------> " + pastWeekLocalDate);
		System.out.println("Acrescentando 7 dias a uma data --------> " + nextWeekLocalDate);
		System.out.println("Diminuindo 7 dias de uma data hora -----> " + pastWeekLocalDateTime);
		System.out.println("Acrescentando 7 dias a uma data hora ---> " + nextWeekLocalDateTime);
		System.out.println("Diminuindo 7 dias de data hora GMT -----> " + pastWeekInstant);
		System.out.println("Acrescentando 7 dias de data hora GMT --> " + nextWeekInstant);
		System.out.println("Duração em dias (data local) -----------> " + t1.toDays()); 
		System.out.println("Duração em dias (DateTime) -------------> " + t2.toDays());
		System.out.println("Duração em dias (Instant) --------------> " + t3.toDays());
		System.out.println("Duração em dias (Instant) --------------> " + t4.toDays());
	}
}
