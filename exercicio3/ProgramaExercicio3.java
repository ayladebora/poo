import java.util.Scanner;


public class ProgramaExercicio3 {
	public static void main (String args[]){
		String codigo = "";
		Scanner leitor = new Scanner(System.in);
		Pedido p1 = new Pedido(1);
		
		while (!(codigo = leitor.nextLine()).equals("0")){
			String quantidade = leitor.nextLine();
			String valorUnitario = leitor.nextLine();
			ItemDePedido it = new ItemDePedido(
					codigo, 
					Integer.parseInt(quantidade), 
					Double.parseDouble(valorUnitario));
			p1.adicionaItem(it);
		}
		System.out.println("Valor Total:R$"+ p1.getValorTotal());
	}
}
