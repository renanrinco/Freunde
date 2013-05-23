
package pi.projeto.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import pi.projeto.dao.ProdutoDAO;
import pi.projeto.modelo.Produto;

@Stateless

public class ProdutoBean implements ProdutoRemote{
    
@PersistenceContext(unitName = "AplicacaoPI2-ejbPU")
  private EntityManager em;

  public Produto salvar(Produto produto) throws Exception {
   ProdutoDAO dao = new ProdutoDAO(em);
    return dao.salvar(produto);
  }

  public void excluir(Long id) {
  ProdutoDAO dao = new ProdutoDAO(em);
    dao.excluir(id);
  }

  public Produto consultarPorId(Long id) {
    ProdutoDAO dao = new ProdutoDAO(em);
    return dao.consultarPorId(id);
  }
}
