
package pi.projeto.modelo;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Pedidos", schema="pi2" )
public class Pedido implements Serializable {

        private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_pedido",                                // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=false,                                    // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private Long id;
    
    @Column(name="emailcliente_pedido",                      // NAME - nome da coluna no BD
         length=50,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                    // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private String emailcliente;
    
    @Column(name="descricao_pedido",                         // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                    // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private String descricao;

    @Column(name="datasolicitacao_pedido",                   // NAME - nome da coluna no BD
         length=10,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private String datasolicitacao;

    @Column(name="dataenvio_pedido",                         // NAME - nome da coluna no BD
         length=10,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private String dataenvio;
    
    @Column(name="status_pedido",                            // NAME - nome da coluna no BD
         length=10,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private boolean status;
    
    @Column(name="preco_pedido",                             // NAME - nome da coluna no BD
         length=10,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private double preco;
    
    @Column(name="clientecomprador_pedido",                  // NAME - nome da coluna no BD
         length=50,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private String clientecomprador;
    
     public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmailcliente() {
        return emailcliente;
    }

    public void setEmailcliente(String emailcliente) {
        this.emailcliente = emailcliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDatasolicitacao() {
        return datasolicitacao;
    }

    public void setDatasolicitacao(String datasolicitacao) {
        this.datasolicitacao = datasolicitacao;
    }

    public String getDataenvio() {
        return dataenvio;
    }

    public void setDataenvio(String dataenvio) {
        this.dataenvio = dataenvio;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getClientecomprador() {
        return clientecomprador;
    }

    public void setClientecomprador(String clientecomprador) {
        this.clientecomprador = clientecomprador;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.emailcliente != null ? this.emailcliente.hashCode() : 0);
        hash = 97 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
        hash = 97 * hash + (this.datasolicitacao != null ? this.datasolicitacao.hashCode() : 0);
        hash = 97 * hash + (this.dataenvio != null ? this.dataenvio.hashCode() : 0);
        hash = 97 * hash + (this.status ? 1 : 0);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        hash = 97 * hash + (this.clientecomprador != null ? this.clientecomprador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pedido other = (Pedido) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.emailcliente == null) ? (other.emailcliente != null) : !this.emailcliente.equals(other.emailcliente)) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        if ((this.datasolicitacao == null) ? (other.datasolicitacao != null) : !this.datasolicitacao.equals(other.datasolicitacao)) {
            return false;
        }
        if ((this.dataenvio == null) ? (other.dataenvio != null) : !this.dataenvio.equals(other.dataenvio)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if ((this.clientecomprador == null) ? (other.clientecomprador != null) : !this.clientecomprador.equals(other.clientecomprador)) {
            return false;
        }
        return true;
    }

@Override
    public String toString() {
        return "ClassesPrincipais.Pedido[ id=" + id + " ]";
    }    
   
}
