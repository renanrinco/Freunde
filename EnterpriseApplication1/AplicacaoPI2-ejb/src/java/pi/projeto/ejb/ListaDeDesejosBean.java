
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.ListaDeDesejosDAO;
import pi.projeto.modelo.ListaDeDesejos;

@Stateless

public class ListaDeDesejosBean implements ListaDeDesejosRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public ListaDeDesejos salvar(ListaDeDesejos listaDeDesejos) throws Exception {
   ListaDeDesejosDAO dao = new ListaDeDesejosDAO(em);
    return dao.salvar(listaDeDesejos);
  }

  public void excluir(Long id) {
   ListaDeDesejosDAO dao = new ListaDeDesejosDAO(em);
    dao.excluir(id);
  }

  public ListaDeDesejos consultarPorId(Long id) {
    ListaDeDesejosDAO dao = new ListaDeDesejosDAO(em);
    return dao.consultarPorId(id);
  }
}
