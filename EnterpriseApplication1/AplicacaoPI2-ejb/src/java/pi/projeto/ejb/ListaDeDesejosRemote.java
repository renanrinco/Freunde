
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.ListaDeDesejos;

@Remote

public interface ListaDeDesejosRemote {
    
  public ListaDeDesejos salvar (ListaDeDesejos listaDeDesejos) throws Exception;
  public void excluir(Long id);
  public ListaDeDesejos consultarPorId(Long id);
  
}
