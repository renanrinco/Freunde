
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.ListaDeDesejosHasProdutos;

@Remote

public interface ListaDeDesejosHasProdutosRemote {
    
  public ListaDeDesejosHasProdutos salvar (ListaDeDesejosHasProdutos listaDeDesejos) throws Exception;
  public void excluir(Long id);
  public ListaDeDesejosHasProdutos consultarPorId(Long id);
  
}
