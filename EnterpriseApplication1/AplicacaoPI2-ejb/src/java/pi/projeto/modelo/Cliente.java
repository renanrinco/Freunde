/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.projeto.modelo;



import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;




@Entity
@Table(name="Cliente", schema="pi2" )
public class Cliente implements Serializable {
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="codigo_cliente",                           // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=false,                                    // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private Long id;
   
    @Column(name="email_cliente",                            // NAME - nome da coluna no BD
         length=30,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String email;
    
    @Column(name="nome_cliente",                     // NAME - nome da coluna no BD
         length=20,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String nome;
        
    @Column(name="telefone_cliente",                     // NAME - nome da coluna no BD
         length=14,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String telefone;

    @Column(name="celular_cliente",                      // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String celular;
           
    @Column(name="senha_cliente",                        // NAME - nome da coluna no BD
         length=16,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String senha;
    
    @Column(name="sexo_cliente",                     // NAME - nome da coluna no BD
         length=9,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String sexo;
    
    @Column(name="datanasc_cliente",                     // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String datanasc;
    
    @Column(name="cep_cliente",                     // NAME - nome da coluna no BD
         length=9,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String cep;
    
    @Column(name="endereco_cliente",                     // NAME - nome da coluna no BD
         length=25,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String endereco;
    
    @Column(name="complemento_cliente",                     // NAME - nome da coluna no BD
         length=50,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String complemento;
    
    @Column(name="cidade_cliente",                       // NAME - nome da coluna no BD
         length=16,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String cidade;
    
    @Column(name="estado_cliente",                       // NAME - nome da coluna no BD
         length=16,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String estado;
    
    @Column(name="bairro_cliente",                     // NAME - nome da coluna no BD
         length=50,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String bairro;
     
     @Column(name="cep2_cliente",                     // NAME - nome da coluna no BD
         length=9,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String cep2;     
         
   @Column(name="endereco2_cliente",                     // NAME - nome da coluna no BD
         length=100,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String endereco2;
     
   @Column(name="complemento2_cliente",                     // NAME - nome da coluna no BD
         length=14,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String complemento2;

   @Column(name="cidade2_cliente",                     // NAME - nome da coluna no BD
         length=50,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String cidade2; 
   
  @Column(name="estado2_cliente",                     // NAME - nome da coluna no BD
         length=50,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String estado2;
   
    @Column(name="bairro2_cliente",                     // NAME - nome da coluna no BD
         length=50,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String bairro2;

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep2() {
        return cep2;
    }

    public void setCep2(String cep2) {
        this.cep2 = cep2;
    }

    public String getEndereco2() {
        return endereco2;
    }

    public void setEndereco2(String endereco2) {
        this.endereco2 = endereco2;
    }

    public String getComplemento2() {
        return complemento2;
    }

    public void setComplemento2(String complemento2) {
        this.complemento2 = complemento2;
    }

    public String getCidade2() {
        return cidade2;
    }

    public void setCidade2(String cidade2) {
        this.cidade2 = cidade2;
    }

    public String getEstado2() {
        return estado2;
    }

    public void setEstado2(String estado2) {
        this.estado2 = estado2;
    }

    public String getBairro2() {
        return bairro2;
    }

    public void setBairro2(String bairro2) {
        this.bairro2 = bairro2;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 17 * hash + (this.email != null ? this.email.hashCode() : 0);
        hash = 17 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 17 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 17 * hash + (this.celular != null ? this.celular.hashCode() : 0);
        hash = 17 * hash + (this.senha != null ? this.senha.hashCode() : 0);
        hash = 17 * hash + (this.sexo != null ? this.sexo.hashCode() : 0);
        hash = 17 * hash + (this.datanasc != null ? this.datanasc.hashCode() : 0);
        hash = 17 * hash + (this.cep != null ? this.cep.hashCode() : 0);
        hash = 17 * hash + (this.endereco != null ? this.endereco.hashCode() : 0);
        hash = 17 * hash + (this.complemento != null ? this.complemento.hashCode() : 0);
        hash = 17 * hash + (this.cidade != null ? this.cidade.hashCode() : 0);
        hash = 17 * hash + (this.estado != null ? this.estado.hashCode() : 0);
        hash = 17 * hash + (this.bairro != null ? this.bairro.hashCode() : 0);
        hash = 17 * hash + (this.cep2 != null ? this.cep2.hashCode() : 0);
        hash = 17 * hash + (this.endereco2 != null ? this.endereco2.hashCode() : 0);
        hash = 17 * hash + (this.complemento2 != null ? this.complemento2.hashCode() : 0);
        hash = 17 * hash + (this.cidade2 != null ? this.cidade2.hashCode() : 0);
        hash = 17 * hash + (this.estado2 != null ? this.estado2.hashCode() : 0);
        hash = 17 * hash + (this.bairro2 != null ? this.bairro2.hashCode() : 0);
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
        final Cliente other = (Cliente) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.email == null) ? (other.email != null) : !this.email.equals(other.email)) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.telefone == null) ? (other.telefone != null) : !this.telefone.equals(other.telefone)) {
            return false;
        }
        if ((this.celular == null) ? (other.celular != null) : !this.celular.equals(other.celular)) {
            return false;
        }
        if ((this.senha == null) ? (other.senha != null) : !this.senha.equals(other.senha)) {
            return false;
        }
        if ((this.sexo == null) ? (other.sexo != null) : !this.sexo.equals(other.sexo)) {
            return false;
        }
        if ((this.datanasc == null) ? (other.datanasc != null) : !this.datanasc.equals(other.datanasc)) {
            return false;
        }
        if ((this.cep == null) ? (other.cep != null) : !this.cep.equals(other.cep)) {
            return false;
        }
        if ((this.endereco == null) ? (other.endereco != null) : !this.endereco.equals(other.endereco)) {
            return false;
        }
        if ((this.complemento == null) ? (other.complemento != null) : !this.complemento.equals(other.complemento)) {
            return false;
        }
        if ((this.cidade == null) ? (other.cidade != null) : !this.cidade.equals(other.cidade)) {
            return false;
        }
        if ((this.estado == null) ? (other.estado != null) : !this.estado.equals(other.estado)) {
            return false;
        }
        if ((this.bairro == null) ? (other.bairro != null) : !this.bairro.equals(other.bairro)) {
            return false;
        }
        if ((this.cep2 == null) ? (other.cep2 != null) : !this.cep2.equals(other.cep2)) {
            return false;
        }
        if ((this.endereco2 == null) ? (other.endereco2 != null) : !this.endereco2.equals(other.endereco2)) {
            return false;
        }
        if ((this.complemento2 == null) ? (other.complemento2 != null) : !this.complemento2.equals(other.complemento2)) {
            return false;
        }
        if ((this.cidade2 == null) ? (other.cidade2 != null) : !this.cidade2.equals(other.cidade2)) {
            return false;
        }
        if ((this.estado2 == null) ? (other.estado2 != null) : !this.estado2.equals(other.estado2)) {
            return false;
        }
        if ((this.bairro2 == null) ? (other.bairro2 != null) : !this.bairro2.equals(other.bairro2)) {
            return false;
        }
        return true;
    }
    
   
    @Override
    public String toString() {
        return "ClassesPrincipais.Cliente[ id=" + id + " ]";
    }
    
}

