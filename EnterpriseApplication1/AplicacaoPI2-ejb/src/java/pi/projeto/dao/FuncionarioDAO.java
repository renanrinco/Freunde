
package pi.projeto.dao;
 
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import pi.projeto.modelo.Funcionario;

public class FuncionarioDAO {
      private EntityManager entityManager;
      
   public FuncionarioDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
     
   public Funcionario salvar (Funcionario funcionario) throws Exception{
       System.out.println("Salvando Funcionario. ID: " + funcionario.getId());
   
       if(funcionario.getId() == null) {
      this.entityManager.persist(funcionario);
    } else {
    
        if(!this.entityManager.contains(funcionario)) {
        
            if (consultarPorId(funcionario.getId()) == null) {
          throw new Exception("Funcionario não existe!");
        }
      }
    
        return entityManager.merge(funcionario);
    }

     return funcionario;
  }


  public void excluir(Long id) {
   
    Funcionario funcionario = consultarPorId(id);
    System.out.println("Excluindo Funcionario. ID: " + funcionario.getId());
    entityManager.remove(funcionario);
  }


  public Funcionario consultarPorId(Long id) {
    return entityManager.find(Funcionario.class, id);
  }
  
   public List<Funcionario> retornarTodos(boolean all, int maxResults, int firstResult) {
        EntityManager em = entityManager;
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Funcionario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }
}
