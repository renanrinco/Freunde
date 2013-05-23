
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.Funcionario;

@javax.ejb.Remote
public interface FuncionarioRemote {
    
  public Funcionario salvar (Funcionario funcionario) throws Exception;
  public void excluir(Long id);
  public Funcionario  consultarPorId(Long id);
  
}
