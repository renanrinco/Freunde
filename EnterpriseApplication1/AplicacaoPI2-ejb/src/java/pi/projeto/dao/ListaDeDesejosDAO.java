
package pi.projeto.dao;
 
import javax.persistence.EntityManager;
import pi.projeto.modelo.ListaDeDesejos;

public class ListaDeDesejosDAO {
      private EntityManager entityManager;
      
   public ListaDeDesejosDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
     
   public ListaDeDesejos salvar (ListaDeDesejos listaDeDesejos) throws Exception{
       System.out.println("Salvando Lista De Desejos. ID: " + listaDeDesejos.getId());
   
       if(listaDeDesejos.getId() == null) {
      this.entityManager.persist(listaDeDesejos);
    } else {
    
        if(!this.entityManager.contains(listaDeDesejos)) {
        
            if (consultarPorId(listaDeDesejos.getId()) == null) {
          throw new Exception("Lista De Desejos não existe!");
        }
      }
    
        return entityManager.merge(listaDeDesejos);
    }

     return listaDeDesejos;
  }


  public void excluir(Long id) {
   
    ListaDeDesejos listaDeDesejos = consultarPorId(id);
    System.out.println("Excluindo Lista De Desejos. ID: " + listaDeDesejos.getId());
    entityManager.remove(listaDeDesejos);
  }


  public ListaDeDesejos consultarPorId(Long id) {
    return entityManager.find(ListaDeDesejos.class, id);
  }
}
