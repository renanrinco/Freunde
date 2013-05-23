// ADICIONAR DEPARTAMENTO!!!!
package pi.projeto.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Funcionarios", schema="pi2" )
public class Funcionario implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id_funcionario",                           // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=false,                                    // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL 
    private Long id;
    
    @Column(name="nome_funcionario",                        // NAME - nome da coluna no BD
         length=20,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String nome;

    
    @Column(name="cargo_funcionario",                        // NAME - nome da coluna no BD
         length=20,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String cargo;
    
    @Column(name="telefone_funcionario",                     // NAME - nome da coluna no BD
         length=14,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String telefone;

    @Column(name="celular_funcionario",                      // NAME - nome da coluna no BD
         length=15,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=true,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String celular;
    
    @Column(name="usuario_funcionario",                      // NAME - nome da coluna no BD
         length=16,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String usuario;
    
    @Column(name="senha_funcionario",                        // NAME - nome da coluna no BD
         length=16,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String senha;
    
    @Column(name="cidade_funcionario",                       // NAME - nome da coluna no BD
         length=16,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String cidade;
    
    @Column(name="estado_funcionario",                       // NAME - nome da coluna no BD
         length=16,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String estado;
    
    @Column(name="RG_funcionario",                           // NAME - nome da coluna no BD
         length=25,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String RG;
    
    @Column(name="CPF_funcionario",                          // NAME - nome da coluna no BD
         length=25,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String CPF;
    
    @Column(name="ctrabalho_funcionario",                    // NAME - nome da coluna no BD
         length=25,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String ctrabalho;
        
    @Column(name="endereco_funcionario",                     // NAME - nome da coluna no BD
         length=25,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL       
    private String endereco;
    
    @Column(name="datanasc_funcionario",                     // NAME - nome da coluna no BD
         length=25,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String datanasc;
   
     @Column(name="departamento_funcionario",                // NAME - nome da coluna no BD
         length=25,                                          // LENGTH - define o tamanho do campo, usado apenas para campos de string
         nullable=false,                                     // NULLABLE - define se o campo aceita nulo   
         updatable=true,                                     // UPDATABLE - define se a coluna pode ser atualizada via update. Se false, a coluna não entra na clausula update do SQL
         insertable=true)                                    // INSERTABLE - Se false, a coluna não entra na clausula insert do SQL
    private String departamento;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getCtrabalho() {
        return ctrabalho;
    }

    public void setCtrabalho(String ctrabalho) {
        this.ctrabalho = ctrabalho;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 83 * hash + (this.nome != null ? this.nome.hashCode() : 0);
        hash = 83 * hash + (this.cargo != null ? this.cargo.hashCode() : 0);
        hash = 83 * hash + (this.telefone != null ? this.telefone.hashCode() : 0);
        hash = 83 * hash + (this.celular != null ? this.celular.hashCode() : 0);
        hash = 83 * hash + (this.usuario != null ? this.usuario.hashCode() : 0);
        hash = 83 * hash + (this.senha != null ? this.senha.hashCode() : 0);
        hash = 83 * hash + (this.cidade != null ? this.cidade.hashCode() : 0);
        hash = 83 * hash + (this.estado != null ? this.estado.hashCode() : 0);
        hash = 83 * hash + (this.RG != null ? this.RG.hashCode() : 0);
        hash = 83 * hash + (this.CPF != null ? this.CPF.hashCode() : 0);
        hash = 83 * hash + (this.ctrabalho != null ? this.ctrabalho.hashCode() : 0);
        hash = 83 * hash + (this.endereco != null ? this.endereco.hashCode() : 0);
        hash = 83 * hash + (this.datanasc != null ? this.datanasc.hashCode() : 0);
        hash = 83 * hash + (this.departamento != null ? this.departamento.hashCode() : 0);
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
        final Funcionario other = (Funcionario) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if ((this.nome == null) ? (other.nome != null) : !this.nome.equals(other.nome)) {
            return false;
        }
        if ((this.cargo == null) ? (other.cargo != null) : !this.cargo.equals(other.cargo)) {
            return false;
        }
        if ((this.telefone == null) ? (other.telefone != null) : !this.telefone.equals(other.telefone)) {
            return false;
        }
        if ((this.celular == null) ? (other.celular != null) : !this.celular.equals(other.celular)) {
            return false;
        }
        if ((this.usuario == null) ? (other.usuario != null) : !this.usuario.equals(other.usuario)) {
            return false;
        }
        if ((this.senha == null) ? (other.senha != null) : !this.senha.equals(other.senha)) {
            return false;
        }
        if ((this.cidade == null) ? (other.cidade != null) : !this.cidade.equals(other.cidade)) {
            return false;
        }
        if ((this.estado == null) ? (other.estado != null) : !this.estado.equals(other.estado)) {
            return false;
        }
        if ((this.RG == null) ? (other.RG != null) : !this.RG.equals(other.RG)) {
            return false;
        }
        if ((this.CPF == null) ? (other.CPF != null) : !this.CPF.equals(other.CPF)) {
            return false;
        }
        if ((this.ctrabalho == null) ? (other.ctrabalho != null) : !this.ctrabalho.equals(other.ctrabalho)) {
            return false;
        }
        if ((this.endereco == null) ? (other.endereco != null) : !this.endereco.equals(other.endereco)) {
            return false;
        }
        if ((this.datanasc == null) ? (other.datanasc != null) : !this.datanasc.equals(other.datanasc)) {
            return false;
        }
        if ((this.departamento == null) ? (other.departamento != null) : !this.departamento.equals(other.departamento)) {
            return false;
        }
        return true;
    }
    
    
    
    
@Override
    public String toString() {
        return "ClassesPrincipais.Funcionario[ id=" + id + " ]";
    }    

    
}
