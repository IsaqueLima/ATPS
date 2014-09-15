
package DeltaZ123.classes;

public class Departamento {
    
    //atributos
    private int codDepartamento;
    private String descricao;
    
    //construtores
    public Departamento(){  
    }
    public Departamento(int codDepartamento, String descricao){
        this.codDepartamento = codDepartamento;
        this.descricao = descricao;
    }
    
    //getters e setters
    public int getcodDepartamento() {
        return codDepartamento;
    }
    public void setCodDepartamento(int codDepartamento) {
        this.codDepartamento = codDepartamento;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
