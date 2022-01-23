/*
Dev: Lord Saiyan
Formatação da classe LocalDateTime utilizando o método ofPattern() e a classe java.time.format.DateTimeFormatter.
*/

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main
{
	public static void main(String[] args) {
		
		LocalDateTime nao_formatado = LocalDateTime.now();
		
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("DD-mm-YYYY HH:mm:ss");
		
		String data_formatada = nao_formatado.format(formatado);
		
		
		System.out.println("Antes da formatação: "+nao_formatado);
		System.out.println("\nDepois da formatação: "+data_formatada);
		
	}
}
