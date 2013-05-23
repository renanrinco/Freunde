
package pi.projeto.dao;

import javax.persistence.EntityManager;
import pi.projeto.modelo.Cargo;

public class CargoDAO {
      private EntityManager entityManager;
      
   public CargoDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
   
   public Cargo salvar (Cargo cargo) throws Exception{
       System.out.println("Salvando Cargo. ID: " + cargo.getId());
   
       if(cargo.getId() == null) {
      this.entityManager.persist(cargo);
    } else {
    
        if(!this.entityManager.contains(cargo)) {
        
            if (consultarPorId(cargo.getId()) == null) {
          throw new Exception("Cargo não existe!");
        }
      }
    
        return entityManager.merge(cargo);
    }

     return cargo;
  }


  public void excluir(Long id) {
   
    Cargo cargo = consultarPorId(id);
    System.out.println("Excluindo o cargo. ID: " + cargo.getId());
    entityManager.remove(cargo);
  }


  public Cargo consultarPorId(Long id) {
    return entityManager.find(Cargo.class, id);
  }
}