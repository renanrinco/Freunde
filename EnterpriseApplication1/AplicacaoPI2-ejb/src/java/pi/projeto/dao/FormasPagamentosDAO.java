
package pi.projeto.dao;
 
import javax.persistence.EntityManager;
import pi.projeto.modelo.FormasPagamentos;

public class FormasPagamentosDAO {
      private EntityManager entityManager;
      
   public FormasPagamentosDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
     
   public FormasPagamentos salvar (FormasPagamentos formasPagamentos) throws Exception{
       System.out.println("Salvando Forma de Pagamento. ID: " + formasPagamentos.getId());
   
       if(formasPagamentos.getId() == null) {
      this.entityManager.persist(formasPagamentos);
    } else {
    
        if(!this.entityManager.contains(formasPagamentos)) {
        
            if (consultarPorId(formasPagamentos.getId()) == null) {
          throw new Exception("Forma de Pagamento não existe!");
        }
      }
    
        return entityManager.merge(formasPagamentos);
    }

     return formasPagamentos;
  }


  public void excluir(Long id) {
   
    FormasPagamentos formasPagamentos = consultarPorId(id);
    System.out.println("Excluindo a Forma Pagamento. ID: " + formasPagamentos.getId());
    entityManager.remove(formasPagamentos);
  }


  public FormasPagamentos consultarPorId(Long id) {
    return entityManager.find(FormasPagamentos.class, id);
  }
}
