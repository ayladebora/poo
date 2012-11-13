package br.ufpb.sistemapedidos;
import java.util.Scanner;


public class ProgramaExercicio3 {
	public static void main (String args[]){
		String codigo = "";
		Scanner leitor = new Scanner(System.in);
		Pedido p1 = new Pedido(1);
		
		while (!(codigo = leitor.nextLine()).equals("0")){
			String quantidade = leitor.nextLine();
			String valorUnitario = leitor.nextLine();
			try {
			  ItemDePedido it = new ItemDePedido(
					codigo, 
					Integer.parseInt(quantidade), 
					Double.parseDouble(valorUnitario));
			
			  p1.adicionaItem(it);
			} catch (NumberFormatException e){
				System.out.println("Valores de entrada inv‡lidos. Tente novamente");
			}
		}
		System.out.println("Valor Total:R$"+ p1.getValorTotal());
	}
}
