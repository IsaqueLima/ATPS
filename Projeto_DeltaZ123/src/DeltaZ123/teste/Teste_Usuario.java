
package DeltaZ123.teste;

import DeltaZ123.classes.Usuario;

public class Teste_Usuario {
    
    public static void main(String[] args){
        
        Usuario usuario = new Usuario();
        
        usuario.setMatriculaUsuario(11223344);
        usuario.setNomeUsuario("Pedro");
        usuario.setLocalTrabalho("Laboratório");
        
        System.out.println("Matricula do Usuário: "+usuario.getMatriculaUsuario());
        System.out.println("Nome: "+usuario.getNomeUsuario());
        System.out.println("Local de Trabalho: "+usuario.getLocalTrabalho());
    }
    
}
