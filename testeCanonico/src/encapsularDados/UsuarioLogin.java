
package encapsularDados;

public class UsuarioLogin 
{
      private String email;
      private String senha;
    
    public UsuarioLogin (String email, String senha)
    {
        this.email=email;
        this.senha=senha;
    }
     public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }
    
}
