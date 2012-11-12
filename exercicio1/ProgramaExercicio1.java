
public class ProgramaExercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		Cliente clienteMaria = new Cliente("Maria");
		Pedido p1 = new Pedido(1000);
		ItemDePedido item1Pedido1 = new ItemDePedido(222, 3, 6.0);
		//item do pedido com 3 unidades do produto de c—digo 222, que custa R$ 6
		p1.setCliente(clienteMaria);
		p1.adicionaItem(item1Pedido1);
		
		Pedido p2 = new Pedido(1001);
		ItemDePedido item1Pedido2 = new ItemDePedido(333, 2, 1.30);
		//item do pedido com 2 unidades do produto de c—digo 333, que custa R$ 1.30
		p2.setCliente(clienteMaria);
		p1.adicionaItem(item1Pedido2);
				
		
		ControleDePedidos controle = new ControleDePedidos();
		controle.adicionaPedido(p1);
		controle.adicionaPedido(p2);
		int qtdePedidosMaria = controle.calculaQuantidadeDePedidosDoCliente("Maria");
		if (qtdePedidosMaria == 2){
			System.out.println("Programa correto");
		} else {
			System.out.println("Programa incorreto");
		}
	}

	
	
}
