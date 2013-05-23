
package pi.projeto.dao;
 
import javax.persistence.EntityManager;
import pi.projeto.modelo.Entrega;

public class EntregaDAO {
      private EntityManager entityManager;
      
   public EntregaDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
     
   public Entrega salvar (Entrega entrega) throws Exception{
       System.out.println("Salvando Entrega. ID: " + entrega.getId());
   
       if(entrega.getId() == null) {
      this.entityManager.persist(entrega);
    } else {
    
        if(!this.entityManager.contains(entrega)) {
        
            if (consultarPorId(entrega.getId()) == null) {
          throw new Exception("Entrega não existe!");
        }
      }
    
        return entityManager.merge(entrega);
    }

     return entrega;
  }


  public void excluir(Long id) {
   
    Entrega entrega = consultarPorId(id);
    System.out.println("Excluindo a Entrega. ID: " + entrega.getId());
    entityManager.remove(entrega);
  }


  public Entrega consultarPorId(Long id) {
    return entityManager.find(Entrega.class, id);
  }
}
