
package pi.projeto.modelo;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Departamento", schema="pi2" )
public class Departamento implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_departamento",                          // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=false,                                    // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private Long id;

     @Column(name="descricao_departamento",                  // NAME - nome da coluna no BD
         length=50,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                    // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private String descricao;
    
      public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.descricao != null ? this.descricao.hashCode() : 0);
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
        final Departamento other = (Departamento) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.descricao == null) ? (other.descricao != null) : !this.descricao.equals(other.descricao)) {
            return false;
        }
        return true;
    }
     
    
        
     @Override
    public String toString() {
        return "ClassesPrincipais.Funcionario[ id=" + id + " ]";
    }    
}

   
