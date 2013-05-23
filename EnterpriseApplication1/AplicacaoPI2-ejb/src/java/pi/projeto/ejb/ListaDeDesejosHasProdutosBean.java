
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.ListaDeDesejosHasProdutosDAO;
import pi.projeto.modelo.ListaDeDesejosHasProdutos;

@Stateless

public class ListaDeDesejosHasProdutosBean implements ListaDeDesejosHasProdutosRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public ListaDeDesejosHasProdutos salvar(ListaDeDesejosHasProdutos listaDeDesejos) throws Exception {
   ListaDeDesejosHasProdutosDAO dao = new ListaDeDesejosHasProdutosDAO(em);
    return dao.salvar(listaDeDesejos);
  }

  public void excluir(Long id) {
   ListaDeDesejosHasProdutosDAO dao = new ListaDeDesejosHasProdutosDAO(em);
    dao.excluir(id);
  }

  public ListaDeDesejosHasProdutos consultarPorId(Long id) {
    ListaDeDesejosHasProdutosDAO dao = new ListaDeDesejosHasProdutosDAO(em);
    return dao.consultarPorId(id);
  }
}
