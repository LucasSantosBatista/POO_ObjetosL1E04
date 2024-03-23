/**
 * 
 */
package view;

import javax.swing.JOptionPane;

import model.ProdutoObj;

/**
 * @author Lucas Batista 23 de mar. de 2024
 */
public class Main {

	public static void main(String[] args) {
		ProdutoObj Carimbos = new ProdutoObj(null, 0, 0);
		Carimbos.setNome("Carimbos");
		Carimbos.setPreco(10f);
		Carimbos.setQtdEstoque(50);

		Object[] options = { "Verificar disponibilidade", "Calcular valor do estoque", "Encerra" };
		int opcao;

		do {
			opcao = JOptionPane.showOptionDialog(null, "Escolha o que deseja fazer:", "Sistema Funcionário",
					JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

			switch (opcao) {
			case 0:
				String nome = JOptionPane.showInputDialog("Digite o produto que deseja verificar: ");

				boolean disponibilidade = Carimbos.verificaProdutoDisponivel(nome);
				if (disponibilidade == true) {
					JOptionPane.showMessageDialog(null, nome + " está disponível!");
				} else {
					JOptionPane.showMessageDialog(null, nome + " não está disponível!");
				}
				break;
			case 1:
				float totalValorEstoque = Carimbos.totalValorEstoque();
				System.out.println(Carimbos.getNome() + " | Estoque: " + Carimbos.getQtdEstoque() + " | Preço: R$" + Carimbos.getPreco() + " | Valor total do Estoque: R$" + totalValorEstoque);
				break;

			default:
				JOptionPane.showMessageDialog(null, "Encerrando o programa.");
				break;
			}
		} while (opcao != 2);
	}

}
