
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.EntregaDAO;
import pi.projeto.modelo.Entrega;

@Stateless

public class EntregaBean implements EntregaRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public Entrega salvar(Entrega entrega) throws Exception {
    EntregaDAO dao = new EntregaDAO(em);
    return dao.salvar(entrega);
  }

  public void excluir(Long id) {
    EntregaDAO dao = new EntregaDAO(em);
    dao.excluir(id);
  }

  public Entrega consultarPorId(Long id) {
    EntregaDAO dao = new EntregaDAO(em);
    return dao.consultarPorId(id);
  }
}
