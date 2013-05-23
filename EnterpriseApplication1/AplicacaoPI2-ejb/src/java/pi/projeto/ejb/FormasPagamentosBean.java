
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.FormasPagamentosDAO;
import pi.projeto.modelo.FormasPagamentos;

@Stateless

public class FormasPagamentosBean implements FormasPagamentosRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public FormasPagamentos salvar(FormasPagamentos formasPagamentos) throws Exception {
    FormasPagamentosDAO dao = new FormasPagamentosDAO(em);
    return dao.salvar(formasPagamentos);
  }

  public void excluir(Long id) {
    FormasPagamentosDAO dao = new FormasPagamentosDAO(em);
    dao.excluir(id);
  }

  public FormasPagamentos consultarPorId(Long id) {
    FormasPagamentosDAO dao = new FormasPagamentosDAO(em);
    return dao.consultarPorId(id);
  }
}
