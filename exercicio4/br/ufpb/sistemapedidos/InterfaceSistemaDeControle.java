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
	 * @param codProduto O código do produto que eu quero pesquisar.
	 * @return uma lista com os pedidos que contém o produto pesquisado.
	 */
	public List <Pedido> pesquisaPedidosIncluindoProduto(String codProduto);
	
	/**
	 * Remove um pedido.
	 * @param numeroPedido É o número do pedido a ser removido.
	 */
	public void removePedido(long numeroPedido);
}
