package br.ufpb.sistemapedidos;
import java.util.List;

/**
 * Interface que representa os servicos de um sistema de
 * controle de pedidos.
 * @author ayla
 *
 */
public interface InterfaceSistemaDeControle {
	
	/**
	 * Cadastra um pedido no sistema
	 * @param p Pedido a ser adicionado.
	 */
	public void adicionaPedido(Pedido p);
	
	/**
	 * Pesquisa a lista de pedidos que apresentam um certo produto.
	 * @param codProduto O c�digo do produto que eu quero pesquisar.
	 * @return uma lista com os pedidos que cont�m o produto pesquisado.
	 */
	public List <Pedido> pesquisaPedidosIncluindoProduto(String codProduto);
	
	/**
	 * Remove um pedido.
	 * @param numeroPedido � o n�mero do pedido a ser removido.
	 */
	public void removePedido(long numeroPedido);
}
