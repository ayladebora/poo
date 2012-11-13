package br.ufpb.sistemapedidos;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Classe respons‡vel pelo controle de pedidos
 * @author ayla
 *
 */
public class ControleDePedidos implements InterfaceSistemaDeControle {

	private List <Pedido> pedidos;
	
	/**
	 * Construtor default do sistema.
	 */
	public ControleDePedidos(){
		this.pedidos = new ArrayList<Pedido>();
	}
	
	/**
	 * Calcula a quantidade total de pedidos feitos pelo cliente chamado
	 * nomeCliente.
	 * @param nomeCliente O nome do cliente pesquisado.
	 * @return a quantidade de pedidos feitos por esse cliente.
	 */
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		
		int cont = 0;
		for (Pedido p: this.pedidos){
			if (p.getCliente().getNome().equals(nomeCliente)){
				cont++;
			}
		}
		return cont;
	}
	
	/**
	 * Cadastra um novo pedido.
	 * @param p O pedido a ser cadastrado
	 */
	@Override
	public void adicionaPedido(Pedido p) {
		this.pedidos.add(p);

	}

	/**
	 * Pesquisa os pedidos que incluem um certo produto cujo c—digo Ž passado.
	 * @param codProduto o C—digo do produto pesquisado.
	 * @return uma lista de objetos Pedido contendo os pedidos que apresentam o produto pesquisado.
	 */
	@Override
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codProduto) {
		List <Pedido> pedidosProcurados = new LinkedList<Pedido>();
		for (Pedido p: this.pedidos){
			List<ItemDePedido> itens = p.getItens();
			for (ItemDePedido it: itens){
				if (it.getCodProduto().equals(codProduto)){
					pedidosProcurados.add(p);
				}
			}
		}
		//TODO: ajeitar para verificar itens repetidos
		return pedidosProcurados;
	}

	/**
	 * Remove um certo pedido de acordo com seu nœmero.
	 * @param numeroPedido o nœmero do pedido a ser removido.
	 */
	@Override
	public void removePedido(long numeroPedido) {
		for (Pedido p: this.pedidos){
			if (p.getNumeroPedido()== numeroPedido){
				this.pedidos.remove(p);
				break;
			}
		}

	}

}
