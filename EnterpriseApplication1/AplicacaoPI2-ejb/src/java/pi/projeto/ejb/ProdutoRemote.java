
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.Produto;

@Remote

public interface ProdutoRemote {
    
  public Produto salvar (Produto produto) throws Exception;
  public void excluir(Long id);
  public Produto consultarPorId(Long id);
  
}
