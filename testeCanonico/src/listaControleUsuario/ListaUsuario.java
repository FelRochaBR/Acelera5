
package listaControleUsuario;

import encapsularDados.UsuarioLogin;

public class ListaUsuario 
{
     public UsuarioLogin[] listaUsuario;
    public int lastUsuario;
    
    public ListaUsuario(int tamanho){
        listaUsuario = new UsuarioLogin[tamanho];
        lastUsuario = -1;
       
    }
    
    public void add(UsuarioLogin novoUsuario){
        if(lastUsuario+1 < listaUsuario.length){
            lastUsuario++;
            listaUsuario[lastUsuario] = novoUsuario;
        }
    }
     public void imprimirUsuarios() {
    for (int i = 0; i <= lastUsuario; i++) {
        UsuarioLogin novoUsuario = listaUsuario[i];
        
        if (novoUsuario != null) {
            String email = novoUsuario.getEmail();
            String senha = novoUsuario.getSenha();
            
            System.out.println("Usuário " + i + ":");
            System.out.println("Email: " + email);
            System.out.println("Senha: " + senha);
            System.out.println(); // Separador entre os usuários
        } else {
            System.out.println("Usuário " + i + " é nulo.");
        }
    }
}
     
public boolean verifica (UsuarioLogin login)
{
    
            boolean status = true;
    if (login.getEmail().compareTo("armazenaEmail")==0 && login.getSenha().compareTo("armazenaSenha")==0)
    {
        System.out.println("TESTE");
        status=true;
    } 
    	
        return status;
        

}

    public UsuarioLogin getUsuario(int idNumber){
        if(idNumber < listaUsuario.length){
            return listaUsuario[idNumber];
        }
        else return null;
    }
    
    public int getIdUsuario(String email){
        int idUsuario = -1;
        int aux = -1;
        while(aux<lastUsuario){
            aux++;
            if(listaUsuario[aux].getEmail() == email){
                idUsuario = aux;
                
                break;
            }
        }
        return idUsuario;
    }
    
    public void showUsuarios(){
        for(int i=0; i<=lastUsuario; i++){
            System.out.println(i + " - " +listaUsuario[i].getEmail() + " - " + listaUsuario[i].getSenha() );
        }
    }
    
    public void compareUsuarios(){
        for(int i=0; i<=lastUsuario; i++){
          
        }
    }
     public UsuarioLogin[]getlistaUsuario()
     {
         return listaUsuario;

     }

       public int Login(String email,String senha){
        int idUsuario = -1;
        int aux = -1;
        
        while(aux<lastUsuario){
            aux++;
            if(listaUsuario[aux].getEmail() == email && listaUsuario[aux].getSenha()==senha)
            {
                 System.out.println("TESTE");
                
                break;
            }
        }
        return aux;
    }
}


