
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.Entrega;

@Remote

public interface EntregaRemote {
    
  public Entrega salvar (Entrega entrega) throws Exception;
  public void excluir(Long id);
  public Entrega  consultarPorId(Long id);
  
}
