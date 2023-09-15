
package Main;
import encapsularDados.UsuarioLogin;
import listaControleUsuario.ListaUsuario;

public class Principal
{
     public static void main(String args[]){
        ListaUsuario l = new ListaUsuario(2);
        UsuarioLogin u = new UsuarioLogin("teste", "teste");
        UsuarioLogin u1 = new UsuarioLogin("teste1", "teste1");
        UsuarioLogin u2 = new UsuarioLogin("teste2", "teste2");
        UsuarioLogin u3 = new UsuarioLogin("teste3", "teste3");
        
        l.add(u);
        l.add(u1);
        l.add(u2);
        l.add(u3);
        
        l.showUsuarios();
        
        System.out.println();
        
        System.out.println(l.getIdUsuario("teste2"));
    }
    
    
}

