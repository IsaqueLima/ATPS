
package DeltaZ123.classes;

public class Cadastro{
    
    //atributos
    private Equipamento equipamento;
    private Software software;

    //construtor
    
    public Cadastro(Equipamento equipamento, Software software){
        super();
        this.software = software;
        this.equipamento = equipamento;
    }

    //metodos
    public void Busca(){
    }
    public void Exclusao(){
    }
    public void Atualizacao(){
    }
    public void Inserir(){
    }

    //getters e setters
    public Equipamento getEquipamento(){
        return equipamento;
    }
    public void setEquipamento(Equipamento equipamento){
        this.equipamento = equipamento;
    }
    public Software getSoftware(){
        return software;
    }
    public void setSoftware(Software software){
        this.software = software;
    }

}
