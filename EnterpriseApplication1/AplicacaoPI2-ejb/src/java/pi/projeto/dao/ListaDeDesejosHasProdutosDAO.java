
package pi.projeto.dao;
 
import javax.persistence.EntityManager;
import pi.projeto.modelo.ListaDeDesejosHasProdutos;

public class ListaDeDesejosHasProdutosDAO {
      private EntityManager entityManager;
      
   public ListaDeDesejosHasProdutosDAO (EntityManager entityManager) {
      this.entityManager = entityManager;
 
   }
     
   public ListaDeDesejosHasProdutos salvar (ListaDeDesejosHasProdutos listaDeDesejosHasProdutos) throws Exception{
       System.out.println("Salvando Lista De Desejos Has Pordutos. ID: " + listaDeDesejosHasProdutos.getIdlista());
       
   
       if(listaDeDesejosHasProdutos.getIdlista() == null) {
      this.entityManager.persist(listaDeDesejosHasProdutos);
    } else {
    
        if(!this.entityManager.contains(listaDeDesejosHasProdutos)) {
        
            if (consultarPorId(listaDeDesejosHasProdutos.getIdlista()) == null) {
          throw new Exception("Lista De Desejos Has Produtos não existe!");
        }
      }
    
        return entityManager.merge(listaDeDesejosHasProdutos);
    }

     return listaDeDesejosHasProdutos;
  }


  public void excluir(Long id) {
   
    ListaDeDesejosHasProdutos listaDeDesejosHasProdutos = consultarPorId(id);
    System.out.println("Excluindo Lista De Desejos Has Produtos. ID: " + listaDeDesejosHasProdutos.getIdlista());
    entityManager.remove(listaDeDesejosHasProdutos);
  }


  public ListaDeDesejosHasProdutos consultarPorId(Long id) {
    return entityManager.find(ListaDeDesejosHasProdutos.class, id);
  }
}
