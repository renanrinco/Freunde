
package pi.projeto.dao;
 
import javax.persistence.EntityManager;
import pi.projeto.modelo.Departamento;

public class DepartamentoDAO {
      private EntityManager entityManager;
      
   public DepartamentoDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
   
   public Departamento salvar (Departamento departamento) throws Exception{
       System.out.println("Salvando Departamento. ID: " + departamento.getId());
   
       if(departamento.getId() == null) {
      this.entityManager.persist(departamento);
    } else {
    
        if(!this.entityManager.contains(departamento)) {
        
            if (consultarPorId(departamento.getId()) == null) {
          throw new Exception("Departamento não existe!");
        }
      }
    
        return entityManager.merge(departamento);
    }

     return departamento;
  }


  public void excluir(Long id) {
   
    Departamento departamento = consultarPorId(id);
    System.out.println("Excluindo o Departamento. ID: " + departamento.getId());
    entityManager.remove(departamento);
  }


  public Departamento consultarPorId(Long id) {
    return entityManager.find(Departamento.class, id);
  }
}
