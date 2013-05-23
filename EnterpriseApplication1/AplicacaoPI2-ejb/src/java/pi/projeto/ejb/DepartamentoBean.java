
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.DepartamentoDAO;
import pi.projeto.modelo.Departamento;

@Stateless

public class DepartamentoBean implements DepartamentoRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public Departamento salvar(Departamento departamento) throws Exception {
    DepartamentoDAO dao = new DepartamentoDAO(em);
    return dao.salvar(departamento);
  }

  public void excluir(Long id) {
    DepartamentoDAO dao = new DepartamentoDAO(em);
    dao.excluir(id);
  }

  public Departamento consultarPorId(Long id) {
    DepartamentoDAO dao = new DepartamentoDAO(em);
    return dao.consultarPorId(id);
  }
}
