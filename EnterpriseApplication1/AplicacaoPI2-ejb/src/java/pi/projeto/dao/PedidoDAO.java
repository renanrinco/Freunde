
package pi.projeto.dao;
 
import javax.persistence.EntityManager;
import pi.projeto.modelo.Pedido;

public class PedidoDAO {
      private EntityManager entityManager;
      
   public PedidoDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
     
   public Pedido salvar (Pedido pedido) throws Exception{
       System.out.println("Salvando Pedido. ID: " + pedido.getId());
   
       if(pedido.getId() == null) {
      this.entityManager.persist(pedido);
    } else {
    
        if(!this.entityManager.contains(pedido)) {
        
            if (consultarPorId(pedido.getId()) == null) {
          throw new Exception("Pedido não existe!");
        }
      }
    
        return entityManager.merge(pedido);
    }

     return pedido;
  }


  public void excluir(Long id) {
   
    Pedido pedido = consultarPorId(id);
    System.out.println("Excluindo Pedido. ID: " + pedido.getId());
    entityManager.remove(pedido);
  }


  public Pedido consultarPorId(Long id) {
    return entityManager.find(Pedido.class, id);
  }
}
