
package pi.projeto.modelo;



import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Entrega", schema="pi2" )
public class Entrega implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_entrega",                               // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=false,                                    // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private Long id;
    
     @Column(name="idPedido_entrega",                        // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private Integer idPedido;
     
     @Column(name="dataenvio_entrega",                       // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private String dataenvio;
     
     @Column(name="confirmacao_entrega",                     // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private boolean confirmacao;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getDataenvio() {
        return dataenvio;
    }

    public void setDataenvio(String dataenvio) {
        this.dataenvio = dataenvio;
    }

    public boolean isConfirmacao() {
        return confirmacao;
    }

    public void setConfirmacao(boolean confirmacao) {
        this.confirmacao = confirmacao;
    }     

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 23 * hash + (this.idPedido != null ? this.idPedido.hashCode() : 0);
        hash = 23 * hash + (this.dataenvio != null ? this.dataenvio.hashCode() : 0);
        hash = 23 * hash + (this.confirmacao ? 1 : 0);
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
        final Entrega other = (Entrega) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (this.idPedido != other.idPedido && (this.idPedido == null || !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        if ((this.dataenvio == null) ? (other.dataenvio != null) : !this.dataenvio.equals(other.dataenvio)) {
            return false;
        }
        if (this.confirmacao != other.confirmacao) {
            return false;
        }
        return true;
    }

    
@Override
    public String toString() {
        return "ClassesPrincipais.Funcionario[ id=" + id + " ]";
    }    
}