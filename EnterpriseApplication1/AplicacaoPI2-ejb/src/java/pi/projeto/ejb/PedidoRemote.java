
package pi.projeto.ejb;

import javax.ejb.Remote;
import pi.projeto.modelo.Pedido;

@Remote

public interface PedidoRemote {
    
  public Pedido salvar (Pedido pedido) throws Exception;
  public void excluir(Long id);
  public Pedido consultarPorId(Long id);
  
}
