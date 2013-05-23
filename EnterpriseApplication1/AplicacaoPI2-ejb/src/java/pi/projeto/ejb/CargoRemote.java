
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.Cargo;

@Remote

public interface CargoRemote {
    
  public Cargo salvar (Cargo cargo) throws Exception;
  public void excluir(Long id);
  public Cargo  consultarPorId(Long id);
  
}

