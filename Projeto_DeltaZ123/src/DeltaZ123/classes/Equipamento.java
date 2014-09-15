
package DeltaZ123.classes;

public class Equipamento {
    
    //atributos
    private String	codEquipamento;
    private String	codPatrimonial;
    private String	tipo;
    private String	acessorio;
    private String	uso;
    private String	tipoRede;
    
    //construtores    
    public Equipamento(String codEquipamento, String codPatrimonial, String tipo, 
                       String acessorio, String uso, String tipoRede){
	super();
	this.codEquipamento = codEquipamento;
	this.codPatrimonial = codPatrimonial;
	this.tipo = tipo;
	this.acessorio = acessorio;
	this.uso = uso;
	this.tipoRede = tipoRede;
	}
    
    //getters e setters
    public String getCodEquipamento() {
	return codEquipamento;
    }
    public void setCodEquipamento(String codEquipamento) {
	this.codEquipamento = codEquipamento;
    }
    public String getCodPatrimonial() {
	return codPatrimonial;
    }
    public void setCodPatrimonial(String codPatrimonial) {
	this.codPatrimonial = codPatrimonial;
    }
    public String getTipo() {
    	return tipo;
    }
    public void setTipo(String tipo) {
    	this.tipo = tipo;
    }
    public String getAcessorio() {
    	return acessorio;
    }
    public void setAcessorio(String acessorio) {
	this.acessorio = acessorio;
    }
    public String getuso() {
	return uso;
    }
    public void setTipoUso(String uso) {
	this.uso = uso;
    }
    public String getTipoRede() {
        return tipoRede;
    }
    public void setTipoRede(String tipoRede) {
	this.tipoRede = tipoRede;
    }

}
