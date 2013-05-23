
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.Cliente;

@Remote

public interface ClienteRemote {
    
  public Cliente salvar (Cliente cliente) throws Exception;
  public void excluir(Long id);
  public Cliente  consultarPorId(Long id);
  
}

