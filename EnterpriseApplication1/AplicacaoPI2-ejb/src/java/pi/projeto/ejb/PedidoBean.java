
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.PedidoDAO;
import pi.projeto.modelo.Pedido;

@Stateless

public class PedidoBean implements PedidoRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public Pedido salvar(Pedido pedido) throws Exception {
   PedidoDAO dao = new PedidoDAO(em);
    return dao.salvar(pedido);
  }

  public void excluir(Long id) {
  PedidoDAO dao = new PedidoDAO(em);
    dao.excluir(id);
  }

  public Pedido consultarPorId(Long id) {
    PedidoDAO dao = new PedidoDAO(em);
    return dao.consultarPorId(id);
  }
}
