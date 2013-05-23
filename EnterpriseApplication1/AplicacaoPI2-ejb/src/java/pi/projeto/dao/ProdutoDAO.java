
package pi.projeto.dao;
 
import javax.persistence.EntityManager;
import pi.projeto.modelo.Produto;

public class ProdutoDAO {
      private EntityManager entityManager;
      
   public ProdutoDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
     
   public Produto salvar (Produto produto) throws Exception{
       System.out.println("Salvando Produto. ID: " + produto.getId());
   
       if(produto.getId() == null) {
      this.entityManager.persist(produto);
    } else {
    
        if(!this.entityManager.contains(produto)) {
        
            if (consultarPorId(produto.getId()) == null) {
          throw new Exception("Produto não existe!");
        }
      }
    
        return entityManager.merge(produto);
    }

     return produto;
  }


  public void excluir(Long id) {
   
    Produto produto = consultarPorId(id);
    System.out.println("Excluindo Produto. ID: " +produto.getId ());
    entityManager.remove(produto);
  }


  public Produto consultarPorId(Long id) {
    return entityManager.find(Produto.class, id);
  }
}
