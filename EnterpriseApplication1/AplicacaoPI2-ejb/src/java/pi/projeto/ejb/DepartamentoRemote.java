
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.Departamento;

@Remote

public interface DepartamentoRemote {
    
  public Departamento salvar (Departamento departamento) throws Exception;
  public void excluir(Long id);
  public Departamento  consultarPorId(Long id);
  
}
