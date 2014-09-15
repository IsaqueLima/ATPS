
package DeltaZ123.classes;

import java.util.Date;

public class Software {
    
    //atributos    
    private int codSequencial;
    private String nomeSoftware ;
    private String fabricante ;
    private String versao;
    private String notaFiscal ;
    private Date dataNota ;
    private String chaveLicenca;
    private Date dataExpiracao;
    private String classificacao;
    
    //construtores
    public Software(int codSequencial, String nomeSoftware, String fabricante, 
                    String versao, String notaFiscal, Date dataNota, 
                    String chaveLicenca, Date dataExpiracao, String classificacao){
        super();
        this.codSequencial = codSequencial;
        this.nomeSoftware = nomeSoftware;
        this.fabricante = fabricante;
        this.versao = versao;
        this.notaFiscal = notaFiscal;
        this.dataNota = dataNota;
        this.chaveLicenca = chaveLicenca;
        this.dataExpiracao = dataExpiracao;
        this.classificacao = classificacao;
    }
    
    //getters & setters
    public int getCodSequencial() {
        return codSequencial;
    }
    public void setCodSequenciale(int codSequencial) {
        this.codSequencial = codSequencial;
    }		
    public String getNomSoftware() {
        return nomeSoftware;
    }
    public void setNomSoftware(String nomSoftware) {
        this.nomeSoftware = nomSoftware;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getVersao() {
        return versao;
    }
    public void setVersao(String versao) {
        this.versao = versao;
    }
    public String getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
    public Date getDataNota() {
        return dataNota;
    }
    public void setDataNota(Date dataNota) {
        this.dataNota = dataNota;
    }
    public String getChaveLicenca() {
        return chaveLicenca;
    }
    public void setChaveLicenca(String chaveLicenca) {
        this.chaveLicenca = chaveLicenca;
    }
    public Date getDataExpiracao() {
        return dataExpiracao;
    }
    public void setDataExpiracao(Date dataExpiracao) {
        this.dataExpiracao = dataExpiracao;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
    //metodos
    public void BackUp(){	
    }   
    
    public boolean VerificaValidade(){  		      
        boolean validacao;  
        Date data = new Date(System.currentTimeMillis()); //Data atual
            if (data.before(this.getDataExpiracao())){  
                validacao = true;  
            }  
                else if (data.after(this.getDataExpiracao()))  
                    validacao = false;  
                    else  
                        validacao = true;  	      
                        return validacao;  
    }  
}
