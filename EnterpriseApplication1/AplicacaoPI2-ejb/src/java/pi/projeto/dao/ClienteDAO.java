
package pi.projeto.dao;
 
import javax.persistence.EntityManager;
import pi.projeto.modelo.Cliente;

public class ClienteDAO {
      private EntityManager entityManager;
      
   public ClienteDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
   
   public Cliente salvar (Cliente cliente) throws Exception{
       System.out.println("Salvando Cliente. ID: " + cliente.getId());
   
       if(cliente.getId() == null) {
      this.entityManager.persist(cliente);
    } else {
    
        if(!this.entityManager.contains(cliente)) {
        
            if (consultarPorId(cliente.getId()) == null) {
          throw new Exception("Cliente não existe!");
        }
      }
    
        return entityManager.merge(cliente);
    }

     return cliente;
  }


  public void excluir(Long id) {
   
    Cliente cliente = consultarPorId(id);
    System.out.println("Excluindo o Cliente. ID: " + cliente.getId());
    entityManager.remove(cliente);
  }


  public Cliente consultarPorId(Long id) {
    return entityManager.find(Cliente.class, id);
  }
}
