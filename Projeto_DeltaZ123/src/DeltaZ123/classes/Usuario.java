
package DeltaZ123.classes;

public class Usuario {
    //atributos
    private int matriculaUsuario;
    private String nomeUsuario;
    private String localTrabalho;
    
    //construtores
    public Usuario() {
    }
    public Usuario(int matriculaUsuario, String nomeUsuario, String localTrabalho) {
        this.matriculaUsuario = matriculaUsuario;
        this.nomeUsuario = nomeUsuario;
        this.localTrabalho = localTrabalho;
    }
    
    
    //getters & setters
    public int getMatriculaUsuario() {
        return matriculaUsuario;
    }
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    public String getLocalTrabalho() {
        return localTrabalho;
    }
    public void setMatriculaUsuario(int matriculaUsuario) {
        this.matriculaUsuario = matriculaUsuario;
    }
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }
      
}

