
package pi.projeto.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.FuncionarioDAO;
import pi.projeto.modelo.Funcionario;

@Stateless (mappedName="ejb/Hello")
public class FuncionarioBean implements FuncionarioRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public Funcionario salvar(Funcionario funcionario) throws Exception {
    FuncionarioDAO dao = new FuncionarioDAO(em);
    return dao.salvar(funcionario);
  }

  public void excluir(Long id) {
    FuncionarioDAO dao = new FuncionarioDAO(em);
    dao.excluir(id);
  }

  public Funcionario consultarPorId(Long id) {
    FuncionarioDAO dao = new FuncionarioDAO(em);
    return dao.consultarPorId(id);
  }

   public List<Funcionario> consultarTodos(){
      FuncionarioDAO dao = new FuncionarioDAO(em);
      return dao.retornarTodos(true, -1, -1);
  }
}
