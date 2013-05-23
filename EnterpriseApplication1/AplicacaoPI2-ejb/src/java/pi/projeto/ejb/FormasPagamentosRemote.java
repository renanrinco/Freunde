
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.FormasPagamentos;

@Remote

public interface FormasPagamentosRemote {
    
  public FormasPagamentos salvar (FormasPagamentos formasPagamentos) throws Exception;
  public void excluir(Long id);
  public FormasPagamentos  consultarPorId(Long id);
  
}
