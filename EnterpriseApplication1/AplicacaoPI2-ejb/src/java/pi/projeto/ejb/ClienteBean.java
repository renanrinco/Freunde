
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.ClienteDAO;
import pi.projeto.modelo.Cliente;

@Stateless

public class ClienteBean implements ClienteRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public Cliente salvar(Cliente cliente) throws Exception {
    ClienteDAO dao = new ClienteDAO(em);
    return dao.salvar(cliente);
  }

  public void excluir(Long id) {
    ClienteDAO dao = new ClienteDAO(em);
    dao.excluir(id);
  }

  public Cliente consultarPorId(Long id) {
    ClienteDAO dao = new ClienteDAO(em);
    return dao.consultarPorId(id);
  }
}
