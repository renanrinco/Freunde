
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.CargoDAO;
import pi.projeto.modelo.Cargo;

@Stateless

public class CargoBean implements CargoRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public Cargo salvar(Cargo cargo) throws Exception {
    CargoDAO dao = new CargoDAO(em);
    return dao.salvar(cargo);
  }

  public void excluir(Long id) {
    CargoDAO dao = new CargoDAO(em);
    dao.excluir(id);
  }

  public Cargo consultarPorId(Long id) {
    CargoDAO dao = new CargoDAO(em);
    return dao.consultarPorId(id);
  }
}
